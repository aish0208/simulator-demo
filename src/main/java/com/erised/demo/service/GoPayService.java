package com.erised.demo.service;

import com.erised.demo.domain.entity.Payment;
import com.erised.demo.domain.repository.PaymentRepository;
import com.erised.demo.model.common.Amount;
import com.erised.demo.model.gopay.request.GoPayCollectRequest;
import com.erised.demo.model.gopay.request.GoPayFetchTokenRequest;
import com.erised.demo.model.gopay.request.GoPayLinkAccountRequest;
import com.erised.demo.model.gopay.response.ErrorDetails;
import com.erised.demo.model.gopay.response.GoPayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoPayService {

    @Autowired
    PaymentRepository paymentRepository;

    /**
     * GoPay Collect Payment
     * @param request
     * @return
     */
    public GoPayResponse collectPayment(GoPayCollectRequest request) {

        GoPayResponse response ;

        // description examples ->
        // collect : success
        // collect : failed : {errorMessage}
        String description = request.getDescription();
        String[] parts = description.split(":");

        if ("success".equalsIgnoreCase(parts[1].trim())) {
            response = new GoPayResponse(true);
            response.setData(GoPayUtils.getCollectPaymentResponseData(request.getAmount(), "GPID100000001"));
            Payment payment = new Payment();
            payment.setPspreference(request.getAdditional_data().get("merchant_order_id"));
            payment.setAcquirerReference("GPID100000001");
            payment.setStatus("Authorised");
            paymentRepository.save(payment);
        } else {
            response = new GoPayResponse(false);
            response.setError(new ErrorDetails(116, "Merchant Not Found"));
        }

        return response;
    }

    /**
     * Link Shopper's GoPay Wallet
     * @param request
     * @return
     */
    public GoPayResponse linkWallet(GoPayLinkAccountRequest request) {
        String redirectUrl = request.getRedirect_url();
        GoPayResponse response ;

        // redirectUrl example : https://test.adyen.com/reference?link:success
        if (redirectUrl.contains("success")){
            response = new GoPayResponse(true);
            response.setData(GoPayUtils.getLinkAccoutResponseData());
        } else if (redirectUrl.contains("fails")) {
            response = new GoPayResponse(false);
            response.setError(new ErrorDetails(105, "User Not Found"));
        } else {
            // return generic failure as we don't know what to do
            response = new GoPayResponse(false);
            response.setError(new ErrorDetails(900, "Internal Server Error"));
        }
        return response;
    }


    /**
     * Fetch GoPay's shopper token
     * @param request
     * @return
     */
    public GoPayResponse fetchToken(GoPayFetchTokenRequest request) {
        if (request.getLink_id().contains("success")) {
            GoPayResponse response = new GoPayResponse(true);
            response.setData(GoPayUtils.getFetchTokenResponseData());
            return response;
        }
        GoPayResponse response = new GoPayResponse(false);
        response.setError(new ErrorDetails(5003, "Linking id not found"));
        return response;
    }

    /**
     * GoPay : get payment details by Adyen's pspreference
     * @param requestId
     * @return
     */
    public GoPayResponse getPaymentById(String requestId) {

        GoPayResponse response ;
        Payment savedPayment = paymentRepository.findByPspReference(requestId);

        if (savedPayment == null) {
            response = new GoPayResponse(false);
            response.setError(new ErrorDetails(3007, "Order Not Found"));
            return response;
        }

        response = new GoPayResponse(true);
        response.setData(GoPayUtils.getCollectPaymentResponseData(new Amount(5000, "IDR"), savedPayment.getAcquirerReference()));

        return response;
    }

}

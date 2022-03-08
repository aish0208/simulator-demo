package com.erised.demo.service;

import com.erised.demo.model.common.Amount;
import com.erised.demo.model.gopay.GoPayPaymentInstructions;
import com.erised.demo.model.gopay.enums.OrderStatus;
import com.erised.demo.model.gopay.response.NextAction;
import com.erised.demo.model.gopay.response.ResponseData;

import java.time.LocalDateTime;

public class GoPayUtils {

    public static ResponseData getCollectPaymentResponseData(Amount amount, String gopayPaymentId) {
        ResponseData data = new ResponseData();
        data.setStatus(OrderStatus.CREATED);
        data.setPayment_id(gopayPaymentId);
        data.setAmount(amount);
        data.setPayment_instructions(new GoPayPaymentInstructions());
        data.setNextAction(NextAction.getDefaultNextAction());
        data.setCreated_at(LocalDateTime.now());
        return data;
    }

    public static ResponseData getLinkAccoutResponseData() {
        ResponseData data = new ResponseData();
        data.setId("gopay-linking-id");
        data.setNextAction(NextAction.getDefaultNextAction());
        return data;
    }

    public static ResponseData getFetchTokenResponseData() {
        ResponseData data = new ResponseData();
        data.setAuth_token("gopay-auth-token");
        data.setGopay_account_id("gopay-testuser001-accountid");
        data.setToken_type("bearer");
        return data;
    }
}

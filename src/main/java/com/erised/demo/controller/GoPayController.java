package com.erised.demo.controller;

import com.erised.demo.model.gopay.request.GoPayCollectRequest;
import com.erised.demo.model.gopay.request.GoPayFetchTokenRequest;
import com.erised.demo.model.gopay.request.GoPayLinkAccountRequest;
import com.erised.demo.model.gopay.response.GoPayResponse;
import com.erised.demo.service.GoPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/erised/api/gopay/v1")
public class GoPayController {

    @Autowired
    GoPayService goPayService;

    @PostMapping("/collect")
    public ResponseEntity<GoPayResponse> collect(@RequestBody GoPayCollectRequest request){
        System.out.println("GoPay Controller :: Collect API ");
        GoPayResponse response = goPayService.collectPayment(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/link")
    public ResponseEntity<GoPayResponse> link(@RequestBody GoPayLinkAccountRequest request){
        System.out.println("GoPay Controller :: Link API ");
        GoPayResponse response = goPayService.linkWallet(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/fetchToken")
    public ResponseEntity<GoPayResponse> fetchToken(@RequestBody GoPayFetchTokenRequest request){
        System.out.println("GoPay Controller :: Fetch Token API");
        GoPayResponse response = goPayService.fetchToken(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/payments/details/{id}")
    public ResponseEntity<GoPayResponse> getDetailsById(String requestId){
        System.out.println("GoPay Controller :: Get Payment Details by ID");
        GoPayResponse response = goPayService.getPaymentById(requestId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }




}
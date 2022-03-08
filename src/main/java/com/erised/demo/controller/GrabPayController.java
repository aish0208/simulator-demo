package com.erised.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/erised/api/grabpay/v1")
public class GrabPayController {

    @GetMapping("/connect")
    public void connect(){
        System.out.println("Connects to GrabPay Controller");
    }

}
package com.erised.demo.model.gopay;


import com.erised.demo.model.common.Amount;

import java.util.Map;

public class GoPayPaymentInstructions {
    private String type;
    private Map<String,String> metadata;
    private String token;
    private Amount amount;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

}

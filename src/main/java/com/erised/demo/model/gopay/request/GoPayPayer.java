package com.erised.demo.model.gopay.request;

import com.erised.demo.model.gopay.GoPayPaymentInstructions;
import com.erised.demo.model.gopay.enums.PayerPayeeType;

import java.util.ArrayList;
import java.util.List;

public class GoPayPayer {

    private static final String DEFAULT_USER_ID = "124567";

    private PayerPayeeType payerType;
    private String id;
    private List<GoPayPaymentInstructions> payment_instructions;

    public GoPayPayer() {
        this.payerType = PayerPayeeType.USER;
        this.id = DEFAULT_USER_ID;
        this.payment_instructions = new ArrayList<>();
    }

    public PayerPayeeType getPayerType() {
        return payerType;
    }

    public void setPayerType(PayerPayeeType payerType) {
        this.payerType = payerType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<GoPayPaymentInstructions> getPayment_instructions() {
        return payment_instructions;
    }

    public void setPayment_instructions(List<GoPayPaymentInstructions> payment_instructions) {
        this.payment_instructions = payment_instructions;
    }


}

package com.erised.demo.model.gopay.request;


import com.erised.demo.model.gopay.enums.PayerPayeeType;

public class GoPayPayee {

    private static final String DEFAULT_PAYEE_ID = "12SP";

    private PayerPayeeType payeeType;
    private String id;

    public GoPayPayee() {
        this.payeeType = PayerPayeeType.MERCHANT;
        this.id = DEFAULT_PAYEE_ID;

    }

    public PayerPayeeType getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(PayerPayeeType payeeType) {
        this.payeeType = payeeType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



}

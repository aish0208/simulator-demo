package com.erised.demo.model.gopay.response;


import com.erised.demo.model.common.Amount;
import com.erised.demo.model.gopay.GoPayPaymentInstructions;
import com.erised.demo.model.gopay.enums.OrderStatus;

import java.time.LocalDateTime;

public class ResponseData {

    // generic fields
    private OrderStatus status;
    private NextAction nextAction;
    private LocalDateTime created_at;

    // collect payment details
    private String payment_id; // GoPay Payment Id ; unique identifier for a payment
    private Amount amount;
    private GoPayPaymentInstructions payment_instructions;

    // linking details
    private String id; // GoPay linking-identifier

    // Fetch Token details
    private String auth_token;
    private String gopay_account_id;
    private String token_type;

    // Challenge details
    private String otp_token;
    private String challenge_id;
    private String type;


    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public GoPayPaymentInstructions getPayment_instructions() {
        return payment_instructions;
    }

    public void setPayment_instructions(GoPayPaymentInstructions payment_instructions) {
        this.payment_instructions = payment_instructions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    public String getGopay_account_id() {
        return gopay_account_id;
    }

    public void setGopay_account_id(String gopay_account_id) {
        this.gopay_account_id = gopay_account_id;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getOtp_token() {
        return otp_token;
    }

    public void setOtp_token(String otp_token) {
        this.otp_token = otp_token;
    }

    public String getChallenge_id() {
        return challenge_id;
    }

    public void setChallenge_id(String challenge_id) {
        this.challenge_id = challenge_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NextAction getNextAction() {
        return nextAction;
    }

    public void setNextAction(NextAction nextAction) {
         this.nextAction = nextAction;
    }
}

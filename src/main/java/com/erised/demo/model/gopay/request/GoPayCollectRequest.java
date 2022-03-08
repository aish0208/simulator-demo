package com.erised.demo.model.gopay.request;



import com.erised.demo.model.common.Amount;

import java.util.Map;

public class GoPayCollectRequest {

    private GoPayPayee payee;
    private GoPayPayer payer;
    private Amount amount;
    private String description;
    private String intent;
    private String channel_type;
    private boolean capture;
    private boolean overdraft;
    private Map<String,String> metadata;
    private String promo_code;
    private String redirect_url;
    private String locale;
    private Map<String,String> additional_data;
    private String payment_method;
    private GoPayOrderSignature order_signature;
    private String valid_till;

    public GoPayPayee getPayee() {
        return payee;
    }

    public void setPayee(GoPayPayee payee) {
        this.payee = payee;
    }

    public GoPayPayer getPayer() {
        return payer;
    }

    public void setPayer(GoPayPayer payer) {
        this.payer = payer;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getChannel_type() {
        return channel_type;
    }

    public void setChannel_type(String channel_type) {
        this.channel_type = channel_type;
    }

    public boolean isCapture() {
        return capture;
    }

    public void setCapture(boolean capture) {
        this.capture = capture;
    }

    public boolean isOverdraft() {
        return overdraft;
    }

    public void setOverdraft(boolean overdraft) {
        this.overdraft = overdraft;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public String getPromo_code() {
        return promo_code;
    }

    public void setPromo_code(String promo_code) {
        this.promo_code = promo_code;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

    public void setRedirect_url(String redirect_url) {
        this.redirect_url = redirect_url;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Map<String, String> getAdditional_data() {
        return additional_data;
    }

    public void setAdditional_data(Map<String, String> additional_data) {
        this.additional_data = additional_data;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public GoPayOrderSignature getOrder_signature() {
        return order_signature;
    }

    public void setOrder_signature(GoPayOrderSignature order_signature) {
        this.order_signature = order_signature;
    }

    public String getValid_till() {
        return valid_till;
    }

    public void setValid_till(String valid_till) {
        this.valid_till = valid_till;
    }


    public GoPayCollectRequest() {

    }




}

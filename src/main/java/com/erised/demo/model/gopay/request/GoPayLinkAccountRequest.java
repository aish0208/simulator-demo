package com.erised.demo.model.gopay.request;


import com.erised.demo.model.gopay.GoPaySuccessParams;

public class GoPayLinkAccountRequest {

    private String merchant_id;
    private String redirect_url;
    private String locale;
    private GoPaySuccessParams successParams;

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
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

    public GoPaySuccessParams getSuccessParams() {
        return successParams;
    }

    public void setSuccessParams(GoPaySuccessParams successParams) {
        this.successParams = successParams;
    }

}

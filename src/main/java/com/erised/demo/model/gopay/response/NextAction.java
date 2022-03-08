package com.erised.demo.model.gopay.response;

public class NextAction {

    private String redirect_to_url;
    private String redirect_to_deeplink;
    private String reference_id;

    public NextAction(){
    }

    public static NextAction getDefaultNextAction(){
        NextAction nextAction = new NextAction();
        nextAction.setRedirect_to_url("https://gopaysimulatorapi.com/validate/user/xad22zz0d");
        nextAction.setRedirect_to_deeplink("some-deeplink");
        nextAction.setReference_id("some-reference-id");
        return nextAction;
    }

    public String getRedirect_to_url() {
        return redirect_to_url;
    }

    public void setRedirect_to_url(String redirect_to_url) {
        this.redirect_to_url = redirect_to_url;
    }

    public String getRedirect_to_deeplink() {
        return redirect_to_deeplink;
    }

    public void setRedirect_to_deeplink(String redirect_to_deeplink) {
        this.redirect_to_deeplink = redirect_to_deeplink;
    }

    public String getReference_id() {
        return reference_id;
    }

    public void setReference_id(String reference_id) {
        this.reference_id = reference_id;
    }


}

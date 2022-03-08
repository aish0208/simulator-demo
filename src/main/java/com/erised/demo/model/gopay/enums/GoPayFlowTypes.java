package com.erised.demo.model.gopay.enums;

import org.springframework.lang.Nullable;

public enum GoPayFlowTypes {
    STANDARD_CHECKOUT,
    APP_INVOKE_CHECKOUT,
    GUEST_CHECKOUT;

    public static boolean isValidFlow(@Nullable String flowName) {
        for (GoPayFlowTypes flowType: GoPayFlowTypes.values()) {
            if (flowType.name().equalsIgnoreCase(flowName)) {
                return true;
            }
        }
        return false;
    }
}

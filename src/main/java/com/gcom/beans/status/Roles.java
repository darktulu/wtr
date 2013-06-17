package com.gcom.beans.status;

import java.io.Serializable;

public enum Roles implements Serializable {
    WTR("ROLE_WTR"),
    HR("ROLE_RH"),
    PM("ROLE_PM");

    private String value;

    private Roles(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

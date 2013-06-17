package com.gcom.beans.status;

import java.io.Serializable;

public enum Status implements Serializable {
    PENDING("Pending"),
    APPROUVED("Approuved"),
    OPEND("Open"),
    REJECTED("Rejected");

    private String value;

    private Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

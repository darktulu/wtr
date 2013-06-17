package com.gcom.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AuthoritiesId implements Serializable {
    private String authority;
    private String username;

    public AuthoritiesId() {
    }

    public AuthoritiesId(String authority, String username) {
        this.authority = authority;
        this.username = username;
    }

    @Column(name = "authority", nullable = false, length = 40)
    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Column(name = "username", nullable = false, length = 45)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (!(other instanceof AuthoritiesId)) return false;
        AuthoritiesId castOther = (AuthoritiesId) other;

        return ((getAuthority() == castOther.getAuthority()) || ((getAuthority() != null) && (castOther.getAuthority() != null) && (getAuthority().equals(castOther.getAuthority())))) && ((getUsername() == castOther.getUsername()) || ((getUsername() != null) && (castOther.getUsername() != null) && (getUsername().equals(castOther.getUsername()))));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getAuthority() == null ? 0 : getAuthority().hashCode());
        result = 37 * result + (getUsername() == null ? 0 : getUsername().hashCode());
        return result;
    }
}

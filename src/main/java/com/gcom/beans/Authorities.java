package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "authorities")
public class Authorities implements Serializable {
    private AuthoritiesId id;
    private Users users;

    public Authorities() {
    }

    public Authorities(AuthoritiesId id, Users users) {
        this.id = id;
        this.users = users;
    }

    @EmbeddedId
    @AttributeOverrides({@javax.persistence.AttributeOverride(name = "authority",
            column = @javax.persistence.Column(name = "authority", nullable = false, length = 40)),
            @javax.persistence.AttributeOverride(name = "username",
                    column = @javax.persistence.Column(name = "username", nullable = false, length = 45))})
    public AuthoritiesId getId() {
        return this.id;
    }

    public void setId(AuthoritiesId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username", nullable = false, insertable = false, updatable = false)
    public Users getUsers() {
        return this.users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}

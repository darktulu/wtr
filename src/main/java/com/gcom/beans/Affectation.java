package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "affectation")
public class Affectation implements Serializable {
    private Integer idaffectation;
    private Users usersByUsersHr;
    private Lob lob;
    private Users usersByUsersLm;
    private Users usersByUsersUsername;

    public Affectation() {
    }

    public Affectation(Users usersByUsersUsername) {
        this.usersByUsersUsername = usersByUsersUsername;
    }

    public Affectation(Users usersByUsersHr, Lob lob, Users usersByUsersLm, Users usersByUsersUsername) {
        this.usersByUsersHr = usersByUsersHr;
        this.lob = lob;
        this.usersByUsersLm = usersByUsersLm;
        this.usersByUsersUsername = usersByUsersUsername;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idaffectation", unique = true, nullable = false)
    public Integer getIdaffectation() {
        return this.idaffectation;
    }

    public void setIdaffectation(Integer idaffectation) {
        this.idaffectation = idaffectation;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_hr")
    public Users getUsersByUsersHr() {
        return this.usersByUsersHr;
    }

    public void setUsersByUsersHr(Users usersByUsersHr) {
        this.usersByUsersHr = usersByUsersHr;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lob_idlob")
    public Lob getLob() {
        return this.lob;
    }

    public void setLob(Lob lob) {
        this.lob = lob;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_lm")
    public Users getUsersByUsersLm() {
        return this.usersByUsersLm;
    }

    public void setUsersByUsersLm(Users usersByUsersLm) {
        this.usersByUsersLm = usersByUsersLm;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_username", nullable = false)
    public Users getUsersByUsersUsername() {
        return this.usersByUsersUsername;
    }

    public void setUsersByUsersUsername(Users usersByUsersUsername) {
        this.usersByUsersUsername = usersByUsersUsername;
    }
}

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Affectation
 * JD-Core Version:    0.6.2
 */
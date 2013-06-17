package com.gcom.beans;

public class User {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private boolean users;
    private boolean invoice;
    private boolean buy;
    private boolean admin;
    private boolean ome;
    private boolean wtr;

    public boolean isAdmin() {
        return this.admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBuy() {
        return this.buy;
    }

    public void setBuy(boolean buy) {
        this.buy = buy;
    }

    public boolean isInvoice() {
        return this.invoice;
    }

    public void setInvoice(boolean invoice) {
        this.invoice = invoice;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isUsers() {
        return this.users;
    }

    public void setUsers(boolean users) {
        this.users = users;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isOme() {
        return this.ome;
    }

    public void setOme(boolean ome) {
        this.ome = ome;
    }

    public boolean isWtr() {
        return this.wtr;
    }

    public void setWtr(boolean wtr) {
        this.wtr = wtr;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", users=" + users +
                ", invoice=" + invoice +
                ", buy=" + buy +
                ", admin=" + admin +
                ", ome=" + ome +
                ", wtr=" + wtr +
                '}';
    }
}

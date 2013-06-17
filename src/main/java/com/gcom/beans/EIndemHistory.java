package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "eindemhistory")
public class EIndemHistory implements Serializable {

    @Id
    @GeneratedValue
    private int idindem;
    private String username;
    private int year;
    private int month;
    private String type;
    private double amounth;

    @ManyToOne
    private SalaryHistory salaryHistory;

    @Column(name = "username", nullable = false, length = 300)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "year")
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Column(name = "month")
    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Column(name = "type", length = 300)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "amounth", precision = 22, scale = 0)
    public double getAmounth() {
        return this.amounth;
    }

    public void setAmounth(double amounth) {
        this.amounth = amounth;
    }

    public int getIdindem() {
        return this.idindem;
    }

    public void setIdindem(int idindem) {
        this.idindem = idindem;
    }

    public SalaryHistory getSalaryHistory() {
        return this.salaryHistory;
    }

    public void setSalaryHistory(SalaryHistory salaryHistory) {
        this.salaryHistory = salaryHistory;
    }
}

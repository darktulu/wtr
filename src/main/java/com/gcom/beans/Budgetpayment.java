package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "budgetpayment")
public class Budgetpayment implements Serializable {
    private Integer idbudgetpayment;
    private Budget budget;
    private String status;
    private String nature;
    private String mode;
    private Double amount;
    private Double percentage;
    private String chequeNb;
    private String chequeDetails;

    public Budgetpayment() {
    }

    public Budgetpayment(Budget budget) {
        this.budget = budget;
    }

    public Budgetpayment(Budget budget, String status, String nature, String mode, Double amount, Double percentage, String chequeNb, String chequeDetails) {
        this.budget = budget;
        this.status = status;
        this.nature = nature;
        this.mode = mode;
        this.amount = amount;
        this.percentage = percentage;
        this.chequeNb = chequeNb;
        this.chequeDetails = chequeDetails;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbudgetpayment", unique = true, nullable = false)
    public Integer getIdbudgetpayment() {
        return this.idbudgetpayment;
    }

    public void setIdbudgetpayment(Integer idbudgetpayment) {
        this.idbudgetpayment = idbudgetpayment;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "budget_idbudget", nullable = false)
    public Budget getBudget() {
        return this.budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    @Column(name = "status", length = 45)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "nature", length = 45)
    public String getNature() {
        return this.nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    @Column(name = "mode", length = 45)
    public String getMode() {
        return this.mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Column(name = "amount", precision = 22, scale = 0)
    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Column(name = "percentage", precision = 22, scale = 0)
    public Double getPercentage() {
        return this.percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Column(name = "chequeNb", length = 100)
    public String getChequeNb() {
        return this.chequeNb;
    }

    public void setChequeNb(String chequeNb) {
        this.chequeNb = chequeNb;
    }

    @Column(name = "chequeDetails", length = 500)
    public String getChequeDetails() {
        return this.chequeDetails;
    }

    public void setChequeDetails(String chequeDetails) {
        this.chequeDetails = chequeDetails;
    }
}

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Budgetpayment
 * JD-Core Version:    0.6.2
 */
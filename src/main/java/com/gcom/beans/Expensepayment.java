package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "expensepayment")
public class Expensepayment implements Serializable {
    private Integer idexpensepayment;
    private Budgetdetail budgetdetail;
    private Date dateExpense;
    private String type;
    private String description;
    private String benificiary;
    private String period;
    private Double quantity;
    private Double totalCost;
    private String status;

    public Expensepayment() {
    }

    public Expensepayment(Budgetdetail budgetdetail) {
        this.budgetdetail = budgetdetail;
    }

    public Expensepayment(Budgetdetail budgetdetail, Date dateExpense, String type, String description, String benificiary, String period, Double quantity, Double totalCost, String status) {
        this.budgetdetail = budgetdetail;
        this.dateExpense = dateExpense;
        this.type = type;
        this.description = description;
        this.benificiary = benificiary;
        this.period = period;
        this.quantity = quantity;
        this.totalCost = totalCost;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idexpensepayment", unique = true, nullable = false)
    public Integer getIdexpensepayment() {
        return this.idexpensepayment;
    }

    public void setIdexpensepayment(Integer idexpensepayment) {
        this.idexpensepayment = idexpensepayment;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "budgetdetail_idbudgetdetail", nullable = false)
    public Budgetdetail getBudgetdetail() {
        return this.budgetdetail;
    }

    public void setBudgetdetail(Budgetdetail budgetdetail) {
        this.budgetdetail = budgetdetail;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dateExpense", length = 10)
    public Date getDateExpense() {
        return this.dateExpense;
    }

    public void setDateExpense(Date dateExpense) {
        this.dateExpense = dateExpense;
    }

    @Column(name = "type", length = 45)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "description", length = 500)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "benificiary", length = 100)
    public String getBenificiary() {
        return this.benificiary;
    }

    public void setBenificiary(String benificiary) {
        this.benificiary = benificiary;
    }

    @Column(name = "period", length = 45)
    public String getPeriod() {
        return this.period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Column(name = "quantity", precision = 22, scale = 0)
    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Column(name = "totalCost", precision = 22, scale = 0)
    public Double getTotalCost() {
        return this.totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    @Column(name = "status", length = 45)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

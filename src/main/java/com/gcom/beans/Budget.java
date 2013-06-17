package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "budget")
public class Budget implements Serializable {
    private Integer idbudget;
    private Project project;
    private String reference;
    private String description;
    private Date startDate;
    private Date endDate;
    private String current;
    private String status;
    private Set<Budgetpayment> budgetpayments = new HashSet(0);
    private Set<Budgetdetail> budgetdetails = new HashSet(0);

    public Budget() {
    }

    public Budget(Project project) {
        this.project = project;
    }

    public Budget(Project project, String reference, String description, Date startDate, Date endDate, String current, String status, Set<Budgetpayment> budgetpayments, Set<Budgetdetail> budgetdetails) {
        this.project = project;
        this.reference = reference;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.current = current;
        this.status = status;
        this.budgetpayments = budgetpayments;
        this.budgetdetails = budgetdetails;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbudget", unique = true, nullable = false)
    public Integer getIdbudget() {
        return this.idbudget;
    }

    public void setIdbudget(Integer idbudget) {
        this.idbudget = idbudget;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_idproject", nullable = false)
    public Project getProject() {
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Column(name = "reference", length = 45)
    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Column(name = "description", length = 500)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "startDate", length = 10)
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "endDate", length = 10)
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Column(name = "current", length = 45)
    public String getCurrent() {
        return this.current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    @Column(name = "status", length = 45)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "budget")
    public Set<Budgetpayment> getBudgetpayments() {
        return this.budgetpayments;
    }

    public void setBudgetpayments(Set<Budgetpayment> budgetpayments) {
        this.budgetpayments = budgetpayments;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "budget")
    public Set<Budgetdetail> getBudgetdetails() {
        return this.budgetdetails;
    }

    public void setBudgetdetails(Set<Budgetdetail> budgetdetails) {
        this.budgetdetails = budgetdetails;
    }
}

package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "contract")
public class Contract implements Serializable {
    private Integer idcontract;
    private Customer customer;
    private String reference;
    private String description;
    private String year;
    private Date startDate;
    private Date expiryDate;
    private Double value;
    private String linkGed;
    private String status;
    private Set<Po> pos = new HashSet(0);

    public Contract() {
    }

    public Contract(Customer customer) {
        this.customer = customer;
    }

    public Contract(Customer customer, String reference, String description, String year, Date startDate, Date expiryDate, Double value, String linkGed, String status, Set<Po> pos) {
        this.customer = customer;
        this.reference = reference;
        this.description = description;
        this.year = year;
        this.startDate = startDate;
        this.expiryDate = expiryDate;
        this.value = value;
        this.linkGed = linkGed;
        this.status = status;
        this.pos = pos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontract", unique = true, nullable = false)
    public Integer getIdcontract() {
        return this.idcontract;
    }

    public void setIdcontract(Integer idcontract) {
        this.idcontract = idcontract;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_idcustomer", nullable = false)
    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Column(name = "reference", length = 45)
    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Column(name = "description", length = 450)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "year", length = 45)
    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
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
    @Column(name = "expiryDate", length = 10)
    public Date getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Column(name = "value", precision = 22, scale = 0)
    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Column(name = "linkGed", length = 500)
    public String getLinkGed() {
        return this.linkGed;
    }

    public void setLinkGed(String linkGed) {
        this.linkGed = linkGed;
    }

    @Column(name = "status", length = 45)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "contract")
    public Set<Po> getPos() {
        return this.pos;
    }

    public void setPos(Set<Po> pos) {
        this.pos = pos;
    }
}

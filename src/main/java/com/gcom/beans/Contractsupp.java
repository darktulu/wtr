package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "contractsupp")
public class Contractsupp implements Serializable {
    private Integer idcontractsupp;
    private Supplier supplier;
    private String reference;
    private String description;
    private String year;
    private Date startDate;
    private Date expiryDate;
    private Double value;
    private String linkGed;
    private String status;

    public Contractsupp() {
    }

    public Contractsupp(Supplier supplier, String reference,
                        String description, String year, Date startDate, Date expiryDate,
                        Double value, String linkGed, String status) {
        this.supplier = supplier;
        this.reference = reference;
        this.description = description;
        this.year = year;
        this.startDate = startDate;
        this.expiryDate = expiryDate;
        this.value = value;
        this.linkGed = linkGed;
        this.status = status;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontractsupp", unique = true, nullable = false)
    public Integer getIdcontractsupp() {
        return this.idcontractsupp;
    }

    public void setIdcontractsupp(Integer idcontractsupp) {
        this.idcontractsupp = idcontractsupp;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_idsupplier", nullable = false)
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}

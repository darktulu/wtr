package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "podetails")
public class Podetails implements Serializable {
    private Integer idpoDetails;
    private Po po;
    private String description;
    private Double unit;
    private Double unitPrice;
    private Double totalPrice;
    private String currency;
    private String status;
    private String reference;
    private String unite;
    private Set<Acceptancedetails> acceptancedetailses = new HashSet(0);

    public Podetails() {
    }

    public Podetails(Po po) {
        this.po = po;
    }

    public Podetails(Po po, String description, Double unit, Double unitPrice, Double totalPrice, String currency, String status, String reference, String unite, Set<Acceptancedetails> acceptancedetailses) {
        this.po = po;
        this.description = description;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.currency = currency;
        this.status = status;
        this.reference = reference;
        this.unite = unite;
        this.acceptancedetailses = acceptancedetailses;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpoDetails", unique = true, nullable = false)
    public Integer getIdpoDetails() {
        return this.idpoDetails;
    }

    public void setIdpoDetails(Integer idpoDetails) {
        this.idpoDetails = idpoDetails;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "po_idpo", nullable = false)
    public Po getPo() {
        return this.po;
    }

    public void setPo(Po po) {
        this.po = po;
    }

    @Column(name = "description", length = 5000)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "unit", precision = 22, scale = 0)
    public Double getUnit() {
        return this.unit;
    }

    public void setUnit(Double unit) {
        this.unit = unit;
    }

    @Column(name = "unitPrice", precision = 22, scale = 0)
    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Column(name = "totalPrice", precision = 22, scale = 0)
    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Column(name = "currency", length = 45)
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Column(name = "status", length = 45)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "reference", length = 100)
    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Column(name = "unite", length = 45)
    public String getUnite() {
        return this.unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "podetails")
    public Set<Acceptancedetails> getAcceptancedetailses() {
        return this.acceptancedetailses;
    }

    public void setAcceptancedetailses(Set<Acceptancedetails> acceptancedetailses) {
        this.acceptancedetailses = acceptancedetailses;
    }
}

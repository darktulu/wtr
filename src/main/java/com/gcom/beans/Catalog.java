package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "catalog")
public class Catalog implements Serializable {
    private Integer idcatalog;
    private Supplier supplier;
    private String name;
    private String currency;
    private Integer idcontract;
    private Set<Catalogdetail> catalogdetails = new HashSet(0);

    public Catalog() {
    }

    public Catalog(Supplier supplier, String name, String currency, Integer idcontract, Set<Catalogdetail> catalogdetails) {
        this.supplier = supplier;
        this.name = name;
        this.currency = currency;
        this.idcontract = idcontract;
        this.catalogdetails = catalogdetails;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcatalog", unique = true, nullable = false)
    public Integer getIdcatalog() {
        return this.idcatalog;
    }

    public void setIdcatalog(Integer idcatalog) {
        this.idcatalog = idcatalog;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_idsupplier")
    public Supplier getSupplier() {
        return this.supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "currency", length = 45)
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Column(name = "idcontract")
    public Integer getIdcontract() {
        return this.idcontract;
    }

    public void setIdcontract(Integer idcontract) {
        this.idcontract = idcontract;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "catalog")
    public Set<Catalogdetail> getCatalogdetails() {
        return this.catalogdetails;
    }

    public void setCatalogdetails(Set<Catalogdetail> catalogdetails) {
        this.catalogdetails = catalogdetails;
    }
}

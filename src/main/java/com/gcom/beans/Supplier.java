package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "supplier")
public class Supplier implements Serializable {
    private Integer idsupplier;
    private String name;
    private String category;
    private String country;
    private String description;
    private String adress;
    private String contact;
    private String ri;
    private String vat;
    private String bankName1;
    private String bankName2;
    private String bankAccount1;
    private String bankAccoun2;
    private String linkGed;
    private String code;
    private Set<Catalog> catalogs = new HashSet(0);
    private Set<Po> pos = new HashSet(0);

    public Supplier() {
    }

    public Supplier(String name, String category, String country, String description, String adress, String contact, String ri, String vat, String bankName1, String bankName2, String bankAccount1, String bankAccoun2, String linkGed, String code, Set<Catalog> catalogs, Set<Po> pos) {
        this.name = name;
        this.category = category;
        this.country = country;
        this.description = description;
        this.adress = adress;
        this.contact = contact;
        this.ri = ri;
        this.vat = vat;
        this.bankName1 = bankName1;
        this.bankName2 = bankName2;
        this.bankAccount1 = bankAccount1;
        this.bankAccoun2 = bankAccoun2;
        this.linkGed = linkGed;
        this.code = code;
        this.catalogs = catalogs;
        this.pos = pos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsupplier", unique = true, nullable = false)
    public Integer getIdsupplier() {
        return this.idsupplier;
    }

    public void setIdsupplier(Integer idsupplier) {
        this.idsupplier = idsupplier;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "category", length = 45)
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name = "country", length = 45)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "description", length = 500)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "adress", length = 999)
    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Column(name = "contact", length = 999)
    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Column(name = "ri", length = 500)
    public String getRi() {
        return this.ri;
    }

    public void setRi(String ri) {
        this.ri = ri;
    }

    @Column(name = "vat", length = 500)
    public String getVat() {
        return this.vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    @Column(name = "bankName1", length = 500)
    public String getBankName1() {
        return this.bankName1;
    }

    public void setBankName1(String bankName1) {
        this.bankName1 = bankName1;
    }

    @Column(name = "bankName2", length = 500)
    public String getBankName2() {
        return this.bankName2;
    }

    public void setBankName2(String bankName2) {
        this.bankName2 = bankName2;
    }

    @Column(name = "bankAccount1", length = 500)
    public String getBankAccount1() {
        return this.bankAccount1;
    }

    public void setBankAccount1(String bankAccount1) {
        this.bankAccount1 = bankAccount1;
    }

    @Column(name = "bankAccoun2", length = 500)
    public String getBankAccoun2() {
        return this.bankAccoun2;
    }

    public void setBankAccoun2(String bankAccoun2) {
        this.bankAccoun2 = bankAccoun2;
    }

    @Column(name = "linkGed", length = 500)
    public String getLinkGed() {
        return this.linkGed;
    }

    public void setLinkGed(String linkGed) {
        this.linkGed = linkGed;
    }

    @Column(name = "code", length = 45)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "supplier")
    public Set<Catalog> getCatalogs() {
        return this.catalogs;
    }

    public void setCatalogs(Set<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "supplier")
    public Set<Po> getPos() {
        return this.pos;
    }

    public void setPos(Set<Po> pos) {
        this.pos = pos;
    }
}

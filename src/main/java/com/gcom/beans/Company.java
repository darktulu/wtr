package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "company")
public class Company implements Serializable {
    private Integer idcompany;
    private String name;
    private String country;
    private String region;
    private String type;
    private String sector;
    private String ri;
    private String cnss;
    private String vat;
    private String address;
    private String contact;
    private String ceo;
    private String cto;
    private String cfo;
    private String coo;
    private String linkGed;
    private String accountant;
    private String assistante;
    private Set<Bu> bus = new HashSet(0);
    private Set<Bankaccount> bankaccounts = new HashSet(0);

    public Company() {
    }

    public Company(String name, String country, String region, String type, String sector, String ri, String cnss, String vat, String address, String contact, String ceo, String cto, String cfo, String coo, String linkGed, String accountant, String assistante, Set<Bu> bus, Set<Bankaccount> bankaccounts) {
        this.name = name;
        this.country = country;
        this.region = region;
        this.type = type;
        this.sector = sector;
        this.ri = ri;
        this.cnss = cnss;
        this.vat = vat;
        this.address = address;
        this.contact = contact;
        this.ceo = ceo;
        this.cto = cto;
        this.cfo = cfo;
        this.coo = coo;
        this.linkGed = linkGed;
        this.accountant = accountant;
        this.assistante = assistante;
        this.bus = bus;
        this.bankaccounts = bankaccounts;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcompany", unique = true, nullable = false)
    public Integer getIdcompany() {
        return this.idcompany;
    }

    public void setIdcompany(Integer idcompany) {
        this.idcompany = idcompany;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "country", length = 45)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "region", length = 45)
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Column(name = "type", length = 45)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "sector", length = 45)
    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Column(name = "ri", length = 45)
    public String getRi() {
        return this.ri;
    }

    public void setRi(String ri) {
        this.ri = ri;
    }

    @Column(name = "cnss", length = 45)
    public String getCnss() {
        return this.cnss;
    }

    public void setCnss(String cnss) {
        this.cnss = cnss;
    }

    @Column(name = "vat", length = 45)
    public String getVat() {
        return this.vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    @Column(name = "address", length = 999)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "contact", length = 999)
    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Column(name = "ceo", length = 45)
    public String getCeo() {
        return this.ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    @Column(name = "cto", length = 45)
    public String getCto() {
        return this.cto;
    }

    public void setCto(String cto) {
        this.cto = cto;
    }

    @Column(name = "cfo", length = 45)
    public String getCfo() {
        return this.cfo;
    }

    public void setCfo(String cfo) {
        this.cfo = cfo;
    }

    @Column(name = "coo", length = 45)
    public String getCoo() {
        return this.coo;
    }

    public void setCoo(String coo) {
        this.coo = coo;
    }

    @Column(name = "linkGed", length = 500)
    public String getLinkGed() {
        return this.linkGed;
    }

    public void setLinkGed(String linkGed) {
        this.linkGed = linkGed;
    }

    @Column(name = "accountant", length = 45)
    public String getAccountant() {
        return this.accountant;
    }

    public void setAccountant(String accountant) {
        this.accountant = accountant;
    }

    @Column(name = "assistante", length = 45)
    public String getAssistante() {
        return this.assistante;
    }

    public void setAssistante(String assistante) {
        this.assistante = assistante;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "company")
    public Set<Bu> getBus() {
        return this.bus;
    }

    public void setBus(Set<Bu> bus) {
        this.bus = bus;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "company")
    public Set<Bankaccount> getBankaccounts() {
        return this.bankaccounts;
    }

    public void setBankaccounts(Set<Bankaccount> bankaccounts) {
        this.bankaccounts = bankaccounts;
    }
}

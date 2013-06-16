/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="company")
/*     */ public class Company
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idcompany;
/*     */   private String name;
/*     */   private String country;
/*     */   private String region;
/*     */   private String type;
/*     */   private String sector;
/*     */   private String ri;
/*     */   private String cnss;
/*     */   private String vat;
/*     */   private String address;
/*     */   private String contact;
/*     */   private String ceo;
/*     */   private String cto;
/*     */   private String cfo;
/*     */   private String coo;
/*     */   private String linkGed;
/*     */   private String accountant;
/*     */   private String assistante;
/*  41 */   private Set<Bu> bus = new HashSet(0);
/*  42 */   private Set<Bankaccount> bankaccounts = new HashSet(0);
/*     */ 
/*     */   public Company() {
/*     */   }
/*     */ 
/*     */   public Company(String name, String country, String region, String type, String sector, String ri, String cnss, String vat, String address, String contact, String ceo, String cto, String cfo, String coo, String linkGed, String accountant, String assistante, Set<Bu> bus, Set<Bankaccount> bankaccounts) {
/*  48 */     this.name = name;
/*  49 */     this.country = country;
/*  50 */     this.region = region;
/*  51 */     this.type = type;
/*  52 */     this.sector = sector;
/*  53 */     this.ri = ri;
/*  54 */     this.cnss = cnss;
/*  55 */     this.vat = vat;
/*  56 */     this.address = address;
/*  57 */     this.contact = contact;
/*  58 */     this.ceo = ceo;
/*  59 */     this.cto = cto;
/*  60 */     this.cfo = cfo;
/*  61 */     this.coo = coo;
/*  62 */     this.linkGed = linkGed;
/*  63 */     this.accountant = accountant;
/*  64 */     this.assistante = assistante;
/*  65 */     this.bus = bus;
/*  66 */     this.bankaccounts = bankaccounts;
/*     */   }
/*  73 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idcompany", unique=true, nullable=false)
/*     */   public Integer getIdcompany() { return this.idcompany; }
/*     */ 
/*     */   public void setIdcompany(Integer idcompany)
/*     */   {
/*  77 */     this.idcompany = idcompany;
/*     */   }
/*     */ 
/*     */   @Column(name="name", length=45)
/*     */   public String getName() {
/*  82 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String name) {
/*  86 */     this.name = name;
/*     */   }
/*     */ 
/*     */   @Column(name="country", length=45)
/*     */   public String getCountry() {
/*  91 */     return this.country;
/*     */   }
/*     */ 
/*     */   public void setCountry(String country) {
/*  95 */     this.country = country;
/*     */   }
/*     */ 
/*     */   @Column(name="region", length=45)
/*     */   public String getRegion() {
/* 100 */     return this.region;
/*     */   }
/*     */ 
/*     */   public void setRegion(String region) {
/* 104 */     this.region = region;
/*     */   }
/*     */ 
/*     */   @Column(name="type", length=45)
/*     */   public String getType() {
/* 109 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String type) {
/* 113 */     this.type = type;
/*     */   }
/*     */ 
/*     */   @Column(name="sector", length=45)
/*     */   public String getSector() {
/* 118 */     return this.sector;
/*     */   }
/*     */ 
/*     */   public void setSector(String sector) {
/* 122 */     this.sector = sector;
/*     */   }
/*     */ 
/*     */   @Column(name="ri", length=45)
/*     */   public String getRi() {
/* 127 */     return this.ri;
/*     */   }
/*     */ 
/*     */   public void setRi(String ri) {
/* 131 */     this.ri = ri;
/*     */   }
/*     */ 
/*     */   @Column(name="cnss", length=45)
/*     */   public String getCnss() {
/* 136 */     return this.cnss;
/*     */   }
/*     */ 
/*     */   public void setCnss(String cnss) {
/* 140 */     this.cnss = cnss;
/*     */   }
/*     */ 
/*     */   @Column(name="vat", length=45)
/*     */   public String getVat() {
/* 145 */     return this.vat;
/*     */   }
/*     */ 
/*     */   public void setVat(String vat) {
/* 149 */     this.vat = vat;
/*     */   }
/*     */ 
/*     */   @Column(name="address", length=999)
/*     */   public String getAddress() {
/* 154 */     return this.address;
/*     */   }
/*     */ 
/*     */   public void setAddress(String address) {
/* 158 */     this.address = address;
/*     */   }
/*     */ 
/*     */   @Column(name="contact", length=999)
/*     */   public String getContact() {
/* 163 */     return this.contact;
/*     */   }
/*     */ 
/*     */   public void setContact(String contact) {
/* 167 */     this.contact = contact;
/*     */   }
/*     */ 
/*     */   @Column(name="ceo", length=45)
/*     */   public String getCeo() {
/* 172 */     return this.ceo;
/*     */   }
/*     */ 
/*     */   public void setCeo(String ceo) {
/* 176 */     this.ceo = ceo;
/*     */   }
/*     */ 
/*     */   @Column(name="cto", length=45)
/*     */   public String getCto() {
/* 181 */     return this.cto;
/*     */   }
/*     */ 
/*     */   public void setCto(String cto) {
/* 185 */     this.cto = cto;
/*     */   }
/*     */ 
/*     */   @Column(name="cfo", length=45)
/*     */   public String getCfo() {
/* 190 */     return this.cfo;
/*     */   }
/*     */ 
/*     */   public void setCfo(String cfo) {
/* 194 */     this.cfo = cfo;
/*     */   }
/*     */ 
/*     */   @Column(name="coo", length=45)
/*     */   public String getCoo() {
/* 199 */     return this.coo;
/*     */   }
/*     */ 
/*     */   public void setCoo(String coo) {
/* 203 */     this.coo = coo;
/*     */   }
/*     */ 
/*     */   @Column(name="linkGed", length=500)
/*     */   public String getLinkGed() {
/* 208 */     return this.linkGed;
/*     */   }
/*     */ 
/*     */   public void setLinkGed(String linkGed) {
/* 212 */     this.linkGed = linkGed;
/*     */   }
/*     */ 
/*     */   @Column(name="accountant", length=45)
/*     */   public String getAccountant() {
/* 217 */     return this.accountant;
/*     */   }
/*     */ 
/*     */   public void setAccountant(String accountant) {
/* 221 */     this.accountant = accountant;
/*     */   }
/*     */ 
/*     */   @Column(name="assistante", length=45)
/*     */   public String getAssistante() {
/* 226 */     return this.assistante;
/*     */   }
/*     */ 
/*     */   public void setAssistante(String assistante) {
/* 230 */     this.assistante = assistante;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="company")
/*     */   public Set<Bu> getBus() {
/* 235 */     return this.bus;
/*     */   }
/*     */ 
/*     */   public void setBus(Set<Bu> bus) {
/* 239 */     this.bus = bus;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="company")
/*     */   public Set<Bankaccount> getBankaccounts() {
/* 244 */     return this.bankaccounts;
/*     */   }
/*     */ 
/*     */   public void setBankaccounts(Set<Bankaccount> bankaccounts) {
/* 248 */     this.bankaccounts = bankaccounts;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Company
 * JD-Core Version:    0.6.2
 */
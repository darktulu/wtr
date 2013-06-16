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
/*     */ @Table(name="supplier")
/*     */ public class Supplier
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idsupplier;
/*     */   private String name;
/*     */   private String category;
/*     */   private String country;
/*     */   private String description;
/*     */   private String adress;
/*     */   private String contact;
/*     */   private String ri;
/*     */   private String vat;
/*     */   private String bankName1;
/*     */   private String bankName2;
/*     */   private String bankAccount1;
/*     */   private String bankAccoun2;
/*     */   private String linkGed;
/*     */   private String code;
/*  38 */   private Set<Catalog> catalogs = new HashSet(0);
/*  39 */   private Set<Po> pos = new HashSet(0);
/*     */ 
/*     */   public Supplier() {
/*     */   }
/*     */ 
/*     */   public Supplier(String name, String category, String country, String description, String adress, String contact, String ri, String vat, String bankName1, String bankName2, String bankAccount1, String bankAccoun2, String linkGed, String code, Set<Catalog> catalogs, Set<Po> pos) {
/*  45 */     this.name = name;
/*  46 */     this.category = category;
/*  47 */     this.country = country;
/*  48 */     this.description = description;
/*  49 */     this.adress = adress;
/*  50 */     this.contact = contact;
/*  51 */     this.ri = ri;
/*  52 */     this.vat = vat;
/*  53 */     this.bankName1 = bankName1;
/*  54 */     this.bankName2 = bankName2;
/*  55 */     this.bankAccount1 = bankAccount1;
/*  56 */     this.bankAccoun2 = bankAccoun2;
/*  57 */     this.linkGed = linkGed;
/*  58 */     this.code = code;
/*  59 */     this.catalogs = catalogs;
/*  60 */     this.pos = pos;
/*     */   }
/*  67 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idsupplier", unique=true, nullable=false)
/*     */   public Integer getIdsupplier() { return this.idsupplier; }
/*     */ 
/*     */   public void setIdsupplier(Integer idsupplier)
/*     */   {
/*  71 */     this.idsupplier = idsupplier;
/*     */   }
/*     */ 
/*     */   @Column(name="name", length=45)
/*     */   public String getName() {
/*  76 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String name) {
/*  80 */     this.name = name;
/*     */   }
/*     */ 
/*     */   @Column(name="category", length=45)
/*     */   public String getCategory() {
/*  85 */     return this.category;
/*     */   }
/*     */ 
/*     */   public void setCategory(String category) {
/*  89 */     this.category = category;
/*     */   }
/*     */ 
/*     */   @Column(name="country", length=45)
/*     */   public String getCountry() {
/*  94 */     return this.country;
/*     */   }
/*     */ 
/*     */   public void setCountry(String country) {
/*  98 */     this.country = country;
/*     */   }
/*     */ 
/*     */   @Column(name="description", length=500)
/*     */   public String getDescription() {
/* 103 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void setDescription(String description) {
/* 107 */     this.description = description;
/*     */   }
/*     */ 
/*     */   @Column(name="adress", length=999)
/*     */   public String getAdress() {
/* 112 */     return this.adress;
/*     */   }
/*     */ 
/*     */   public void setAdress(String adress) {
/* 116 */     this.adress = adress;
/*     */   }
/*     */ 
/*     */   @Column(name="contact", length=999)
/*     */   public String getContact() {
/* 121 */     return this.contact;
/*     */   }
/*     */ 
/*     */   public void setContact(String contact) {
/* 125 */     this.contact = contact;
/*     */   }
/*     */ 
/*     */   @Column(name="ri", length=500)
/*     */   public String getRi() {
/* 130 */     return this.ri;
/*     */   }
/*     */ 
/*     */   public void setRi(String ri) {
/* 134 */     this.ri = ri;
/*     */   }
/*     */ 
/*     */   @Column(name="vat", length=500)
/*     */   public String getVat() {
/* 139 */     return this.vat;
/*     */   }
/*     */ 
/*     */   public void setVat(String vat) {
/* 143 */     this.vat = vat;
/*     */   }
/*     */ 
/*     */   @Column(name="bankName1", length=500)
/*     */   public String getBankName1() {
/* 148 */     return this.bankName1;
/*     */   }
/*     */ 
/*     */   public void setBankName1(String bankName1) {
/* 152 */     this.bankName1 = bankName1;
/*     */   }
/*     */ 
/*     */   @Column(name="bankName2", length=500)
/*     */   public String getBankName2() {
/* 157 */     return this.bankName2;
/*     */   }
/*     */ 
/*     */   public void setBankName2(String bankName2) {
/* 161 */     this.bankName2 = bankName2;
/*     */   }
/*     */ 
/*     */   @Column(name="bankAccount1", length=500)
/*     */   public String getBankAccount1() {
/* 166 */     return this.bankAccount1;
/*     */   }
/*     */ 
/*     */   public void setBankAccount1(String bankAccount1) {
/* 170 */     this.bankAccount1 = bankAccount1;
/*     */   }
/*     */ 
/*     */   @Column(name="bankAccoun2", length=500)
/*     */   public String getBankAccoun2() {
/* 175 */     return this.bankAccoun2;
/*     */   }
/*     */ 
/*     */   public void setBankAccoun2(String bankAccoun2) {
/* 179 */     this.bankAccoun2 = bankAccoun2;
/*     */   }
/*     */ 
/*     */   @Column(name="linkGed", length=500)
/*     */   public String getLinkGed() {
/* 184 */     return this.linkGed;
/*     */   }
/*     */ 
/*     */   public void setLinkGed(String linkGed) {
/* 188 */     this.linkGed = linkGed;
/*     */   }
/*     */ 
/*     */   @Column(name="code", length=45)
/*     */   public String getCode() {
/* 193 */     return this.code;
/*     */   }
/*     */ 
/*     */   public void setCode(String code) {
/* 197 */     this.code = code;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="supplier")
/*     */   public Set<Catalog> getCatalogs() {
/* 202 */     return this.catalogs;
/*     */   }
/*     */ 
/*     */   public void setCatalogs(Set<Catalog> catalogs) {
/* 206 */     this.catalogs = catalogs;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="supplier")
/*     */   public Set<Po> getPos() {
/* 211 */     return this.pos;
/*     */   }
/*     */ 
/*     */   public void setPos(Set<Po> pos) {
/* 215 */     this.pos = pos;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Supplier
 * JD-Core Version:    0.6.2
 */
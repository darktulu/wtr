/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="bankaccount")
/*     */ public class Bankaccount
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idbankAccount;
/*     */   private Company company;
/*     */   private String bank;
/*     */   private String status;
/*     */   private String rib;
/*     */   private String type;
/*     */   private String swiftCode;
/*     */   private String manager;
/*     */ 
/*     */   public Bankaccount()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Bankaccount(Company company)
/*     */   {
/*  34 */     this.company = company;
/*     */   }
/*     */ 
/*     */   public Bankaccount(Company company, String bank, String status, String rib, String type, String swiftCode, String manager) {
/*  38 */     this.company = company;
/*  39 */     this.bank = bank;
/*  40 */     this.status = status;
/*  41 */     this.rib = rib;
/*  42 */     this.type = type;
/*  43 */     this.swiftCode = swiftCode;
/*  44 */     this.manager = manager;
/*     */   }
/*  51 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idbankAccount", unique=true, nullable=false)
/*     */   public Integer getIdbankAccount() { return this.idbankAccount; }
/*     */ 
/*     */   public void setIdbankAccount(Integer idbankAccount)
/*     */   {
/*  55 */     this.idbankAccount = idbankAccount;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="company_idcompany", nullable=false)
/*     */   public Company getCompany() {
/*  61 */     return this.company;
/*     */   }
/*     */ 
/*     */   public void setCompany(Company company) {
/*  65 */     this.company = company;
/*     */   }
/*     */ 
/*     */   @Column(name="bank", length=45)
/*     */   public String getBank() {
/*  70 */     return this.bank;
/*     */   }
/*     */ 
/*     */   public void setBank(String bank) {
/*  74 */     this.bank = bank;
/*     */   }
/*     */ 
/*     */   @Column(name="status", length=45)
/*     */   public String getStatus() {
/*  79 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/*  83 */     this.status = status;
/*     */   }
/*     */ 
/*     */   @Column(name="rib", length=450)
/*     */   public String getRib() {
/*  88 */     return this.rib;
/*     */   }
/*     */ 
/*     */   public void setRib(String rib) {
/*  92 */     this.rib = rib;
/*     */   }
/*     */ 
/*     */   @Column(name="type", length=45)
/*     */   public String getType() {
/*  97 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String type) {
/* 101 */     this.type = type;
/*     */   }
/*     */ 
/*     */   @Column(name="swiftCode", length=450)
/*     */   public String getSwiftCode() {
/* 106 */     return this.swiftCode;
/*     */   }
/*     */ 
/*     */   public void setSwiftCode(String swiftCode) {
/* 110 */     this.swiftCode = swiftCode;
/*     */   }
/*     */ 
/*     */   @Column(name="manager", length=45)
/*     */   public String getManager() {
/* 115 */     return this.manager;
/*     */   }
/*     */ 
/*     */   public void setManager(String manager) {
/* 119 */     this.manager = manager;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Bankaccount
 * JD-Core Version:    0.6.2
 */
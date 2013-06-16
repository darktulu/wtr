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
/*     */ @Table(name="budgetpayment")
/*     */ public class Budgetpayment
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idbudgetpayment;
/*     */   private Budget budget;
/*     */   private String status;
/*     */   private String nature;
/*     */   private String mode;
/*     */   private Double amount;
/*     */   private Double percentage;
/*     */   private String chequeNb;
/*     */   private String chequeDetails;
/*     */ 
/*     */   public Budgetpayment()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Budgetpayment(Budget budget)
/*     */   {
/*  35 */     this.budget = budget;
/*     */   }
/*     */ 
/*     */   public Budgetpayment(Budget budget, String status, String nature, String mode, Double amount, Double percentage, String chequeNb, String chequeDetails) {
/*  39 */     this.budget = budget;
/*  40 */     this.status = status;
/*  41 */     this.nature = nature;
/*  42 */     this.mode = mode;
/*  43 */     this.amount = amount;
/*  44 */     this.percentage = percentage;
/*  45 */     this.chequeNb = chequeNb;
/*  46 */     this.chequeDetails = chequeDetails;
/*     */   }
/*  53 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idbudgetpayment", unique=true, nullable=false)
/*     */   public Integer getIdbudgetpayment() { return this.idbudgetpayment; }
/*     */ 
/*     */   public void setIdbudgetpayment(Integer idbudgetpayment)
/*     */   {
/*  57 */     this.idbudgetpayment = idbudgetpayment;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="budget_idbudget", nullable=false)
/*     */   public Budget getBudget() {
/*  63 */     return this.budget;
/*     */   }
/*     */ 
/*     */   public void setBudget(Budget budget) {
/*  67 */     this.budget = budget;
/*     */   }
/*     */ 
/*     */   @Column(name="status", length=45)
/*     */   public String getStatus() {
/*  72 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/*  76 */     this.status = status;
/*     */   }
/*     */ 
/*     */   @Column(name="nature", length=45)
/*     */   public String getNature() {
/*  81 */     return this.nature;
/*     */   }
/*     */ 
/*     */   public void setNature(String nature) {
/*  85 */     this.nature = nature;
/*     */   }
/*     */ 
/*     */   @Column(name="mode", length=45)
/*     */   public String getMode() {
/*  90 */     return this.mode;
/*     */   }
/*     */ 
/*     */   public void setMode(String mode) {
/*  94 */     this.mode = mode;
/*     */   }
/*     */ 
/*     */   @Column(name="amount", precision=22, scale=0)
/*     */   public Double getAmount() {
/*  99 */     return this.amount;
/*     */   }
/*     */ 
/*     */   public void setAmount(Double amount) {
/* 103 */     this.amount = amount;
/*     */   }
/*     */ 
/*     */   @Column(name="percentage", precision=22, scale=0)
/*     */   public Double getPercentage() {
/* 108 */     return this.percentage;
/*     */   }
/*     */ 
/*     */   public void setPercentage(Double percentage) {
/* 112 */     this.percentage = percentage;
/*     */   }
/*     */ 
/*     */   @Column(name="chequeNb", length=100)
/*     */   public String getChequeNb() {
/* 117 */     return this.chequeNb;
/*     */   }
/*     */ 
/*     */   public void setChequeNb(String chequeNb) {
/* 121 */     this.chequeNb = chequeNb;
/*     */   }
/*     */ 
/*     */   @Column(name="chequeDetails", length=500)
/*     */   public String getChequeDetails() {
/* 126 */     return this.chequeDetails;
/*     */   }
/*     */ 
/*     */   public void setChequeDetails(String chequeDetails) {
/* 130 */     this.chequeDetails = chequeDetails;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Budgetpayment
 * JD-Core Version:    0.6.2
 */
/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="expensepayment")
/*     */ public class Expensepayment
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idexpensepayment;
/*     */   private Budgetdetail budgetdetail;
/*     */   private Date dateExpense;
/*     */   private String type;
/*     */   private String description;
/*     */   private String benificiary;
/*     */   private String period;
/*     */   private Double quantity;
/*     */   private Double totalCost;
/*     */   private String status;
/*     */ 
/*     */   public Expensepayment()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Expensepayment(Budgetdetail budgetdetail)
/*     */   {
/*  39 */     this.budgetdetail = budgetdetail;
/*     */   }
/*     */ 
/*     */   public Expensepayment(Budgetdetail budgetdetail, Date dateExpense, String type, String description, String benificiary, String period, Double quantity, Double totalCost, String status) {
/*  43 */     this.budgetdetail = budgetdetail;
/*  44 */     this.dateExpense = dateExpense;
/*  45 */     this.type = type;
/*  46 */     this.description = description;
/*  47 */     this.benificiary = benificiary;
/*  48 */     this.period = period;
/*  49 */     this.quantity = quantity;
/*  50 */     this.totalCost = totalCost;
/*  51 */     this.status = status;
/*     */   }
/*  58 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idexpensepayment", unique=true, nullable=false)
/*     */   public Integer getIdexpensepayment() { return this.idexpensepayment; }
/*     */ 
/*     */   public void setIdexpensepayment(Integer idexpensepayment)
/*     */   {
/*  62 */     this.idexpensepayment = idexpensepayment;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="budgetdetail_idbudgetdetail", nullable=false)
/*     */   public Budgetdetail getBudgetdetail() {
/*  68 */     return this.budgetdetail;
/*     */   }
/*     */ 
/*     */   public void setBudgetdetail(Budgetdetail budgetdetail) {
/*  72 */     this.budgetdetail = budgetdetail;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="dateExpense", length=10)
/*     */   public Date getDateExpense() {
/*  78 */     return this.dateExpense;
/*     */   }
/*     */ 
/*     */   public void setDateExpense(Date dateExpense) {
/*  82 */     this.dateExpense = dateExpense;
/*     */   }
/*     */ 
/*     */   @Column(name="type", length=45)
/*     */   public String getType() {
/*  87 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String type) {
/*  91 */     this.type = type;
/*     */   }
/*     */ 
/*     */   @Column(name="description", length=500)
/*     */   public String getDescription() {
/*  96 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void setDescription(String description) {
/* 100 */     this.description = description;
/*     */   }
/*     */ 
/*     */   @Column(name="benificiary", length=100)
/*     */   public String getBenificiary() {
/* 105 */     return this.benificiary;
/*     */   }
/*     */ 
/*     */   public void setBenificiary(String benificiary) {
/* 109 */     this.benificiary = benificiary;
/*     */   }
/*     */ 
/*     */   @Column(name="period", length=45)
/*     */   public String getPeriod() {
/* 114 */     return this.period;
/*     */   }
/*     */ 
/*     */   public void setPeriod(String period) {
/* 118 */     this.period = period;
/*     */   }
/*     */ 
/*     */   @Column(name="quantity", precision=22, scale=0)
/*     */   public Double getQuantity() {
/* 123 */     return this.quantity;
/*     */   }
/*     */ 
/*     */   public void setQuantity(Double quantity) {
/* 127 */     this.quantity = quantity;
/*     */   }
/*     */ 
/*     */   @Column(name="totalCost", precision=22, scale=0)
/*     */   public Double getTotalCost() {
/* 132 */     return this.totalCost;
/*     */   }
/*     */ 
/*     */   public void setTotalCost(Double totalCost) {
/* 136 */     this.totalCost = totalCost;
/*     */   }
/*     */ 
/*     */   @Column(name="status", length=45)
/*     */   public String getStatus() {
/* 141 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/* 145 */     this.status = status;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Expensepayment
 * JD-Core Version:    0.6.2
 */
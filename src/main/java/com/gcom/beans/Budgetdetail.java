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
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="budgetdetail")
/*     */ public class Budgetdetail
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idbudgetdetail;
/*     */   private Budget budget;
/*     */   private String description;
/*     */   private String category;
/*     */   private Double quantity;
/*     */   private String unit;
/*     */   private Double unitCost;
/*     */   private Double totalCost;
/*  33 */   private Set<Expensepayment> expensepayments = new HashSet(0);
/*     */ 
/*     */   public Budgetdetail() {
/*     */   }
/*     */ 
/*     */   public Budgetdetail(Budget budget) {
/*  39 */     this.budget = budget;
/*     */   }
/*     */ 
/*     */   public Budgetdetail(Budget budget, String description, String category, Double quantity, String unit, Double unitCost, Double totalCost, Set<Expensepayment> expensepayments) {
/*  43 */     this.budget = budget;
/*  44 */     this.description = description;
/*  45 */     this.category = category;
/*  46 */     this.quantity = quantity;
/*  47 */     this.unit = unit;
/*  48 */     this.unitCost = unitCost;
/*  49 */     this.totalCost = totalCost;
/*  50 */     this.expensepayments = expensepayments;
/*     */   }
/*  57 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idbudgetdetail", unique=true, nullable=false)
/*     */   public Integer getIdbudgetdetail() { return this.idbudgetdetail; }
/*     */ 
/*     */   public void setIdbudgetdetail(Integer idbudgetdetail)
/*     */   {
/*  61 */     this.idbudgetdetail = idbudgetdetail;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="budget_idbudget", nullable=false)
/*     */   public Budget getBudget() {
/*  67 */     return this.budget;
/*     */   }
/*     */ 
/*     */   public void setBudget(Budget budget) {
/*  71 */     this.budget = budget;
/*     */   }
/*     */ 
/*     */   @Column(name="description", length=5000)
/*     */   public String getDescription() {
/*  76 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void setDescription(String description) {
/*  80 */     this.description = description;
/*     */   }
/*     */ 
/*     */   @Column(name="category", length=100)
/*     */   public String getCategory() {
/*  85 */     return this.category;
/*     */   }
/*     */ 
/*     */   public void setCategory(String category) {
/*  89 */     this.category = category;
/*     */   }
/*     */ 
/*     */   @Column(name="quantity", precision=22, scale=0)
/*     */   public Double getQuantity() {
/*  94 */     return this.quantity;
/*     */   }
/*     */ 
/*     */   public void setQuantity(Double quantity) {
/*  98 */     this.quantity = quantity;
/*     */   }
/*     */ 
/*     */   @Column(name="unit", length=45)
/*     */   public String getUnit() {
/* 103 */     return this.unit;
/*     */   }
/*     */ 
/*     */   public void setUnit(String unit) {
/* 107 */     this.unit = unit;
/*     */   }
/*     */ 
/*     */   @Column(name="unitCost", precision=22, scale=0)
/*     */   public Double getUnitCost() {
/* 112 */     return this.unitCost;
/*     */   }
/*     */ 
/*     */   public void setUnitCost(Double unitCost) {
/* 116 */     this.unitCost = unitCost;
/*     */   }
/*     */ 
/*     */   @Column(name="totalCost", precision=22, scale=0)
/*     */   public Double getTotalCost() {
/* 121 */     return this.totalCost;
/*     */   }
/*     */ 
/*     */   public void setTotalCost(Double totalCost) {
/* 125 */     this.totalCost = totalCost;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="budgetdetail")
/*     */   public Set<Expensepayment> getExpensepayments() {
/* 130 */     return this.expensepayments;
/*     */   }
/*     */ 
/*     */   public void setExpensepayments(Set<Expensepayment> expensepayments) {
/* 134 */     this.expensepayments = expensepayments;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Budgetdetail
 * JD-Core Version:    0.6.2
 */
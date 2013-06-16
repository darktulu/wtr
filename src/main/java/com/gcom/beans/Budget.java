/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
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
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="budget")
/*     */ public class Budget
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idbudget;
/*     */   private Project project;
/*     */   private String reference;
/*     */   private String description;
/*     */   private Date startDate;
/*     */   private Date endDate;
/*     */   private String current;
/*     */   private String status;
/*  36 */   private Set<Budgetpayment> budgetpayments = new HashSet(0);
/*  37 */   private Set<Budgetdetail> budgetdetails = new HashSet(0);
/*     */ 
/*     */   public Budget() {
/*     */   }
/*     */ 
/*     */   public Budget(Project project) {
/*  43 */     this.project = project;
/*     */   }
/*     */ 
/*     */   public Budget(Project project, String reference, String description, Date startDate, Date endDate, String current, String status, Set<Budgetpayment> budgetpayments, Set<Budgetdetail> budgetdetails) {
/*  47 */     this.project = project;
/*  48 */     this.reference = reference;
/*  49 */     this.description = description;
/*  50 */     this.startDate = startDate;
/*  51 */     this.endDate = endDate;
/*  52 */     this.current = current;
/*  53 */     this.status = status;
/*  54 */     this.budgetpayments = budgetpayments;
/*  55 */     this.budgetdetails = budgetdetails;
/*     */   }
/*  62 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idbudget", unique=true, nullable=false)
/*     */   public Integer getIdbudget() { return this.idbudget; }
/*     */ 
/*     */   public void setIdbudget(Integer idbudget)
/*     */   {
/*  66 */     this.idbudget = idbudget;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="project_idproject", nullable=false)
/*     */   public Project getProject() {
/*  72 */     return this.project;
/*     */   }
/*     */ 
/*     */   public void setProject(Project project) {
/*  76 */     this.project = project;
/*     */   }
/*     */ 
/*     */   @Column(name="reference", length=45)
/*     */   public String getReference() {
/*  81 */     return this.reference;
/*     */   }
/*     */ 
/*     */   public void setReference(String reference) {
/*  85 */     this.reference = reference;
/*     */   }
/*     */ 
/*     */   @Column(name="description", length=500)
/*     */   public String getDescription() {
/*  90 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void setDescription(String description) {
/*  94 */     this.description = description;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="startDate", length=10)
/*     */   public Date getStartDate() {
/* 100 */     return this.startDate;
/*     */   }
/*     */ 
/*     */   public void setStartDate(Date startDate) {
/* 104 */     this.startDate = startDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="endDate", length=10)
/*     */   public Date getEndDate() {
/* 110 */     return this.endDate;
/*     */   }
/*     */ 
/*     */   public void setEndDate(Date endDate) {
/* 114 */     this.endDate = endDate;
/*     */   }
/*     */ 
/*     */   @Column(name="current", length=45)
/*     */   public String getCurrent() {
/* 119 */     return this.current;
/*     */   }
/*     */ 
/*     */   public void setCurrent(String current) {
/* 123 */     this.current = current;
/*     */   }
/*     */ 
/*     */   @Column(name="status", length=45)
/*     */   public String getStatus() {
/* 128 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/* 132 */     this.status = status;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="budget")
/*     */   public Set<Budgetpayment> getBudgetpayments() {
/* 137 */     return this.budgetpayments;
/*     */   }
/*     */ 
/*     */   public void setBudgetpayments(Set<Budgetpayment> budgetpayments) {
/* 141 */     this.budgetpayments = budgetpayments;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="budget")
/*     */   public Set<Budgetdetail> getBudgetdetails() {
/* 146 */     return this.budgetdetails;
/*     */   }
/*     */ 
/*     */   public void setBudgetdetails(Set<Budgetdetail> budgetdetails) {
/* 150 */     this.budgetdetails = budgetdetails;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Budget
 * JD-Core Version:    0.6.2
 */
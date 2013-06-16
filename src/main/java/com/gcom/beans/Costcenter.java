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
/*     */ @Table(name="costcenter")
/*     */ public class Costcenter
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idcostCenter;
/*     */   private Lob lob;
/*     */   private String year;
/*     */   private Double budget;
/*     */   private String status;
/*     */   private String currency;
/*  31 */   private Set<Project> projects = new HashSet(0);
/*     */ 
/*     */   public Costcenter() {
/*     */   }
/*     */ 
/*     */   public Costcenter(Lob lob) {
/*  37 */     this.lob = lob;
/*     */   }
/*     */ 
/*     */   public Costcenter(Lob lob, String year, Double budget, String status, String currency, Set<Project> projects) {
/*  41 */     this.lob = lob;
/*  42 */     this.year = year;
/*  43 */     this.budget = budget;
/*  44 */     this.status = status;
/*  45 */     this.currency = currency;
/*  46 */     this.projects = projects;
/*     */   }
/*  53 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idcostCenter", unique=true, nullable=false)
/*     */   public Integer getIdcostCenter() { return this.idcostCenter; }
/*     */ 
/*     */   public void setIdcostCenter(Integer idcostCenter)
/*     */   {
/*  57 */     this.idcostCenter = idcostCenter;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="lob_idlob", nullable=false)
/*     */   public Lob getLob() {
/*  63 */     return this.lob;
/*     */   }
/*     */ 
/*     */   public void setLob(Lob lob) {
/*  67 */     this.lob = lob;
/*     */   }
/*     */ 
/*     */   @Column(name="year", length=45)
/*     */   public String getYear() {
/*  72 */     return this.year;
/*     */   }
/*     */ 
/*     */   public void setYear(String year) {
/*  76 */     this.year = year;
/*     */   }
/*     */ 
/*     */   @Column(name="budget", precision=22, scale=0)
/*     */   public Double getBudget() {
/*  81 */     return this.budget;
/*     */   }
/*     */ 
/*     */   public void setBudget(Double budget) {
/*  85 */     this.budget = budget;
/*     */   }
/*     */ 
/*     */   @Column(name="status", length=45)
/*     */   public String getStatus() {
/*  90 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/*  94 */     this.status = status;
/*     */   }
/*     */ 
/*     */   @Column(name="currency", length=45)
/*     */   public String getCurrency() {
/*  99 */     return this.currency;
/*     */   }
/*     */ 
/*     */   public void setCurrency(String currency) {
/* 103 */     this.currency = currency;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="costcenter")
/*     */   public Set<Project> getProjects() {
/* 108 */     return this.projects;
/*     */   }
/*     */ 
/*     */   public void setProjects(Set<Project> projects) {
/* 112 */     this.projects = projects;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Costcenter
 * JD-Core Version:    0.6.2
 */
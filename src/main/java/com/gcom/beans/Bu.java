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
/*     */ @Table(name="bu")
/*     */ public class Bu
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idbu;
/*     */   private Company company;
/*     */   private String name;
/*     */   private String operatingSector;
/*     */   private String director;
/*     */   private String operationsDirector;
/*     */   private String financeManager;
/*     */   private String technicalDirector;
/*     */   private String hrDirector;
/*     */   private String linkGed;
/*  35 */   private Set<Lob> lobs = new HashSet(0);
/*     */ 
/*     */   public Bu() {
/*     */   }
/*     */ 
/*     */   public Bu(Company company) {
/*  41 */     this.company = company;
/*     */   }
/*     */ 
/*     */   public Bu(Company company, String name, String operatingSector, String director, String operationsDirector, String financeManager, String technicalDirector, String hrDirector, String linkGed, Set<Lob> lobs) {
/*  45 */     this.company = company;
/*  46 */     this.name = name;
/*  47 */     this.operatingSector = operatingSector;
/*  48 */     this.director = director;
/*  49 */     this.operationsDirector = operationsDirector;
/*  50 */     this.financeManager = financeManager;
/*  51 */     this.technicalDirector = technicalDirector;
/*  52 */     this.hrDirector = hrDirector;
/*  53 */     this.linkGed = linkGed;
/*  54 */     this.lobs = lobs;
/*     */   }
/*  61 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idbu", unique=true, nullable=false)
/*     */   public Integer getIdbu() { return this.idbu; }
/*     */ 
/*     */   public void setIdbu(Integer idbu)
/*     */   {
/*  65 */     this.idbu = idbu;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="company_idcompany", nullable=false)
/*     */   public Company getCompany() {
/*  71 */     return this.company;
/*     */   }
/*     */ 
/*     */   public void setCompany(Company company) {
/*  75 */     this.company = company;
/*     */   }
/*     */ 
/*     */   @Column(name="name", length=45)
/*     */   public String getName() {
/*  80 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String name) {
/*  84 */     this.name = name;
/*     */   }
/*     */ 
/*     */   @Column(name="operatingSector", length=45)
/*     */   public String getOperatingSector() {
/*  89 */     return this.operatingSector;
/*     */   }
/*     */ 
/*     */   public void setOperatingSector(String operatingSector) {
/*  93 */     this.operatingSector = operatingSector;
/*     */   }
/*     */ 
/*     */   @Column(name="director", length=45)
/*     */   public String getDirector() {
/*  98 */     return this.director;
/*     */   }
/*     */ 
/*     */   public void setDirector(String director) {
/* 102 */     this.director = director;
/*     */   }
/*     */ 
/*     */   @Column(name="operationsDirector", length=45)
/*     */   public String getOperationsDirector() {
/* 107 */     return this.operationsDirector;
/*     */   }
/*     */ 
/*     */   public void setOperationsDirector(String operationsDirector) {
/* 111 */     this.operationsDirector = operationsDirector;
/*     */   }
/*     */ 
/*     */   @Column(name="financeManager", length=45)
/*     */   public String getFinanceManager() {
/* 116 */     return this.financeManager;
/*     */   }
/*     */ 
/*     */   public void setFinanceManager(String financeManager) {
/* 120 */     this.financeManager = financeManager;
/*     */   }
/*     */ 
/*     */   @Column(name="technicalDirector", length=45)
/*     */   public String getTechnicalDirector() {
/* 125 */     return this.technicalDirector;
/*     */   }
/*     */ 
/*     */   public void setTechnicalDirector(String technicalDirector) {
/* 129 */     this.technicalDirector = technicalDirector;
/*     */   }
/*     */ 
/*     */   @Column(name="hrDirector", length=45)
/*     */   public String getHrDirector() {
/* 134 */     return this.hrDirector;
/*     */   }
/*     */ 
/*     */   public void setHrDirector(String hrDirector) {
/* 138 */     this.hrDirector = hrDirector;
/*     */   }
/*     */ 
/*     */   @Column(name="linkGed", length=45)
/*     */   public String getLinkGed() {
/* 143 */     return this.linkGed;
/*     */   }
/*     */ 
/*     */   public void setLinkGed(String linkGed) {
/* 147 */     this.linkGed = linkGed;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="bu")
/*     */   public Set<Lob> getLobs() {
/* 152 */     return this.lobs;
/*     */   }
/*     */ 
/*     */   public void setLobs(Set<Lob> lobs) {
/* 156 */     this.lobs = lobs;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Bu
 * JD-Core Version:    0.6.2
 */
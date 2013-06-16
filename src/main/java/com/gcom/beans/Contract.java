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
/*     */ @Table(name="contract")
/*     */ public class Contract
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idcontract;
/*     */   private Customer customer;
/*     */   private String reference;
/*     */   private String description;
/*     */   private String year;
/*     */   private Date startDate;
/*     */   private Date expiryDate;
/*     */   private Double value;
/*     */   private String linkGed;
/*     */   private String status;
/*  38 */   private Set<Po> pos = new HashSet(0);
/*     */ 
/*     */   public Contract() {
/*     */   }
/*     */ 
/*     */   public Contract(Customer customer) {
/*  44 */     this.customer = customer;
/*     */   }
/*     */ 
/*     */   public Contract(Customer customer, String reference, String description, String year, Date startDate, Date expiryDate, Double value, String linkGed, String status, Set<Po> pos) {
/*  48 */     this.customer = customer;
/*  49 */     this.reference = reference;
/*  50 */     this.description = description;
/*  51 */     this.year = year;
/*  52 */     this.startDate = startDate;
/*  53 */     this.expiryDate = expiryDate;
/*  54 */     this.value = value;
/*  55 */     this.linkGed = linkGed;
/*  56 */     this.status = status;
/*  57 */     this.pos = pos;
/*     */   }
/*  64 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idcontract", unique=true, nullable=false)
/*     */   public Integer getIdcontract() { return this.idcontract; }
/*     */ 
/*     */   public void setIdcontract(Integer idcontract)
/*     */   {
/*  68 */     this.idcontract = idcontract;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="customer_idcustomer", nullable=false)
/*     */   public Customer getCustomer() {
/*  74 */     return this.customer;
/*     */   }
/*     */ 
/*     */   public void setCustomer(Customer customer) {
/*  78 */     this.customer = customer;
/*     */   }
/*     */ 
/*     */   @Column(name="reference", length=45)
/*     */   public String getReference() {
/*  83 */     return this.reference;
/*     */   }
/*     */ 
/*     */   public void setReference(String reference) {
/*  87 */     this.reference = reference;
/*     */   }
/*     */ 
/*     */   @Column(name="description", length=450)
/*     */   public String getDescription() {
/*  92 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void setDescription(String description) {
/*  96 */     this.description = description;
/*     */   }
/*     */ 
/*     */   @Column(name="year", length=45)
/*     */   public String getYear() {
/* 101 */     return this.year;
/*     */   }
/*     */ 
/*     */   public void setYear(String year) {
/* 105 */     this.year = year;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="startDate", length=10)
/*     */   public Date getStartDate() {
/* 111 */     return this.startDate;
/*     */   }
/*     */ 
/*     */   public void setStartDate(Date startDate) {
/* 115 */     this.startDate = startDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="expiryDate", length=10)
/*     */   public Date getExpiryDate() {
/* 121 */     return this.expiryDate;
/*     */   }
/*     */ 
/*     */   public void setExpiryDate(Date expiryDate) {
/* 125 */     this.expiryDate = expiryDate;
/*     */   }
/*     */ 
/*     */   @Column(name="value", precision=22, scale=0)
/*     */   public Double getValue() {
/* 130 */     return this.value;
/*     */   }
/*     */ 
/*     */   public void setValue(Double value) {
/* 134 */     this.value = value;
/*     */   }
/*     */ 
/*     */   @Column(name="linkGed", length=500)
/*     */   public String getLinkGed() {
/* 139 */     return this.linkGed;
/*     */   }
/*     */ 
/*     */   public void setLinkGed(String linkGed) {
/* 143 */     this.linkGed = linkGed;
/*     */   }
/*     */ 
/*     */   @Column(name="status", length=45)
/*     */   public String getStatus() {
/* 148 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/* 152 */     this.status = status;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="contract")
/*     */   public Set<Po> getPos() {
/* 157 */     return this.pos;
/*     */   }
/*     */ 
/*     */   public void setPos(Set<Po> pos) {
/* 161 */     this.pos = pos;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Contract
 * JD-Core Version:    0.6.2
 */
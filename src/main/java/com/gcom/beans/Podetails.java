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
/*     */ @Table(name="podetails")
/*     */ public class Podetails
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idpoDetails;
/*     */   private Po po;
/*     */   private String description;
/*     */   private Double unit;
/*     */   private Double unitPrice;
/*     */   private Double totalPrice;
/*     */   private String currency;
/*     */   private String status;
/*     */   private String reference;
/*     */   private String unite;
/*  35 */   private Set<Acceptancedetails> acceptancedetailses = new HashSet(0);
/*     */ 
/*     */   public Podetails() {
/*     */   }
/*     */ 
/*     */   public Podetails(Po po) {
/*  41 */     this.po = po;
/*     */   }
/*     */ 
/*     */   public Podetails(Po po, String description, Double unit, Double unitPrice, Double totalPrice, String currency, String status, String reference, String unite, Set<Acceptancedetails> acceptancedetailses) {
/*  45 */     this.po = po;
/*  46 */     this.description = description;
/*  47 */     this.unit = unit;
/*  48 */     this.unitPrice = unitPrice;
/*  49 */     this.totalPrice = totalPrice;
/*  50 */     this.currency = currency;
/*  51 */     this.status = status;
/*  52 */     this.reference = reference;
/*  53 */     this.unite = unite;
/*  54 */     this.acceptancedetailses = acceptancedetailses;
/*     */   }
/*  61 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idpoDetails", unique=true, nullable=false)
/*     */   public Integer getIdpoDetails() { return this.idpoDetails; }
/*     */ 
/*     */   public void setIdpoDetails(Integer idpoDetails)
/*     */   {
/*  65 */     this.idpoDetails = idpoDetails;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="po_idpo", nullable=false)
/*     */   public Po getPo() {
/*  71 */     return this.po;
/*     */   }
/*     */ 
/*     */   public void setPo(Po po) {
/*  75 */     this.po = po;
/*     */   }
/*     */ 
/*     */   @Column(name="description", length=5000)
/*     */   public String getDescription() {
/*  80 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void setDescription(String description) {
/*  84 */     this.description = description;
/*     */   }
/*     */ 
/*     */   @Column(name="unit", precision=22, scale=0)
/*     */   public Double getUnit() {
/*  89 */     return this.unit;
/*     */   }
/*     */ 
/*     */   public void setUnit(Double unit) {
/*  93 */     this.unit = unit;
/*     */   }
/*     */ 
/*     */   @Column(name="unitPrice", precision=22, scale=0)
/*     */   public Double getUnitPrice() {
/*  98 */     return this.unitPrice;
/*     */   }
/*     */ 
/*     */   public void setUnitPrice(Double unitPrice) {
/* 102 */     this.unitPrice = unitPrice;
/*     */   }
/*     */ 
/*     */   @Column(name="totalPrice", precision=22, scale=0)
/*     */   public Double getTotalPrice() {
/* 107 */     return this.totalPrice;
/*     */   }
/*     */ 
/*     */   public void setTotalPrice(Double totalPrice) {
/* 111 */     this.totalPrice = totalPrice;
/*     */   }
/*     */ 
/*     */   @Column(name="currency", length=45)
/*     */   public String getCurrency() {
/* 116 */     return this.currency;
/*     */   }
/*     */ 
/*     */   public void setCurrency(String currency) {
/* 120 */     this.currency = currency;
/*     */   }
/*     */ 
/*     */   @Column(name="status", length=45)
/*     */   public String getStatus() {
/* 125 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/* 129 */     this.status = status;
/*     */   }
/*     */ 
/*     */   @Column(name="reference", length=100)
/*     */   public String getReference() {
/* 134 */     return this.reference;
/*     */   }
/*     */ 
/*     */   public void setReference(String reference) {
/* 138 */     this.reference = reference;
/*     */   }
/*     */ 
/*     */   @Column(name="unite", length=45)
/*     */   public String getUnite() {
/* 143 */     return this.unite;
/*     */   }
/*     */ 
/*     */   public void setUnite(String unite) {
/* 147 */     this.unite = unite;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="podetails")
/*     */   public Set<Acceptancedetails> getAcceptancedetailses() {
/* 152 */     return this.acceptancedetailses;
/*     */   }
/*     */ 
/*     */   public void setAcceptancedetailses(Set<Acceptancedetails> acceptancedetailses) {
/* 156 */     this.acceptancedetailses = acceptancedetailses;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Podetails
 * JD-Core Version:    0.6.2
 */
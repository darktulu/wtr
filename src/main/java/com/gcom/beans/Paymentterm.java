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
/*     */ @Table(name="paymentterm")
/*     */ public class Paymentterm
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idpaymentterm;
/*     */   private Po po;
/*     */   private String phase;
/*     */   private String percentage;
/*     */   private Integer duration;
/*     */   private String shipmentTerm;
/*     */   private String speceficsConditions;
/*     */   private String status;
/*  33 */   private Set<Acceptance> acceptances = new HashSet(0);
/*     */ 
/*     */   public Paymentterm() {
/*     */   }
/*     */ 
/*     */   public Paymentterm(Po po) {
/*  39 */     this.po = po;
/*     */   }
/*     */ 
/*     */   public Paymentterm(Po po, String phase, String percentage, Integer duration, String shipmentTerm, String speceficsConditions, String status, Set<Acceptance> acceptances) {
/*  43 */     this.po = po;
/*  44 */     this.phase = phase;
/*  45 */     this.percentage = percentage;
/*  46 */     this.duration = duration;
/*  47 */     this.shipmentTerm = shipmentTerm;
/*  48 */     this.speceficsConditions = speceficsConditions;
/*  49 */     this.status = status;
/*  50 */     this.acceptances = acceptances;
/*     */   }
/*  57 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idpaymentterm", unique=true, nullable=false)
/*     */   public Integer getIdpaymentterm() { return this.idpaymentterm; }
/*     */ 
/*     */   public void setIdpaymentterm(Integer idpaymentterm)
/*     */   {
/*  61 */     this.idpaymentterm = idpaymentterm;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="po_idpo", nullable=false)
/*     */   public Po getPo() {
/*  67 */     return this.po;
/*     */   }
/*     */ 
/*     */   public void setPo(Po po) {
/*  71 */     this.po = po;
/*     */   }
/*     */ 
/*     */   @Column(name="phase", length=100)
/*     */   public String getPhase() {
/*  76 */     return this.phase;
/*     */   }
/*     */ 
/*     */   public void setPhase(String phase) {
/*  80 */     this.phase = phase;
/*     */   }
/*     */ 
/*     */   @Column(name="percentage", length=45)
/*     */   public String getPercentage() {
/*  85 */     return this.percentage;
/*     */   }
/*     */ 
/*     */   public void setPercentage(String percentage) {
/*  89 */     this.percentage = percentage;
/*     */   }
/*     */ 
/*     */   @Column(name="duration")
/*     */   public Integer getDuration() {
/*  94 */     return this.duration;
/*     */   }
/*     */ 
/*     */   public void setDuration(Integer duration) {
/*  98 */     this.duration = duration;
/*     */   }
/*     */ 
/*     */   @Column(name="shipmentTerm", length=200)
/*     */   public String getShipmentTerm() {
/* 103 */     return this.shipmentTerm;
/*     */   }
/*     */ 
/*     */   public void setShipmentTerm(String shipmentTerm) {
/* 107 */     this.shipmentTerm = shipmentTerm;
/*     */   }
/*     */ 
/*     */   @Column(name="speceficsConditions", length=200)
/*     */   public String getSpeceficsConditions() {
/* 112 */     return this.speceficsConditions;
/*     */   }
/*     */ 
/*     */   public void setSpeceficsConditions(String speceficsConditions) {
/* 116 */     this.speceficsConditions = speceficsConditions;
/*     */   }
/*     */ 
/*     */   @Column(name="status", length=45)
/*     */   public String getStatus() {
/* 121 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/* 125 */     this.status = status;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="paymentterm")
/*     */   public Set<Acceptance> getAcceptances() {
/* 130 */     return this.acceptances;
/*     */   }
/*     */ 
/*     */   public void setAcceptances(Set<Acceptance> acceptances) {
/* 134 */     this.acceptances = acceptances;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Paymentterm
 * JD-Core Version:    0.6.2
 */
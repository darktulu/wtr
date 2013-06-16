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
/*     */ @Table(name="acceptancedetails")
/*     */ public class Acceptancedetails
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idacceptanceDetails;
/*     */   private Acceptance acceptance;
/*     */   private Podetails podetails;
/*     */   private String acceptanceType;
/*     */   private Double quantityAccepted;
/*     */   private Double percentage;
/*     */   private Double totalPriceAccepted;
/*     */   private String status;
            private Double remainingQty;
/*     */ 
/*     */   public Acceptancedetails()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Acceptancedetails(Acceptance acceptance, Podetails podetails)
/*     */   {
/*  34 */     this.acceptance = acceptance;
/*  35 */     this.podetails = podetails;
/*     */   }
/*     */ 
/*     */   public Acceptancedetails(Acceptance acceptance, Podetails podetails, String acceptanceType, Double quantityAccepted, Double percentage, Double totalPriceAccepted, String status) {
/*  39 */     this.acceptance = acceptance;
/*  40 */     this.podetails = podetails;
/*  41 */     this.acceptanceType = acceptanceType;
/*  42 */     this.quantityAccepted = quantityAccepted;
/*  43 */     this.percentage = percentage;
/*  44 */     this.totalPriceAccepted = totalPriceAccepted;
/*  45 */     this.status = status;
/*     */   }
/*  52 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idacceptanceDetails", unique=true, nullable=false)
/*     */   public Integer getIdacceptanceDetails() { return this.idacceptanceDetails; }
/*     */ 
/*     */   public void setIdacceptanceDetails(Integer idacceptanceDetails)
/*     */   {
/*  56 */     this.idacceptanceDetails = idacceptanceDetails;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="acceptance_idacceptance", nullable=false)
/*     */   public Acceptance getAcceptance() {
/*  62 */     return this.acceptance;
/*     */   }
/*     */ 
/*     */   public void setAcceptance(Acceptance acceptance) {
/*  66 */     this.acceptance = acceptance;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="podetails_idpoDetails", nullable=false)
/*     */   public Podetails getPodetails() {
/*  72 */     return this.podetails;
/*     */   }
/*     */ 
/*     */   public void setPodetails(Podetails podetails) {
/*  76 */     this.podetails = podetails;
/*     */   }
/*     */ 
/*     */   @Column(name="acceptanceType", length=45)
/*     */   public String getAcceptanceType() {
/*  81 */     return this.acceptanceType;
/*     */   }
/*     */ 
/*     */   public void setAcceptanceType(String acceptanceType) {
/*  85 */     this.acceptanceType = acceptanceType;
/*     */   }
/*     */ 
/*     */   @Column(name="quantityAccepted", precision=22, scale=0)
/*     */   public Double getQuantityAccepted() {
/*  90 */     return this.quantityAccepted;
/*     */   }
/*     */ 
/*     */   public void setQuantityAccepted(Double quantityAccepted) {
/*  94 */     this.quantityAccepted = quantityAccepted;
/*     */   }
/*     */ 
/*     */   @Column(name="percentage", precision=22, scale=0)
/*     */   public Double getPercentage() {
/*  99 */     return this.percentage;
/*     */   }
/*     */ 
/*     */   public void setPercentage(Double percentage) {
/* 103 */     this.percentage = percentage;
/*     */   }
/*     */ 
/*     */   @Column(name="totalPriceAccepted", precision=22, scale=0)
/*     */   public Double getTotalPriceAccepted() {
/* 108 */     return this.totalPriceAccepted;
/*     */   }
/*     */ 
/*     */   public void setTotalPriceAccepted(Double totalPriceAccepted) {
/* 112 */     this.totalPriceAccepted = totalPriceAccepted;
/*     */   }
/*     */ 
/*     */   @Column(name="status", length=45)
/*     */   public String getStatus() {
/* 117 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/* 121 */     this.status = status;
/*     */   }
/*     */
@Column(name="remainingQty", precision=22, scale=0)
public Double getRemainingQty() {
	return remainingQty;
}
public void setRemainingQty(Double remainingQty) {
	this.remainingQty = remainingQty;
}
 }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Acceptancedetails
 * JD-Core Version:    0.6.2
 */
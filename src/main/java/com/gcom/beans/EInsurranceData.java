/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="e_insurrance_data")
/*     */ public class EInsurranceData
/*     */   implements Serializable
/*     */ {
/*     */   private Integer inssuranceId;
/*     */   private String resurceId;
/*     */   private String matricule;
/*     */   private Date date;
/*     */   private String type;
/*     */   private Date dateSoins;
/*     */   private String dossier;
/*     */   private String personName;
/*     */   private String totalAmount;
/*     */   private String status;
/*     */   private String statusDescription;
/*     */   private int numberOfPieces;
/*     */ 
/*     */   public EInsurranceData()
/*     */   {
/*     */   }
/*     */ 
/*     */   public EInsurranceData(String resurceId)
/*     */   {
/*  37 */     this.resurceId = resurceId;
/*     */   }
/*     */ 
/*     */   public EInsurranceData(String resurceId, String matricule, Date date, String type, Date dateSoins, String dossier, String personName, String totalAmount, String status, String statusDescription) {
/*  41 */     this.resurceId = resurceId;
/*  42 */     this.matricule = matricule;
/*  43 */     this.date = date;
/*  44 */     this.type = type;
/*  45 */     this.dateSoins = dateSoins;
/*  46 */     this.dossier = dossier;
/*  47 */     this.personName = personName;
/*  48 */     this.totalAmount = totalAmount;
/*  49 */     this.status = status;
/*  50 */     this.statusDescription = statusDescription;
/*     */   }
/*  57 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="INSSURANCE_ID", unique=true, nullable=false)
/*     */   public Integer getInssuranceId() { return this.inssuranceId; }
/*     */ 
/*     */   public void setInssuranceId(Integer inssuranceId)
/*     */   {
/*  61 */     this.inssuranceId = inssuranceId;
/*     */   }
/*     */ 
/*     */   @Column(name="RESURCE_ID", nullable=false, length=500)
/*     */   public String getResurceId() {
/*  66 */     return this.resurceId;
/*     */   }
/*     */ 
/*     */   public void setResurceId(String resurceId) {
/*  70 */     this.resurceId = resurceId;
/*     */   }
/*     */ 
/*     */   @Column(name="matricule", length=500)
/*     */   public String getMatricule() {
/*  75 */     return this.matricule;
/*     */   }
/*     */ 
/*     */   public void setMatricule(String matricule) {
/*  79 */     this.matricule = matricule;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="DATE", length=10)
/*     */   public Date getDate() {
/*  85 */     return this.date;
/*     */   }
/*     */ 
/*     */   public void setDate(Date date) {
/*  89 */     this.date = date;
/*     */   }
/*     */ 
/*     */   @Column(name="TYPE", length=100)
/*     */   public String getType() {
/*  94 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String type) {
/*  98 */     this.type = type;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="date_soins", length=10)
/*     */   public Date getDateSoins() {
/* 104 */     return this.dateSoins;
/*     */   }
/*     */ 
/*     */   public void setDateSoins(Date dateSoins) {
/* 108 */     this.dateSoins = dateSoins;
/*     */   }
/*     */ 
/*     */   @Column(name="dossier", length=500)
/*     */   public String getDossier() {
/* 113 */     return this.dossier;
/*     */   }
/*     */ 
/*     */   public void setDossier(String dossier) {
/* 117 */     this.dossier = dossier;
/*     */   }
/*     */ 
/*     */   @Column(name="PERSON_NAME", length=100)
/*     */   public String getPersonName() {
/* 122 */     return this.personName;
/*     */   }
/*     */ 
/*     */   public void setPersonName(String personName) {
/* 126 */     this.personName = personName;
/*     */   }
/*     */ 
/*     */   @Column(name="TOTAL_AMOUNT")
/*     */   public String getTotalAmount() {
/* 131 */     return this.totalAmount;
/*     */   }
/*     */ 
/*     */   public void setTotalAmount(String totalAmount) {
/* 135 */     this.totalAmount = totalAmount;
/*     */   }
/*     */ 
/*     */   @Column(name="STATUS", length=100)
/*     */   public String getStatus() {
/* 140 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/* 144 */     this.status = status;
/*     */   }
/*     */ 
/*     */   @Column(name="STATUS_DESCRIPTION", length=500)
/*     */   public String getStatusDescription() {
/* 149 */     return this.statusDescription;
/*     */   }
/*     */ 
/*     */   public void setStatusDescription(String statusDescription) {
/* 153 */     this.statusDescription = statusDescription;
/*     */   }
/*     */ 
/*     */   public int getNumberOfPieces() {
/* 157 */     return this.numberOfPieces;
/*     */   }
/*     */ 
/*     */   public void setNumberOfPieces(int numberOfPieces) {
/* 161 */     this.numberOfPieces = numberOfPieces;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.EInsurranceData
 * JD-Core Version:    0.6.2
 */
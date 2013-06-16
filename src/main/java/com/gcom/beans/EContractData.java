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
/*     */ @Table(name="e_contract_data")
/*     */ public class EContractData
/*     */   implements Serializable
/*     */ {
/*     */   private Integer contratId;
/*     */   private String resurceId;
/*     */   private String contractType;
/*     */   private String legalEntity;
/*     */   private Date hireDate;
/*     */   private Date contractStartDate;
/*     */   private Date contractEndDate;
/*     */   private String contractStatus;
/*     */   private String description;
/*     */   private Date probationPeriodStartDate;
/*     */   private Date probationPeriodEndDate;
/*     */   private String probationExtended;
/*     */   private String confirmed;
/*     */   private Date probationPeriodExtensionStartDate;
/*     */   private Date probationPeriodExtensionEndDate;
/*     */   private Date confirmationDate;
/*     */   private String noticeWthProbation;
/*     */   private String noticeAftProbation;
/*     */   private Date resign;
/*     */   private Date fire;
/*     */   private String contractEndingComment;
/*     */ 
/*     */   public EContractData()
/*     */   {
/*     */   }
/*     */ 
/*     */   public EContractData(String resurceId)
/*     */   {
/*  46 */     this.resurceId = resurceId;
/*     */   }
/*     */ 
/*     */   public EContractData(String resurceId, String contractType, Date hireDate, Date contractStartDate, Date contractEndDate, String contractStatus, String description) {
/*  50 */     this.resurceId = resurceId;
/*  51 */     this.contractType = contractType;
/*  52 */     this.hireDate = hireDate;
/*  53 */     this.contractStartDate = contractStartDate;
/*  54 */     this.contractEndDate = contractEndDate;
/*  55 */     this.contractStatus = contractStatus;
/*  56 */     this.description = description;
/*     */   }
/*  63 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="CONTRAT_Id", unique=true, nullable=false)
/*     */   public Integer getContratId() { return this.contratId; }
/*     */ 
/*     */   public void setContratId(Integer contratId)
/*     */   {
/*  67 */     this.contratId = contratId;
/*     */   }
/*     */ 
/*     */   @Column(name="RESURCE_ID", nullable=false, length=500)
/*     */   public String getResurceId() {
/*  72 */     return this.resurceId;
/*     */   }
/*     */ 
/*     */   public void setResurceId(String resurceId) {
/*  76 */     this.resurceId = resurceId;
/*     */   }
/*     */ 
/*     */   @Column(name="CONTRACT_TYPE", length=100)
/*     */   public String getContractType() {
/*  81 */     return this.contractType;
/*     */   }
/*     */ 
/*     */   public void setContractType(String contractType) {
/*  85 */     this.contractType = contractType;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="HIRE_DATE", length=10)
/*     */   public Date getHireDate() {
/*  91 */     return this.hireDate;
/*     */   }
/*     */ 
/*     */   public void setHireDate(Date hireDate) {
/*  95 */     this.hireDate = hireDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="CONTRACT_START_DATE", length=10)
/*     */   public Date getContractStartDate() {
/* 101 */     return this.contractStartDate;
/*     */   }
/*     */ 
/*     */   public void setContractStartDate(Date contractStartDate) {
/* 105 */     this.contractStartDate = contractStartDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="CONTRACT_END_DATE", length=10)
/*     */   public Date getContractEndDate() {
/* 111 */     return this.contractEndDate;
/*     */   }
/*     */ 
/*     */   public void setContractEndDate(Date contractEndDate) {
/* 115 */     this.contractEndDate = contractEndDate;
/*     */   }
/*     */ 
/*     */   @Column(name="CONTRACT_STATUS", length=100)
/*     */   public String getContractStatus() {
/* 120 */     return this.contractStatus;
/*     */   }
/*     */ 
/*     */   public void setContractStatus(String contractStatus) {
/* 124 */     this.contractStatus = contractStatus;
/*     */   }
/*     */ 
/*     */   @Column(name="DESCRIPTION", length=500)
/*     */   public String getDescription() {
/* 129 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void setDescription(String description) {
/* 133 */     this.description = description;
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return new StringBuilder().append("EContractData [").append(this.contratId != null ? new StringBuilder().append("contratId=").append(this.contratId).append(", ").toString() : "").append(this.resurceId != null ? new StringBuilder().append("resurceId=").append(this.resurceId).append(", ").toString() : "").append(this.contractType != null ? new StringBuilder().append("contractType=").append(this.contractType).append(", ").toString() : "").append(this.hireDate != null ? new StringBuilder().append("hireDate=").append(this.hireDate).append(", ").toString() : "").append(this.contractStartDate != null ? new StringBuilder().append("contractStartDate=").append(this.contractStartDate).append(", ").toString() : "").append(this.contractEndDate != null ? new StringBuilder().append("contractEndDate=").append(this.contractEndDate).append(", ").toString() : "").append(this.contractStatus != null ? new StringBuilder().append("contractStatus=").append(this.contractStatus).append(", ").toString() : "").append(this.description != null ? new StringBuilder().append("description=").append(this.description).toString() : "").append("]").toString();
/*     */   }
/*     */ 
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="ProbationPeriodStartDate", length=10)
/*     */   public Date getProbationPeriodStartDate()
/*     */   {
/* 151 */     return this.probationPeriodStartDate;
/*     */   }
/*     */ 
/*     */   public void setProbationPeriodStartDate(Date probationPeriodStartDate) {
/* 155 */     this.probationPeriodStartDate = probationPeriodStartDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="ProbationPeriodEndDate", length=10)
/*     */   public Date getProbationPeriodEndDate() {
/* 161 */     return this.probationPeriodEndDate;
/*     */   }
/*     */ 
/*     */   public void setProbationPeriodEndDate(Date probationPeriodEndDate) {
/* 165 */     this.probationPeriodEndDate = probationPeriodEndDate;
/*     */   }
/*     */ 
/*     */   @Column(name="ProbationExtended", length=100)
/*     */   public String getProbationExtended() {
/* 170 */     return this.probationExtended;
/*     */   }
/*     */ 
/*     */   public void setProbationExtended(String probationExtended) {
/* 174 */     this.probationExtended = probationExtended;
/*     */   }
/*     */ 
/*     */   @Column(name="Confirmed", length=100)
/*     */   public String getConfirmed() {
/* 179 */     return this.confirmed;
/*     */   }
/*     */ 
/*     */   public void setConfirmed(String confirmed) {
/* 183 */     this.confirmed = confirmed;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="ProbationPeriodExtensionStartDate", length=10)
/*     */   public Date getProbationPeriodExtensionStartDate() {
/* 189 */     return this.probationPeriodExtensionStartDate;
/*     */   }
/*     */ 
/*     */   public void setProbationPeriodExtensionStartDate(Date probationPeriodExtensionStartDate)
/*     */   {
/* 194 */     this.probationPeriodExtensionStartDate = probationPeriodExtensionStartDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="ProbationPeriodExtensionEndDate", length=10)
/*     */   public Date getProbationPeriodExtensionEndDate() {
/* 200 */     return this.probationPeriodExtensionEndDate;
/*     */   }
/*     */ 
/*     */   public void setProbationPeriodExtensionEndDate(Date probationPeriodExtensionEndDate)
/*     */   {
/* 205 */     this.probationPeriodExtensionEndDate = probationPeriodExtensionEndDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="ConfirmationDate", length=10)
/*     */   public Date getConfirmationDate() {
/* 211 */     return this.confirmationDate;
/*     */   }
/*     */ 
/*     */   public void setConfirmationDate(Date confirmationDate) {
/* 215 */     this.confirmationDate = confirmationDate;
/*     */   }
/*     */ 
/*     */   @Column(name="NoticeWthProbation", length=200)
/*     */   public String getNoticeWthProbation() {
/* 220 */     return this.noticeWthProbation;
/*     */   }
/*     */ 
/*     */   public void setNoticeWthProbation(String noticeWthProbation) {
/* 224 */     this.noticeWthProbation = noticeWthProbation;
/*     */   }
/*     */ 
/*     */   @Column(name="NoticeAftProbation", length=200)
/*     */   public String getNoticeAftProbation() {
/* 229 */     return this.noticeAftProbation;
/*     */   }
/*     */ 
/*     */   public void setNoticeAftProbation(String noticeAftProbation) {
/* 233 */     this.noticeAftProbation = noticeAftProbation;
/*     */   }
/*     */ 
/*     */   @Column(name="LegalEntity", length=100)
/*     */   public String getLegalEntity() {
/* 238 */     return this.legalEntity;
/*     */   }
/*     */ 
/*     */   public void setLegalEntity(String legalEntity) {
/* 242 */     this.legalEntity = legalEntity;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="Resign", length=10)
/*     */   public Date getResign() {
/* 248 */     return this.resign;
/*     */   }
/*     */ 
/*     */   public void setResign(Date resign) {
/* 252 */     this.resign = resign;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="Fire", length=10)
/*     */   public Date getFire() {
/* 258 */     return this.fire;
/*     */   }
/*     */ 
/*     */   public void setFire(Date fire) {
/* 262 */     this.fire = fire;
/*     */   }
/*     */   @Column(name="ContractEndingComment", length=200)
/*     */   public String getContractEndingComment() {
/* 266 */     return this.contractEndingComment;
/*     */   }
/*     */ 
/*     */   public void setContractEndingComment(String contractEndingComment) {
/* 270 */     this.contractEndingComment = contractEndingComment;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.EContractData
 * JD-Core Version:    0.6.2
 */
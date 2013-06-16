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
/*     */ @Table(name="appraisals")
/*     */ public class Appraisals
/*     */   implements Serializable
/*     */ {
/*     */   private Integer appraisal;
/*     */   private int year;
/*     */   private Date startDate;
/*     */   private Date endDate;
/*     */   private Date planningStartDate;
/*     */   private Date planningEndDate;
/*     */   private Date midYearReviewStartDate;
/*     */   private Date midYearReviewEndDate;
/*     */   private Date endYearSummaryStartDate;
/*     */   private Date endYearSummaryEndDate;
/*     */   private String status;
/*     */ 
/*     */   public Appraisals()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Appraisals(int year, Date startDate, Date endDate, Date planningStartDate, Date planningEndDate, Date midYearReviewStartDate, Date midYearReviewEndDate, Date endYearSummaryStartDate, Date endYearSummaryEndDate)
/*     */   {
/*  37 */     this.year = year;
/*  38 */     this.startDate = startDate;
/*  39 */     this.endDate = endDate;
/*  40 */     this.planningStartDate = planningStartDate;
/*  41 */     this.planningEndDate = planningEndDate;
/*  42 */     this.midYearReviewStartDate = midYearReviewStartDate;
/*  43 */     this.midYearReviewEndDate = midYearReviewEndDate;
/*  44 */     this.endYearSummaryStartDate = endYearSummaryStartDate;
/*  45 */     this.endYearSummaryEndDate = endYearSummaryEndDate;
/*     */   }
/*     */ 
/*     */   public Appraisals(int year, Date startDate, Date endDate, Date planningStartDate, Date planningEndDate, Date midYearReviewStartDate, Date midYearReviewEndDate, Date endYearSummaryStartDate, Date endYearSummaryEndDate, String status) {
/*  49 */     this.year = year;
/*  50 */     this.startDate = startDate;
/*  51 */     this.endDate = endDate;
/*  52 */     this.planningStartDate = planningStartDate;
/*  53 */     this.planningEndDate = planningEndDate;
/*  54 */     this.midYearReviewStartDate = midYearReviewStartDate;
/*  55 */     this.midYearReviewEndDate = midYearReviewEndDate;
/*  56 */     this.endYearSummaryStartDate = endYearSummaryStartDate;
/*  57 */     this.endYearSummaryEndDate = endYearSummaryEndDate;
/*  58 */     this.status = status;
/*     */   }
/*  65 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="Appraisal", unique=true, nullable=false)
/*     */   public Integer getAppraisal() { return this.appraisal; }
/*     */ 
/*     */   public void setAppraisal(Integer appraisal)
/*     */   {
/*  69 */     this.appraisal = appraisal;
/*     */   }
/*     */ 
/*     */   @Column(name="Year", nullable=false)
/*     */   public int getYear() {
/*  74 */     return this.year;
/*     */   }
/*     */ 
/*     */   public void setYear(int year) {
/*  78 */     this.year = year;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="Start_Date", nullable=false, length=10)
/*     */   public Date getStartDate() {
/*  84 */     return this.startDate;
/*     */   }
/*     */ 
/*     */   public void setStartDate(Date startDate) {
/*  88 */     this.startDate = startDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="End_date", nullable=false, length=10)
/*     */   public Date getEndDate() {
/*  94 */     return this.endDate;
/*     */   }
/*     */ 
/*     */   public void setEndDate(Date endDate) {
/*  98 */     this.endDate = endDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="Planning_Start_Date", nullable=false, length=10)
/*     */   public Date getPlanningStartDate() {
/* 104 */     return this.planningStartDate;
/*     */   }
/*     */ 
/*     */   public void setPlanningStartDate(Date planningStartDate) {
/* 108 */     this.planningStartDate = planningStartDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="Planning_end_date", nullable=false, length=10)
/*     */   public Date getPlanningEndDate() {
/* 114 */     return this.planningEndDate;
/*     */   }
/*     */ 
/*     */   public void setPlanningEndDate(Date planningEndDate) {
/* 118 */     this.planningEndDate = planningEndDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="Mid_Year_Review_Start_Date", nullable=false, length=10)
/*     */   public Date getMidYearReviewStartDate() {
/* 124 */     return this.midYearReviewStartDate;
/*     */   }
/*     */ 
/*     */   public void setMidYearReviewStartDate(Date midYearReviewStartDate) {
/* 128 */     this.midYearReviewStartDate = midYearReviewStartDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="Mid_Year_Review_end_Date", nullable=false, length=10)
/*     */   public Date getMidYearReviewEndDate() {
/* 134 */     return this.midYearReviewEndDate;
/*     */   }
/*     */ 
/*     */   public void setMidYearReviewEndDate(Date midYearReviewEndDate) {
/* 138 */     this.midYearReviewEndDate = midYearReviewEndDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="End_Year_summary_start_date", nullable=false, length=10)
/*     */   public Date getEndYearSummaryStartDate() {
/* 144 */     return this.endYearSummaryStartDate;
/*     */   }
/*     */ 
/*     */   public void setEndYearSummaryStartDate(Date endYearSummaryStartDate) {
/* 148 */     this.endYearSummaryStartDate = endYearSummaryStartDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="End_Year_summary_end_date", nullable=false, length=10)
/*     */   public Date getEndYearSummaryEndDate() {
/* 154 */     return this.endYearSummaryEndDate;
/*     */   }
/*     */ 
/*     */   public void setEndYearSummaryEndDate(Date endYearSummaryEndDate) {
/* 158 */     this.endYearSummaryEndDate = endYearSummaryEndDate;
/*     */   }
/*     */ 
/*     */   @Column(name="status")
/*     */   public String getStatus() {
/* 163 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/* 167 */     this.status = status;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Appraisals
 * JD-Core Version:    0.6.2
 */
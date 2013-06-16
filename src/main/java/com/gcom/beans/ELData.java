/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
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
/*     */ @Table(name="e_l_data")
/*     */ public class ELData
/*     */   implements Serializable
/*     */ {
/*     */   private Integer leaveId;
/*     */   private String resurceId;
/*     */   private String date;
/*     */   private String leaveType;
/*     */   private Date leaveStartDate;
/*     */   private Date leaveEndDate;
/*     */   private Integer totalDays;
/*     */   private String status;
/*     */   private String satatusDescription;
/*     */   private String backUpPerson;
/*     */   private String callAvailability;
/*     */   private String callType;
/*     */   private String mailAccess;
/*     */ 
/*     */   public ELData()
/*     */   {
/*     */   }
/*     */ 
/*     */   public ELData(String resurceId)
/*     */   {
/*  43 */     this.resurceId = resurceId;
/*     */   }
/*     */ 
/*     */   public ELData(String resurceId, String date, String leaveType, Date leaveStartDate, Date leaveEndDate, Integer totalDays, String status, String satatusDescription)
/*     */   {
/*  48 */     this.resurceId = resurceId;
/*  49 */     this.date = date;
/*  50 */     this.leaveType = leaveType;
/*  51 */     this.leaveStartDate = leaveStartDate;
/*  52 */     this.leaveEndDate = leaveEndDate;
/*  53 */     this.totalDays = totalDays;
/*  54 */     this.status = status;
/*  55 */     this.satatusDescription = satatusDescription;
/*     */   }
/*  62 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="LEAVE_ID", unique=true, nullable=false)
/*     */   public Integer getLeaveId() { return this.leaveId; }
/*     */ 
/*     */   public void setLeaveId(Integer leaveId)
/*     */   {
/*  66 */     this.leaveId = leaveId;
/*     */   }
/*     */ 
/*     */   @Column(name="RESURCE_ID", nullable=false, length=500)
/*     */   public String getResurceId() {
/*  71 */     return this.resurceId;
/*     */   }
/*     */ 
/*     */   public void setResurceId(String resurceId) {
/*  75 */     this.resurceId = resurceId;
/*     */   }
/*     */ 
/*     */   @Column(name="DATE", length=50)
/*     */   public String getDate() {
/*  80 */     return this.date;
/*     */   }
/*     */ 
/*     */   public void setDate(String date) {
/*  84 */     this.date = date;
/*     */   }
/*     */ 
/*     */   @Column(name="LEAVE_TYPE", length=100)
/*     */   public String getLeaveType() {
/*  89 */     return this.leaveType;
/*     */   }
/*     */ 
/*     */   public void setLeaveType(String leaveType) {
/*  93 */     this.leaveType = leaveType;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="LEAVE_START_DATE", length=10)
/*     */   public Date getLeaveStartDate() {
/*  99 */     return this.leaveStartDate;
/*     */   }
/*     */ 
/*     */   public void setLeaveStartDate(Date leaveStartDate) {
/* 103 */     this.leaveStartDate = leaveStartDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="LEAVE_END_DATE", length=10)
/*     */   public Date getLeaveEndDate() {
/* 109 */     return this.leaveEndDate;
/*     */   }
/*     */ 
/*     */   public void setLeaveEndDate(Date leaveEndDate) {
/* 113 */     this.leaveEndDate = leaveEndDate;
/*     */   }
/*     */ 
/*     */   @Column(name="TOTAL_DAYS")
/*     */   public Integer getTotalDays() {
/* 118 */     return this.totalDays;
/*     */   }
/*     */ 
/*     */   public void setTotalDays(Integer totalDays) {
/* 122 */     this.totalDays = totalDays;
/*     */   }
/*     */ 
/*     */   @Column(name="STATUS", length=100)
/*     */   public String getStatus() {
/* 127 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/* 131 */     this.status = status;
/*     */   }
/*     */ 
/*     */   @Column(name="SATATUS_DESCRIPTION", length=500)
/*     */   public String getSatatusDescription() {
/* 136 */     return this.satatusDescription;
/*     */   }
/*     */ 
/*     */   public void setSatatusDescription(String satatusDescription) {
/* 140 */     this.satatusDescription = satatusDescription;
/*     */   }
/*     */ 
/*     */   @Column(name="BACK_UP_PERSON", length=100)
/*     */   public String getBackUpPerson() {
/* 145 */     return this.backUpPerson;
/*     */   }
/*     */ 
/*     */   public void setBackUpPerson(String backUpPerson) {
/* 149 */     this.backUpPerson = backUpPerson;
/*     */   }
/*     */   @Column(name="CALL_AVAILABILITY", length=100)
/*     */   public String getCallAvailability() {
/* 153 */     return this.callAvailability;
/*     */   }
/*     */ 
/*     */   public void setCallAvailability(String callAvailability) {
/* 157 */     this.callAvailability = callAvailability;
/*     */   }
/*     */   @Column(name="CALL_TYPE", length=100)
/*     */   public String getCallType() {
/* 161 */     return this.callType;
/*     */   }
/*     */ 
/*     */   public void setCallType(String callType) {
/* 165 */     this.callType = callType;
/*     */   }
/*     */   @Column(name="MAIL_ACCESS", length=100)
/*     */   public String getMailAccess() {
/* 169 */     return this.mailAccess;
/*     */   }
/*     */ 
/*     */   public void setMailAccess(String mailAccess) {
/* 173 */     this.mailAccess = mailAccess;
/*     */   }
/*     */ 
/*     */   public int getYear(Date date) {
/* 177 */     Calendar myCalendar = GregorianCalendar.getInstance();
/* 178 */     myCalendar.setTime(date);
/* 179 */     return myCalendar.get(1);
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.ELData
 * JD-Core Version:    0.6.2
 */
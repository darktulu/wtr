/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ import javax.persistence.Temporal;
/*    */ import javax.persistence.TemporalType;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="e_spouse")
/*    */ public class ESpouse
/*    */   implements Serializable
/*    */ {
/*    */   private String spouseId;
/*    */   private String resurceId;
/*    */   private String spouseName;
/*    */   private Date spouseBirthday;
/*    */   private String spouseStatus;
/*    */   private String approved;
/*    */ 
/*    */   public ESpouse()
/*    */   {
/*    */   }
/*    */ 
/*    */   public ESpouse(String spouseId, String resurceId)
/*    */   {
/* 30 */     this.spouseId = spouseId;
/* 31 */     this.resurceId = resurceId;
/*    */   }
/*    */ 
/*    */   public ESpouse(String spouseId, String resurceId, String spouseName, Date spouseBirthday, String spouseStatus, String approved) {
/* 35 */     this.spouseId = spouseId;
/* 36 */     this.resurceId = resurceId;
/* 37 */     this.spouseName = spouseName;
/* 38 */     this.spouseBirthday = spouseBirthday;
/* 39 */     this.spouseStatus = spouseStatus;
/* 40 */     this.approved = approved;
/*    */   }
/*    */   @Id
/*    */   @Column(name="SPOUSE_ID", unique=true, nullable=false, length=100)
/*    */   public String getSpouseId() {
/* 46 */     return this.spouseId;
/*    */   }
/*    */ 
/*    */   public void setSpouseId(String spouseId) {
/* 50 */     this.spouseId = spouseId;
/*    */   }
/*    */ 
/*    */   @Column(name="RESURCE_ID", nullable=false, length=500)
/*    */   public String getResurceId() {
/* 55 */     return this.resurceId;
/*    */   }
/*    */ 
/*    */   public void setResurceId(String resurceId) {
/* 59 */     this.resurceId = resurceId;
/*    */   }
/*    */ 
/*    */   @Column(name="SPOUSE_NAME", length=500)
/*    */   public String getSpouseName() {
/* 64 */     return this.spouseName;
/*    */   }
/*    */ 
/*    */   public void setSpouseName(String spouseName) {
/* 68 */     this.spouseName = spouseName;
/*    */   }
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="SPOUSE_BIRTHDAY", length=10)
/*    */   public Date getSpouseBirthday() {
/* 74 */     return this.spouseBirthday;
/*    */   }
/*    */ 
/*    */   public void setSpouseBirthday(Date spouseBirthday) {
/* 78 */     this.spouseBirthday = spouseBirthday;
/*    */   }
/*    */ 
/*    */   @Column(name="SPOUSE_STATUS", length=50)
/*    */   public String getSpouseStatus() {
/* 83 */     return this.spouseStatus;
/*    */   }
/*    */ 
/*    */   public void setSpouseStatus(String spouseStatus) {
/* 87 */     this.spouseStatus = spouseStatus;
/*    */   }
/*    */ 
/*    */   @Column(name="approved", length=100)
/*    */   public String getApproved() {
/* 92 */     return this.approved;
/*    */   }
/*    */ 
/*    */   public void setApproved(String approved) {
/* 96 */     this.approved = approved;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.ESpouse
 * JD-Core Version:    0.6.2
 */
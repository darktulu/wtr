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
/*    */ @Table(name="child")
/*    */ public class Child
/*    */   implements Serializable
/*    */ {
/*    */   private String childId;
/*    */   private String spouseId;
/*    */   private Date childBirthday;
/*    */   private String childName;
/*    */   private String status;
/*    */   private String approved;
/*    */ 
/*    */   public Child()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Child(String childId, String spouseId)
/*    */   {
/* 30 */     this.childId = childId;
/* 31 */     this.spouseId = spouseId;
/*    */   }
/*    */ 
/*    */   public Child(String childId, String spouseId, Date childBirthday, String childName, String status, String approved) {
/* 35 */     this.childId = childId;
/* 36 */     this.spouseId = spouseId;
/* 37 */     this.childBirthday = childBirthday;
/* 38 */     this.childName = childName;
/* 39 */     this.status = status;
/* 40 */     this.approved = approved;
/*    */   }
/*    */   @Id
/*    */   @Column(name="CHILD_ID", unique=true, nullable=false, length=100)
/*    */   public String getChildId() {
/* 46 */     return this.childId;
/*    */   }
/*    */ 
/*    */   public void setChildId(String childId) {
/* 50 */     this.childId = childId;
/*    */   }
/*    */ 
/*    */   @Column(name="SPOUSE_ID", nullable=false, length=100)
/*    */   public String getSpouseId() {
/* 55 */     return this.spouseId;
/*    */   }
/*    */ 
/*    */   public void setSpouseId(String spouseId) {
/* 59 */     this.spouseId = spouseId;
/*    */   }
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="CHILD_BIRTHDAY", length=10)
/*    */   public Date getChildBirthday() {
/* 65 */     return this.childBirthday;
/*    */   }
/*    */ 
/*    */   public void setChildBirthday(Date childBirthday) {
/* 69 */     this.childBirthday = childBirthday;
/*    */   }
/*    */ 
/*    */   @Column(name="CHILD_NAME", length=500)
/*    */   public String getChildName() {
/* 74 */     return this.childName;
/*    */   }
/*    */ 
/*    */   public void setChildName(String childName) {
/* 78 */     this.childName = childName;
/*    */   }
/*    */ 
/*    */   @Column(name="status", length=30)
/*    */   public String getStatus() {
/* 83 */     return this.status;
/*    */   }
/*    */ 
/*    */   public void setStatus(String status) {
/* 87 */     this.status = status;
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
 * Qualified Name:     com.wadia.beans.Child
 * JD-Core Version:    0.6.2
 */
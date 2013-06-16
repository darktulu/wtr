/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ import javax.persistence.Temporal;
/*    */ import javax.persistence.TemporalType;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="e_warning_data")
/*    */ public class EWarningData
/*    */   implements Serializable
/*    */ {
/*    */   private Integer warningId;
/*    */   private String resurceId;
/*    */   private Date date;
/*    */   private String warningType;
/*    */   private String sevirity;
/*    */   private String raison;
/*    */ 
/*    */   public EWarningData()
/*    */   {
/*    */   }
/*    */ 
/*    */   public EWarningData(String resurceId)
/*    */   {
/* 32 */     this.resurceId = resurceId;
/*    */   }
/*    */ 
/*    */   public EWarningData(String resurceId, Date date, String warningType, String sevirity, String raison) {
/* 36 */     this.resurceId = resurceId;
/* 37 */     this.date = date;
/* 38 */     this.warningType = warningType;
/* 39 */     this.sevirity = sevirity;
/* 40 */     this.raison = raison;
/*    */   }
/* 47 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="WARNING_ID", unique=true, nullable=false)
/*    */   public Integer getWarningId() { return this.warningId; }
/*    */ 
/*    */   public void setWarningId(Integer warningId)
/*    */   {
/* 51 */     this.warningId = warningId;
/*    */   }
/*    */ 
/*    */   @Column(name="RESURCE_ID", nullable=false, length=500)
/*    */   public String getResurceId() {
/* 56 */     return this.resurceId;
/*    */   }
/*    */ 
/*    */   public void setResurceId(String resurceId) {
/* 60 */     this.resurceId = resurceId;
/*    */   }
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="DATE", length=10)
/*    */   public Date getDate() {
/* 66 */     return this.date;
/*    */   }
/*    */ 
/*    */   public void setDate(Date date) {
/* 70 */     this.date = date;
/*    */   }
/*    */ 
/*    */   @Column(name="WARNING_TYPE", length=100)
/*    */   public String getWarningType() {
/* 75 */     return this.warningType;
/*    */   }
/*    */ 
/*    */   public void setWarningType(String warningType) {
/* 79 */     this.warningType = warningType;
/*    */   }
/*    */ 
/*    */   @Column(name="SEVIRITY", length=100)
/*    */   public String getSevirity() {
/* 84 */     return this.sevirity;
/*    */   }
/*    */ 
/*    */   public void setSevirity(String sevirity) {
/* 88 */     this.sevirity = sevirity;
/*    */   }
/*    */ 
/*    */   @Column(name="RAISON", length=500)
/*    */   public String getRaison() {
/* 93 */     return this.raison;
/*    */   }
/*    */ 
/*    */   public void setRaison(String raison) {
/* 97 */     this.raison = raison;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.EWarningData
 * JD-Core Version:    0.6.2
 */
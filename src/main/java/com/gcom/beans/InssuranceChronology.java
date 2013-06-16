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
/*    */ @Table(name="insurrance_chronology")
/*    */ public class InssuranceChronology
/*    */   implements Serializable
/*    */ {
/*    */   private Integer inssuranceChronologyID;
/*    */   private String resurceId;
/*    */   private String matricule;
/*    */   private String status;
/*    */   private Date whenUpdated;
/*    */ 
/*    */   public InssuranceChronology()
/*    */   {
/*    */   }
/*    */ 
/*    */   public InssuranceChronology(String resurceId, String matricule, String status, Date whenUpdated)
/*    */   {
/* 34 */     this.resurceId = resurceId;
/* 35 */     this.matricule = matricule;
/* 36 */     this.status = status;
/* 37 */     this.whenUpdated = whenUpdated;
/*    */   }
/*    */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="INSSURANCE_CHRONOLOGY_ID", unique=true, nullable=false)
/*    */   public Integer getInssuranceChronologyID() {
/* 45 */     return this.inssuranceChronologyID;
/*    */   }
/*    */   public void setInssuranceChronologyID(Integer inssuranceChronologyID) {
/* 48 */     this.inssuranceChronologyID = inssuranceChronologyID;
/*    */   }
/*    */ 
/*    */   @Column(name="RESURCE_ID", nullable=false, length=500)
/*    */   public String getResurceId() {
/* 53 */     return this.resurceId;
/*    */   }
/*    */   public void setResurceId(String resurceId) {
/* 56 */     this.resurceId = resurceId;
/*    */   }
/*    */ 
/*    */   @Column(name="matricule", length=500)
/*    */   public String getMatricule() {
/* 61 */     return this.matricule;
/*    */   }
/*    */   public void setMatricule(String matricule) {
/* 64 */     this.matricule = matricule;
/*    */   }
/*    */   @Column(name="STATUS", length=500)
/*    */   public String getStatus() {
/* 68 */     return this.status;
/*    */   }
/*    */   public void setStatus(String status) {
/* 71 */     this.status = status;
/*    */   }
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="WHEN_UPDATED", length=10)
/*    */   public Date getWhenUpdated() {
/* 77 */     return this.whenUpdated;
/*    */   }
/*    */   public void setWhenUpdated(Date whenUpdated) {
/* 80 */     this.whenUpdated = whenUpdated;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.InssuranceChronology
 * JD-Core Version:    0.6.2
 */
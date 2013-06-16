/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="tercel")
/*    */ public class Tercel
/*    */   implements Serializable
/*    */ {
/*    */   private Integer tercelId;
/*    */   private String resourceId;
/*    */   private Integer tercMin;
/*    */   private Integer tercMidle;
/*    */   private Integer tercMax;
/*    */ 
/*    */   public Tercel()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Tercel(String resourceId)
/*    */   {
/* 28 */     this.resourceId = resourceId;
/*    */   }
/*    */ 
/*    */   public Tercel(String resourceId, Integer tercMin, Integer tercMidle, Integer tercMax) {
/* 32 */     this.resourceId = resourceId;
/* 33 */     this.tercMin = tercMin;
/* 34 */     this.tercMidle = tercMidle;
/* 35 */     this.tercMax = tercMax;
/*    */   }
/* 42 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="tercel_id", unique=true, nullable=false)
/*    */   public Integer getTercelId() { return this.tercelId; }
/*    */ 
/*    */   public void setTercelId(Integer tercelId)
/*    */   {
/* 46 */     this.tercelId = tercelId;
/*    */   }
/*    */ 
/*    */   @Column(name="resourceId", nullable=false, length=500)
/*    */   public String getResourceId() {
/* 51 */     return this.resourceId;
/*    */   }
/*    */ 
/*    */   public void setResourceId(String resourceId) {
/* 55 */     this.resourceId = resourceId;
/*    */   }
/*    */ 
/*    */   @Column(name="terc_min")
/*    */   public Integer getTercMin() {
/* 60 */     return this.tercMin;
/*    */   }
/*    */ 
/*    */   public void setTercMin(Integer tercMin) {
/* 64 */     this.tercMin = tercMin;
/*    */   }
/*    */ 
/*    */   @Column(name="terc_midle")
/*    */   public Integer getTercMidle() {
/* 69 */     return this.tercMidle;
/*    */   }
/*    */ 
/*    */   public void setTercMidle(Integer tercMidle) {
/* 73 */     this.tercMidle = tercMidle;
/*    */   }
/*    */ 
/*    */   @Column(name="terc_max")
/*    */   public Integer getTercMax() {
/* 78 */     return this.tercMax;
/*    */   }
/*    */ 
/*    */   public void setTercMax(Integer tercMax) {
/* 82 */     this.tercMax = tercMax;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Tercel
 * JD-Core Version:    0.6.2
 */
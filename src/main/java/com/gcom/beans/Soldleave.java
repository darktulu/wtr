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
/*    */ @Table(name="soldleave")
/*    */ public class Soldleave
/*    */   implements Serializable
/*    */ {
/*    */   private Integer id;
/*    */   private String resourceId;
/*    */   private Integer year;
/*    */   private Integer sold;
/*    */   private Integer consumed;
/*    */   private Integer planned;
/*    */   private String status;
/*    */ 
/*    */   public Soldleave()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Soldleave(String resourceId)
/*    */   {
/* 26 */     this.resourceId = resourceId;
/*    */   }
/*    */ 
/*    */   public Soldleave(String resourceId, Integer year, Integer sold, Integer consumed, Integer planned) {
/* 30 */     this.resourceId = resourceId;
/* 31 */     this.year = year;
/* 32 */     this.sold = sold;
/* 33 */     this.consumed = consumed;
/* 34 */     this.planned = planned;
/*    */   }
/* 41 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="id", unique=true, nullable=false)
/*    */   public Integer getId() { return this.id; }
/*    */ 
/*    */   public void setId(Integer id)
/*    */   {
/* 45 */     this.id = id;
/*    */   }
/*    */ 
/*    */   @Column(name="resourceID", nullable=false, length=500)
/*    */   public String getResourceId() {
/* 50 */     return this.resourceId;
/*    */   }
/*    */ 
/*    */   public void setResourceId(String resourceId) {
/* 54 */     this.resourceId = resourceId;
/*    */   }
/*    */ 
/*    */   @Column(name="year")
/*    */   public Integer getYear() {
/* 59 */     return this.year;
/*    */   }
/*    */ 
/*    */   public void setYear(Integer year) {
/* 63 */     this.year = year;
/*    */   }
/*    */ 
/*    */   @Column(name="sold")
/*    */   public Integer getSold() {
/* 68 */     return this.sold;
/*    */   }
/*    */ 
/*    */   public void setSold(Integer sold) {
/* 72 */     this.sold = sold;
/*    */   }
/*    */ 
/*    */   @Column(name="consumed")
/*    */   public Integer getConsumed() {
/* 77 */     return this.consumed;
/*    */   }
/*    */ 
/*    */   public void setConsumed(Integer consumed) {
/* 81 */     this.consumed = consumed;
/*    */   }
/*    */ 
/*    */   @Column(name="planned")
/*    */   public Integer getPlanned() {
/* 86 */     return this.planned;
/*    */   }
/*    */ 
/*    */   public void setPlanned(Integer planned) {
/* 90 */     this.planned = planned;
/*    */   }
/*    */   @Column(name="Status", length=300)
/*    */   public String getStatus() {
/* 94 */     return this.status;
/*    */   }
/*    */ 
/*    */   public void setStatus(String status) {
/* 98 */     this.status = status;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Soldleave
 * JD-Core Version:    0.6.2
 */
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
/*    */ @Table(name="dayoff")
/*    */ public class Dayoff
/*    */   implements Serializable
/*    */ {
/*    */   private Integer iddayoff;
/*    */   private Date date;
/*    */   private String type;
/*    */   private String description;
/*    */ 
/*    */   public Dayoff()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Dayoff(Date date, String type, String description)
/*    */   {
/* 30 */     this.date = date;
/* 31 */     this.type = type;
/* 32 */     this.description = description;
/*    */   }
/* 39 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="iddayoff", unique=true, nullable=false)
/*    */   public Integer getIddayoff() { return this.iddayoff; }
/*    */ 
/*    */   public void setIddayoff(Integer iddayoff)
/*    */   {
/* 43 */     this.iddayoff = iddayoff;
/*    */   }
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="date", length=10)
/*    */   public Date getDate() {
/* 49 */     return this.date;
/*    */   }
/*    */ 
/*    */   public void setDate(Date date) {
/* 53 */     this.date = date;
/*    */   }
/*    */ 
/*    */   @Column(name="type", length=45)
/*    */   public String getType() {
/* 58 */     return this.type;
/*    */   }
/*    */ 
/*    */   public void setType(String type) {
/* 62 */     this.type = type;
/*    */   }
/*    */ 
/*    */   @Column(name="description", length=45)
/*    */   public String getDescription() {
/* 67 */     return this.description;
/*    */   }
/*    */ 
/*    */   public void setDescription(String description) {
/* 71 */     this.description = description;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Dayoff
 * JD-Core Version:    0.6.2
 */
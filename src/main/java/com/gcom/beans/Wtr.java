/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ import javax.persistence.Temporal;
/*    */ import javax.persistence.TemporalType;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="wtr")
/*    */ public class Wtr
/*    */   implements Serializable
/*    */ {
/*    */   private Integer idwtr;
/*    */   private Project project;
/*    */   private Date dateWtr;
/*    */   private Double duration;
/*    */ 
/*    */   public Wtr()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Wtr(Project project, Date dateWtr, Double duration)
/*    */   {
/* 33 */     this.project = project;
/* 34 */     this.dateWtr = dateWtr;
/* 35 */     this.duration = duration;
/*    */   }
/* 42 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="idwtr", unique=true, nullable=false)
/*    */   public Integer getIdwtr() { return this.idwtr; }
/*    */ 
/*    */   public void setIdwtr(Integer idwtr)
/*    */   {
/* 46 */     this.idwtr = idwtr;
/*    */   }
/*    */   @ManyToOne(fetch=FetchType.LAZY)
/*    */   @JoinColumn(name="project_idProject")
/*    */   public Project getProject() {
/* 52 */     return this.project;
/*    */   }
/*    */ 
/*    */   public void setProject(Project project) {
/* 56 */     this.project = project;
/*    */   }
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="dateWtr", length=10)
/*    */   public Date getDateWtr() {
/* 62 */     return this.dateWtr;
/*    */   }
/*    */ 
/*    */   public void setDateWtr(Date dateWtr) {
/* 66 */     this.dateWtr = dateWtr;
/*    */   }
/*    */ 
/*    */   @Column(name="duration", precision=22, scale=0)
/*    */   public Double getDuration() {
/* 71 */     return this.duration;
/*    */   }
/*    */ 
/*    */   public void setDuration(Double duration) {
/* 75 */     this.duration = duration;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Wtr
 * JD-Core Version:    0.6.2
 */
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
/*    */ @Table(name="employe_appraisals")
/*    */ public class EmployeAppraisals
/*    */   implements Serializable
/*    */ {
/*    */   private Integer idEmpAppriasals;
/*    */   private String employe;
/*    */   private String apparaisee;
/*    */   private int apparaisal;
/*    */   private String status;
/*    */   private Date date;
/*    */ 
/*    */   public EmployeAppraisals()
/*    */   {
/*    */   }
/*    */ 
/*    */   public EmployeAppraisals(String employe, String apparaisee, int apparaisal, String status, Date date)
/*    */   {
/* 32 */     this.employe = employe;
/* 33 */     this.apparaisee = apparaisee;
/* 34 */     this.apparaisal = apparaisal;
/* 35 */     this.status = status;
/* 36 */     this.date = date;
/*    */   }
/* 43 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="Id_Emp_Appriasals", unique=true, nullable=false)
/*    */   public Integer getIdEmpAppriasals() { return this.idEmpAppriasals; }
/*    */ 
/*    */   public void setIdEmpAppriasals(Integer idEmpAppriasals)
/*    */   {
/* 47 */     this.idEmpAppriasals = idEmpAppriasals;
/*    */   }
/*    */ 
/*    */   @Column(name="Employe", nullable=false, length=50)
/*    */   public String getEmploye() {
/* 52 */     return this.employe;
/*    */   }
/*    */ 
/*    */   public void setEmploye(String employe) {
/* 56 */     this.employe = employe;
/*    */   }
/*    */ 
/*    */   @Column(name="apparaisee", nullable=false, length=50)
/*    */   public String getApparaisee() {
/* 61 */     return this.apparaisee;
/*    */   }
/*    */ 
/*    */   public void setApparaisee(String apparaisee) {
/* 65 */     this.apparaisee = apparaisee;
/*    */   }
/*    */ 
/*    */   @Column(name="Apparaisal", nullable=false)
/*    */   public int getApparaisal() {
/* 70 */     return this.apparaisal;
/*    */   }
/*    */ 
/*    */   public void setApparaisal(int apparaisal) {
/* 74 */     this.apparaisal = apparaisal;
/*    */   }
/*    */ 
/*    */   @Column(name="Status", nullable=false, length=50)
/*    */   public String getStatus() {
/* 79 */     return this.status;
/*    */   }
/*    */ 
/*    */   public void setStatus(String status) {
/* 83 */     this.status = status;
/*    */   }
/*    */   @Temporal(TemporalType.DATE)
/*    */   @Column(name="Date", nullable=false, length=10)
/*    */   public Date getDate() {
/* 89 */     return this.date;
/*    */   }
/*    */ 
/*    */   public void setDate(Date date) {
/* 93 */     this.date = date;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.EmployeAppraisals
 * JD-Core Version:    0.6.2
 */
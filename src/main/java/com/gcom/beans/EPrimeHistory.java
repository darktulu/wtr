/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="eprimehistory")
/*    */ public class EPrimeHistory
/*    */   implements Serializable
/*    */ {
/*    */ 
/*    */   @Id
/*    */   @GeneratedValue
/*    */   private int idprime;
/*    */   private String username;
/*    */   private int year;
/*    */   private int month;
/*    */   private String type;
/*    */   private double amounth;
/*    */ 
/*    */   @ManyToOne
/*    */   private SalaryHistory salaryHistory;
/*    */ 
/*    */   @Column(name="username", nullable=false, length=300)
/*    */   public String getUsername()
/*    */   {
/* 35 */     return this.username;
/*    */   }
/*    */   public void setUsername(String username) {
/* 38 */     this.username = username;
/*    */   }
/*    */   @Column(name="year")
/*    */   public int getYear() {
/* 42 */     return this.year;
/*    */   }
/*    */   public void setYear(int year) {
/* 45 */     this.year = year;
/*    */   }
/*    */   @Column(name="month")
/*    */   public int getMonth() {
/* 49 */     return this.month;
/*    */   }
/*    */   public void setMonth(int month) {
/* 52 */     this.month = month;
/*    */   }
/*    */   @Column(name="type", length=300)
/*    */   public String getType() {
/* 56 */     return this.type;
/*    */   }
/*    */   public void setType(String type) {
/* 59 */     this.type = type;
/*    */   }
/*    */   @Column(name="amounth", precision=22, scale=0)
/*    */   public double getAmounth() {
/* 63 */     return this.amounth;
/*    */   }
/*    */   public void setAmounth(double amounth) {
/* 66 */     this.amounth = amounth;
/*    */   }
/*    */   public int getIdprime() {
/* 69 */     return this.idprime;
/*    */   }
/*    */   public void setIdprime(int idprime) {
/* 72 */     this.idprime = idprime;
/*    */   }
/*    */   public SalaryHistory getSalaryHistory() {
/* 75 */     return this.salaryHistory;
/*    */   }
/*    */   public void setSalaryHistory(SalaryHistory salaryHistory) {
/* 78 */     this.salaryHistory = salaryHistory;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.EPrimeHistory
 * JD-Core Version:    0.6.2
 */
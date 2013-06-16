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
/*    */ @Table(name="eindemhistory")
/*    */ public class EIndemHistory
/*    */   implements Serializable
/*    */ {
/*    */ 
/*    */   @Id
/*    */   @GeneratedValue
/*    */   private int idindem;
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
/* 36 */     return this.username;
/*    */   }
/*    */   public void setUsername(String username) {
/* 39 */     this.username = username;
/*    */   }
/*    */   @Column(name="year")
/*    */   public int getYear() {
/* 43 */     return this.year;
/*    */   }
/*    */   public void setYear(int year) {
/* 46 */     this.year = year;
/*    */   }
/*    */   @Column(name="month")
/*    */   public int getMonth() {
/* 50 */     return this.month;
/*    */   }
/*    */   public void setMonth(int month) {
/* 53 */     this.month = month;
/*    */   }
/*    */   @Column(name="type", length=300)
/*    */   public String getType() {
/* 57 */     return this.type;
/*    */   }
/*    */   public void setType(String type) {
/* 60 */     this.type = type;
/*    */   }
/*    */   @Column(name="amounth", precision=22, scale=0)
/*    */   public double getAmounth() {
/* 64 */     return this.amounth;
/*    */   }
/*    */   public void setAmounth(double amounth) {
/* 67 */     this.amounth = amounth;
/*    */   }
/*    */   public int getIdindem() {
/* 70 */     return this.idindem;
/*    */   }
/*    */   public void setIdindem(int idindem) {
/* 73 */     this.idindem = idindem;
/*    */   }
/*    */   public SalaryHistory getSalaryHistory() {
/* 76 */     return this.salaryHistory;
/*    */   }
/*    */   public void setSalaryHistory(SalaryHistory salaryHistory) {
/* 79 */     this.salaryHistory = salaryHistory;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.EIndemHistory
 * JD-Core Version:    0.6.2
 */
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
/*    */ @Table(name="salary_charge")
/*    */ public class SalaryCharge
/*    */   implements Serializable
/*    */ {
/*    */   private Integer idCharge;
/*    */   private String nomCharge;
/*    */   private String type;
/*    */   private double tax;
/*    */   private double plafond;
/*    */ 
/*    */   public SalaryCharge()
/*    */   {
/*    */   }
/*    */ 
/*    */   public SalaryCharge(String nomCharge, String type, double tax, double plafond)
/*    */   {
/* 28 */     this.nomCharge = nomCharge;
/* 29 */     this.type = type;
/* 30 */     this.tax = tax;
/* 31 */     this.plafond = plafond;
/*    */   }
/* 38 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="id_charge", unique=true, nullable=false)
/*    */   public Integer getIdCharge() { return this.idCharge; }
/*    */ 
/*    */   public void setIdCharge(Integer idCharge)
/*    */   {
/* 42 */     this.idCharge = idCharge;
/*    */   }
/*    */ 
/*    */   @Column(name="nom_charge", nullable=false, length=300)
/*    */   public String getNomCharge() {
/* 47 */     return this.nomCharge;
/*    */   }
/*    */ 
/*    */   public void setNomCharge(String nomCharge) {
/* 51 */     this.nomCharge = nomCharge;
/*    */   }
/*    */ 
/*    */   @Column(name="type", nullable=false, length=50)
/*    */   public String getType() {
/* 56 */     return this.type;
/*    */   }
/*    */ 
/*    */   public void setType(String type) {
/* 60 */     this.type = type;
/*    */   }
/*    */ 
/*    */   @Column(name="tax", nullable=false, precision=22, scale=0)
/*    */   public double getTax() {
/* 65 */     return this.tax;
/*    */   }
/*    */ 
/*    */   public void setTax(double tax) {
/* 69 */     this.tax = tax;
/*    */   }
/*    */ 
/*    */   @Column(name="plafond", nullable=false, precision=22, scale=0)
/*    */   public double getPlafond() {
/* 74 */     return this.plafond;
/*    */   }
/*    */ 
/*    */   public void setPlafond(double plafond) {
/* 78 */     this.plafond = plafond;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.SalaryCharge
 * JD-Core Version:    0.6.2
 */
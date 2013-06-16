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
/*    */ @Table(name="type_absence")
/*    */ public class TypeAbsence
/*    */   implements Serializable
/*    */ {
/*    */   private Integer id;
/*    */   private String name;
/*    */   private String payed;
/*    */   private Integer nombreDays;
/*    */   private String commantaire;
/*    */ 
/*    */   public TypeAbsence()
/*    */   {
/*    */   }
/*    */ 
/*    */   public TypeAbsence(String name, String payed, Integer nombreDays, String commantaire)
/*    */   {
/* 28 */     this.name = name;
/* 29 */     this.payed = payed;
/* 30 */     this.nombreDays = nombreDays;
/* 31 */     this.commantaire = commantaire;
/*    */   }
/* 38 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="id", unique=true, nullable=false)
/*    */   public Integer getId() { return this.id; }
/*    */ 
/*    */   public void setId(Integer id)
/*    */   {
/* 42 */     this.id = id;
/*    */   }
/*    */ 
/*    */   @Column(name="name", length=500)
/*    */   public String getName() {
/* 47 */     return this.name;
/*    */   }
/*    */ 
/*    */   public void setName(String name) {
/* 51 */     this.name = name;
/*    */   }
/*    */ 
/*    */   @Column(name="payed", length=50)
/*    */   public String getPayed() {
/* 56 */     return this.payed;
/*    */   }
/*    */ 
/*    */   public void setPayed(String payed) {
/* 60 */     this.payed = payed;
/*    */   }
/*    */ 
/*    */   @Column(name="nombre_days")
/*    */   public Integer getNombreDays() {
/* 65 */     return this.nombreDays;
/*    */   }
/*    */ 
/*    */   public void setNombreDays(Integer nombreDays) {
/* 69 */     this.nombreDays = nombreDays;
/*    */   }
/*    */ 
/*    */   @Column(name="commantaire", length=500)
/*    */   public String getCommantaire() {
/* 74 */     return this.commantaire;
/*    */   }
/*    */ 
/*    */   public void setCommantaire(String commantaire) {
/* 78 */     this.commantaire = commantaire;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.TypeAbsence
 * JD-Core Version:    0.6.2
 */
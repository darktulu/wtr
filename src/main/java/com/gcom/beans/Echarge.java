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
/*    */ @Table(name="echarge")
/*    */ public class Echarge
/*    */   implements Serializable
/*    */ {
/*    */   private Integer id;
/*    */   private String nom;
/*    */   private String resourceId;
/*    */   private int mois;
/*    */   private int ans;
/*    */ 
/*    */   public Echarge()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Echarge(String nom, String resourceId, int mois, int ans)
/*    */   {
/* 28 */     this.nom = nom;
/* 29 */     this.resourceId = resourceId;
/* 30 */     this.mois = mois;
/* 31 */     this.ans = ans;
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
/*    */   @Column(name="nom", nullable=false, length=500)
/*    */   public String getNom() {
/* 47 */     return this.nom;
/*    */   }
/*    */ 
/*    */   public void setNom(String nom) {
/* 51 */     this.nom = nom;
/*    */   }
/*    */ 
/*    */   @Column(name="resource_id", nullable=false, length=500)
/*    */   public String getResourceId() {
/* 56 */     return this.resourceId;
/*    */   }
/*    */ 
/*    */   public void setResourceId(String resourceId) {
/* 60 */     this.resourceId = resourceId;
/*    */   }
/*    */ 
/*    */   @Column(name="mois", nullable=false)
/*    */   public int getMois() {
/* 65 */     return this.mois;
/*    */   }
/*    */ 
/*    */   public void setMois(int mois) {
/* 69 */     this.mois = mois;
/*    */   }
/*    */ 
/*    */   @Column(name="ans", nullable=false)
/*    */   public int getAns() {
/* 74 */     return this.ans;
/*    */   }
/*    */ 
/*    */   public void setAns(int ans) {
/* 78 */     this.ans = ans;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Echarge
 * JD-Core Version:    0.6.2
 */
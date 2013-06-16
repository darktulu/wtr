/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="e_prime")
/*     */ public class EPrime
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idPrime;
/*     */   private String resourceId;
/*     */   private String nom;
/*     */   private float montant;
/*     */   private String type;
/*     */   private String commentaire;
/*     */   private int mois;
/*     */   private int ans;
/*     */ 
/*     */   public EPrime()
/*     */   {
/*     */   }
/*     */ 
/*     */   public EPrime(String resourceId, String nom, float montant, String type, int mois, int ans)
/*     */   {
/*  31 */     this.resourceId = resourceId;
/*  32 */     this.nom = nom;
/*  33 */     this.montant = montant;
/*  34 */     this.type = type;
/*  35 */     this.mois = mois;
/*  36 */     this.ans = ans;
/*     */   }
/*     */ 
/*     */   public EPrime(String resourceId, String nom, float montant, String type, String commentaire, int mois, int ans) {
/*  40 */     this.resourceId = resourceId;
/*  41 */     this.nom = nom;
/*  42 */     this.montant = montant;
/*  43 */     this.type = type;
/*  44 */     this.commentaire = commentaire;
/*  45 */     this.mois = mois;
/*  46 */     this.ans = ans;
/*     */   }
/*  53 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="id_prime", unique=true, nullable=false)
/*     */   public Integer getIdPrime() { return this.idPrime; }
/*     */ 
/*     */   public void setIdPrime(Integer idPrime)
/*     */   {
/*  57 */     this.idPrime = idPrime;
/*     */   }
/*     */ 
/*     */   @Column(name="resource_id", nullable=false, length=500)
/*     */   public String getResourceId() {
/*  62 */     return this.resourceId;
/*     */   }
/*     */ 
/*     */   public void setResourceId(String resourceId) {
/*  66 */     this.resourceId = resourceId;
/*     */   }
/*     */ 
/*     */   @Column(name="nom", nullable=false, length=500)
/*     */   public String getNom() {
/*  71 */     return this.nom;
/*     */   }
/*     */ 
/*     */   public void setNom(String nom) {
/*  75 */     this.nom = nom;
/*     */   }
/*     */ 
/*     */   @Column(name="montant", nullable=false, precision=12, scale=0)
/*     */   public float getMontant() {
/*  80 */     return this.montant;
/*     */   }
/*     */ 
/*     */   public void setMontant(float montant) {
/*  84 */     this.montant = montant;
/*     */   }
/*     */ 
/*     */   @Column(name="type", nullable=false, length=100)
/*     */   public String getType() {
/*  89 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String type) {
/*  93 */     this.type = type;
/*     */   }
/*     */ 
/*     */   @Column(name="commentaire", length=500)
/*     */   public String getCommentaire() {
/*  98 */     return this.commentaire;
/*     */   }
/*     */ 
/*     */   public void setCommentaire(String commentaire) {
/* 102 */     this.commentaire = commentaire;
/*     */   }
/*     */ 
/*     */   @Column(name="mois", nullable=false)
/*     */   public int getMois() {
/* 107 */     return this.mois;
/*     */   }
/*     */ 
/*     */   public void setMois(int mois) {
/* 111 */     this.mois = mois;
/*     */   }
/*     */ 
/*     */   @Column(name="ans", nullable=false)
/*     */   public int getAns() {
/* 116 */     return this.ans;
/*     */   }
/*     */ 
/*     */   public void setAns(int ans) {
/* 120 */     this.ans = ans;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.EPrime
 * JD-Core Version:    0.6.2
 */
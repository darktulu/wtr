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
/*     */ @Table(name="e_indemnite")
/*     */ public class EIndemnite
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idIndem;
/*     */   private String resureceId;
/*     */   private String nom;
/*     */   private String type;
/*     */   private float montant;
/*     */   private String commentaire;
/*     */   private int mois;
/*     */   private int ans;
/*     */ 
/*     */   public EIndemnite()
/*     */   {
/*     */   }
/*     */ 
/*     */   public EIndemnite(String resureceId, String nom, String type, float montant, int mois, int ans)
/*     */   {
/*  31 */     this.resureceId = resureceId;
/*  32 */     this.nom = nom;
/*  33 */     this.type = type;
/*  34 */     this.montant = montant;
/*  35 */     this.mois = mois;
/*  36 */     this.ans = ans;
/*     */   }
/*     */ 
/*     */   public EIndemnite(String resureceId, String nom, String type, float montant, String commentaire, int mois, int ans) {
/*  40 */     this.resureceId = resureceId;
/*  41 */     this.nom = nom;
/*  42 */     this.type = type;
/*  43 */     this.montant = montant;
/*  44 */     this.commentaire = commentaire;
/*  45 */     this.mois = mois;
/*  46 */     this.ans = ans;
/*     */   }
/*  53 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="id_indem", unique=true, nullable=false)
/*     */   public Integer getIdIndem() { return this.idIndem; }
/*     */ 
/*     */   public void setIdIndem(Integer idIndem)
/*     */   {
/*  57 */     this.idIndem = idIndem;
/*     */   }
/*     */ 
/*     */   @Column(name="resurece_id", nullable=false, length=500)
/*     */   public String getResureceId() {
/*  62 */     return this.resureceId;
/*     */   }
/*     */ 
/*     */   public void setResureceId(String resureceId) {
/*  66 */     this.resureceId = resureceId;
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
/*     */   @Column(name="type", nullable=false, length=50)
/*     */   public String getType() {
/*  80 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String type) {
/*  84 */     this.type = type;
/*     */   }
/*     */ 
/*     */   @Column(name="montant", nullable=false, precision=12, scale=0)
/*     */   public float getMontant() {
/*  89 */     return this.montant;
/*     */   }
/*     */ 
/*     */   public void setMontant(float montant) {
/*  93 */     this.montant = montant;
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
 * Qualified Name:     com.wadia.beans.EIndemnite
 * JD-Core Version:    0.6.2
 */
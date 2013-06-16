/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="lob")
/*     */ public class Lob
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idlob;
/*     */   private Bu bu;
/*     */   private String name;
/*     */   private String description;
/*     */   private String manager;
/*     */   private String linkGed;
            private String manager_idmanager;
/*  31 */   private Set<Costcenter> costcenters = new HashSet(0);
/*  32 */   private Set<Affectation> affectations = new HashSet(0);
/*     */ 
/*     */   public Lob() {
/*     */   }
/*     */ 
/*     */   public Lob(Bu bu) {
/*  38 */     this.bu = bu;
/*     */   }
/*     */ 
/*     */   public Lob(Bu bu, String name, String description, String manager, String linkGed, Set<Costcenter> costcenters, Set<Affectation> affectations) {
/*  42 */     this.bu = bu;
/*  43 */     this.name = name;
/*  44 */     this.description = description;
/*  45 */     this.manager = manager;
/*  46 */     this.linkGed = linkGed;
/*  47 */     this.costcenters = costcenters;
/*  48 */     this.affectations = affectations;
/*     */   }
/*  55 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idlob", unique=true, nullable=false)
/*     */   public Integer getIdlob() { return this.idlob; }
/*     */ 
/*     */   public void setIdlob(Integer idlob)
/*     */   {
/*  59 */     this.idlob = idlob;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="bu_idbu", nullable=false)
/*     */   public Bu getBu() {
/*  65 */     return this.bu;
/*     */   }
/*     */ 
/*     */   public void setBu(Bu bu) {
/*  69 */     this.bu = bu;
/*     */   }
/*     */ 
/*     */   @Column(name="name", length=45)
/*     */   public String getName() {
/*  74 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String name) {
/*  78 */     this.name = name;
/*     */   }
/*     */ 
/*     */   @Column(name="description", length=500)
/*     */   public String getDescription() {
/*  83 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void setDescription(String description) {
/*  87 */     this.description = description;
/*     */   }
/*     */ 
/*     */   @Column(name="manager", length=45)
/*     */   public String getManager() {
/*  92 */     return this.manager;
/*     */   }
/*     */ 
/*     */   public void setManager(String manager) {
/*  96 */     this.manager = manager;
/*     */   }
/*     */ 
/*     */   @Column(name="linkGed", length=45)
/*     */   public String getLinkGed() {
/* 101 */     return this.linkGed;
/*     */   }
/*     */ 
/*     */   public void setLinkGed(String linkGed) {
/* 105 */     this.linkGed = linkGed;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="lob")
/*     */   public Set<Costcenter> getCostcenters() {
/* 110 */     return this.costcenters;
/*     */   }
/*     */ 
/*     */   public void setCostcenters(Set<Costcenter> costcenters) {
/* 114 */     this.costcenters = costcenters;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="lob")
/*     */   public Set<Affectation> getAffectations() {
/* 119 */     return this.affectations;
/*     */   }
/*     */ 
/*     */   public void setAffectations(Set<Affectation> affectations) {
/* 123 */     this.affectations = affectations;
/*     */   }
@Column(name="manager_idmanager", length=45)
public String getManager_idmanager() {
	  return manager_idmanager;
}

public void setManager_idmanager(String manager_idmanager) {
	  this.manager_idmanager = manager_idmanager;
}
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Lob
 * JD-Core Version:    0.6.2
 */
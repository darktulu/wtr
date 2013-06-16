/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="users")
/*     */ public class Users
/*     */   implements Serializable
/*     */ {
/*     */   private String username;
/*     */   private String password;
/*     */   private String info;
/*     */   private String info2;
/*     */   private String lastname;
/*     */   private String firstname;
/*  36 */   private Set<Authorities> authoritieses = new HashSet(0);
/*  37 */   private Set<Affectation> affectationsForUsersLm = new HashSet(0);
/*  38 */   private Set<Usertimesheet> usertimesheets = new HashSet(0);
/*  39 */   private Set<Affectation> affectationsForUsersHr = new HashSet(0);
/*  40 */   private Set<Affectation> affectationsForUsersUsername = new HashSet(0);

/*     */ 
/*     */   public Users() {
/*     */   }
/*     */ 
/*     */   public Users(String username) {
/*  46 */     this.username = username;
/*     */   }
/*     */ 
/*     */   public Users(String username, String password, String info, String info2, String lastname, String firstname, Set<Authorities> authoritieses, Set<Affectation> affectationsForUsersLm, Set<Usertimesheet> usertimesheets, Set<Affectation> affectationsForUsersHr, Set<Affectation> affectationsForUsersUsername)
/*     */   {
/*  52 */     this.username = username;
/*  53 */     this.password = password;
/*  54 */     this.info = info;
/*  55 */     this.info2 = info2;
/*  56 */     this.lastname = lastname;
/*  57 */     this.firstname = firstname;
/*  58 */     this.authoritieses = authoritieses;
/*  59 */     this.affectationsForUsersLm = affectationsForUsersLm;
/*  60 */     this.usertimesheets = usertimesheets;
/*  61 */     this.affectationsForUsersHr = affectationsForUsersHr;
/*  62 */     this.affectationsForUsersUsername = affectationsForUsersUsername;
/*     */   }
/*     */   @Id
/*     */   @Column(name="username", unique=true, nullable=false, length=45)
/*     */   public String getUsername() {
/*  68 */     return this.username;
/*     */   }
/*     */ 
/*     */   public void setUsername(String username) {
/*  72 */     this.username = username;
/*     */   }
/*     */ 
/*     */   @Column(name="password", length=45)
/*     */   public String getPassword() {
/*  77 */     return this.password;
/*     */   }
/*     */ 
/*     */   public void setPassword(String password) {
/*  81 */     this.password = password;
/*     */   }
/*     */ 
/*     */   @Column(name="info", length=500)
/*     */   public String getInfo() {
/*  86 */     return this.info;
/*     */   }
/*     */ 
/*     */   public void setInfo(String info) {
/*  90 */     this.info = info;
/*     */   }
/*     */ 
/*     */   @Column(name="info2", length=500)
/*     */   public String getInfo2() {
/*  95 */     return this.info2;
/*     */   }
/*     */ 
/*     */   public void setInfo2(String info2) {
/*  99 */     this.info2 = info2;
/*     */   }
/*     */ 
/*     */   @Column(name="lastname", length=45)
/*     */   public String getLastname() {
/* 104 */     return this.lastname;
/*     */   }
/*     */ 
/*     */   public void setLastname(String lastname) {
/* 108 */     this.lastname = lastname;
/*     */   }
/*     */ 
/*     */   @Column(name="firstname", length=45)
/*     */   public String getFirstname() {
/* 113 */     return this.firstname;
/*     */   }
/*     */ 
/*     */   public void setFirstname(String firstname) {
/* 117 */     this.firstname = firstname;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER, mappedBy="users")
/*     */   public Set<Authorities> getAuthoritieses() {
/* 122 */     return this.authoritieses;
/*     */   }
/*     */ 
/*     */   public void setAuthoritieses(Set<Authorities> authoritieses) {
/* 126 */     this.authoritieses = authoritieses;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="usersByUsersLm")
/*     */   public Set<Affectation> getAffectationsForUsersLm() {
/* 131 */     return this.affectationsForUsersLm;
/*     */   }
/*     */ 
/*     */   public void setAffectationsForUsersLm(Set<Affectation> affectationsForUsersLm) {
/* 135 */     this.affectationsForUsersLm = affectationsForUsersLm;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="users")
/*     */   public Set<Usertimesheet> getUsertimesheets() {
/* 140 */     return this.usertimesheets;
/*     */   }
/*     */ 
/*     */   public void setUsertimesheets(Set<Usertimesheet> usertimesheets) {
/* 144 */     this.usertimesheets = usertimesheets;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="usersByUsersHr")
/*     */   public Set<Affectation> getAffectationsForUsersHr() {
/* 149 */     return this.affectationsForUsersHr;
/*     */   }
/*     */ 
/*     */   public void setAffectationsForUsersHr(Set<Affectation> affectationsForUsersHr) {
/* 153 */     this.affectationsForUsersHr = affectationsForUsersHr;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="usersByUsersUsername")
/*     */   public Set<Affectation> getAffectationsForUsersUsername() {
/* 158 */     return this.affectationsForUsersUsername;
/*     */   }
/*     */ 
/*     */   public void setAffectationsForUsersUsername(Set<Affectation> affectationsForUsersUsername) {
/* 162 */     this.affectationsForUsersUsername = affectationsForUsersUsername;
/*     */   }
/*     */ 
/*     */   public String getFullName() {
/* 166 */     return this.firstname + " " + this.lastname;
/*     */   }
/*     */ 
/*     */   public void setFullName(String t)
/*     */   {
/*     */   }
/*     */
 }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Users
 * JD-Core Version:    0.6.2
 */
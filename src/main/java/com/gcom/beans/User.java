/*     */ package com.gcom.beans;
/*     */ 
/*     */ public class User
/*     */ {
/*     */   private String username;
/*     */   private String password;
/*     */   private String firstname;
/*     */   private String lastname;
/*     */   private String email;
/*     */   private boolean users;
/*     */   private boolean invoice;
/*     */   private boolean buy;
/*     */   private boolean admin;
/*     */   private boolean ome;
/*     */   private boolean wtr;
/*     */ 
/*     */   public boolean isAdmin()
/*     */   {
/*  26 */     return this.admin;
/*     */   }
/*     */ 
/*     */   public String getEmail() {
/*  30 */     return this.email;
/*     */   }
/*     */ 
/*     */   public void setEmail(String email) {
/*  34 */     this.email = email;
/*     */   }
/*     */ 
/*     */   public boolean isBuy()
/*     */   {
/*  40 */     return this.buy;
/*     */   }
/*     */ 
/*     */   public void setBuy(boolean buy) {
/*  44 */     this.buy = buy;
/*     */   }
/*     */ 
/*     */   public void setAdmin(boolean admin) {
/*  48 */     this.admin = admin;
/*     */   }
/*     */ 
/*     */   public boolean isInvoice() {
/*  52 */     return this.invoice;
/*     */   }
/*     */ 
/*     */   public void setInvoice(boolean invoice) {
/*  56 */     this.invoice = invoice;
/*     */   }
/*     */ 
/*     */   public String getPassword() {
/*  60 */     return this.password;
/*     */   }
/*     */ 
/*     */   public void setPassword(String password) {
/*  64 */     this.password = password;
/*     */   }
/*     */ 
/*     */   public String getUsername() {
/*  68 */     return this.username;
/*     */   }
/*     */ 
/*     */   public void setUsername(String username) {
/*  72 */     this.username = username;
/*     */   }
/*     */ 
/*     */   public boolean isUsers() {
/*  76 */     return this.users;
/*     */   }
/*     */ 
/*     */   public void setUsers(boolean users) {
/*  80 */     this.users = users;
/*     */   }
/*     */ 
/*     */   public String getFirstname() {
/*  84 */     return this.firstname;
/*     */   }
/*     */ 
/*     */   public void setFirstname(String firstname) {
/*  88 */     this.firstname = firstname;
/*     */   }
/*     */ 
/*     */   public String getLastname() {
/*  92 */     return this.lastname;
/*     */   }
/*     */ 
/*     */   public void setLastname(String lastname) {
/*  96 */     this.lastname = lastname;
/*     */   }
/*     */ 
/*     */   public boolean isOme() {
/* 100 */     return this.ome;
/*     */   }
/*     */ 
/*     */   public void setOme(boolean ome) {
/* 104 */     this.ome = ome;
/*     */   }
/*     */ 
/*     */   public boolean isWtr() {
/* 108 */     return this.wtr;
/*     */   }
/*     */ 
/*     */   public void setWtr(boolean wtr) {
/* 112 */     this.wtr = wtr;
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 118 */     return "username : " + this.username + " password : " + this.password + " firstname : " + this.firstname + " lastname : " + this.lastname;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.User
 * JD-Core Version:    0.6.2
 */
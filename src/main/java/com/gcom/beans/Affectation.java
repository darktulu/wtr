/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="affectation")
/*    */ public class Affectation
/*    */   implements Serializable
/*    */ {
/*    */   private Integer idaffectation;
/*    */   private Users usersByUsersHr;
/*    */   private Lob lob;
/*    */   private Users usersByUsersLm;
/*    */   private Users usersByUsersUsername;
/*    */ 
/*    */   public Affectation()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Affectation(Users usersByUsersUsername)
/*    */   {
/* 31 */     this.usersByUsersUsername = usersByUsersUsername;
/*    */   }
/*    */ 
/*    */   public Affectation(Users usersByUsersHr, Lob lob, Users usersByUsersLm, Users usersByUsersUsername) {
/* 35 */     this.usersByUsersHr = usersByUsersHr;
/* 36 */     this.lob = lob;
/* 37 */     this.usersByUsersLm = usersByUsersLm;
/* 38 */     this.usersByUsersUsername = usersByUsersUsername;
/*    */   }
/* 45 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="idaffectation", unique=true, nullable=false)
/*    */   public Integer getIdaffectation() { return this.idaffectation; }
/*    */ 
/*    */   public void setIdaffectation(Integer idaffectation)
/*    */   {
/* 49 */     this.idaffectation = idaffectation;
/*    */   }
/*    */   @ManyToOne(fetch=FetchType.EAGER)
/*    */   @JoinColumn(name="users_hr")
/*    */   public Users getUsersByUsersHr() {
/* 55 */     return this.usersByUsersHr;
/*    */   }
/*    */ 
/*    */   public void setUsersByUsersHr(Users usersByUsersHr) {
/* 59 */     this.usersByUsersHr = usersByUsersHr;
/*    */   }
/*    */   @ManyToOne(fetch=FetchType.EAGER)
/*    */   @JoinColumn(name="lob_idlob")
/*    */   public Lob getLob() {
/* 65 */     return this.lob;
/*    */   }
/*    */ 
/*    */   public void setLob(Lob lob) {
/* 69 */     this.lob = lob;
/*    */   }
/*    */   @ManyToOne(fetch=FetchType.EAGER)
/*    */   @JoinColumn(name="users_lm")
/*    */   public Users getUsersByUsersLm() {
/* 75 */     return this.usersByUsersLm;
/*    */   }
/*    */ 
/*    */   public void setUsersByUsersLm(Users usersByUsersLm) {
/* 79 */     this.usersByUsersLm = usersByUsersLm;
/*    */   }
/*    */   @ManyToOne(fetch=FetchType.EAGER)
/*    */   @JoinColumn(name="users_username", nullable=false)
/*    */   public Users getUsersByUsersUsername() {
/* 85 */     return this.usersByUsersUsername;
/*    */   }
/*    */ 
/*    */   public void setUsersByUsersUsername(Users usersByUsersUsername) {
/* 89 */     this.usersByUsersUsername = usersByUsersUsername;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Affectation
 * JD-Core Version:    0.6.2
 */
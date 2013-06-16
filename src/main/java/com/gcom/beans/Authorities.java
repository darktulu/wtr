/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.AttributeOverrides;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="authorities")
/*    */ public class Authorities
/*    */   implements Serializable
/*    */ {
/*    */   private AuthoritiesId id;
/*    */   private Users users;
/*    */ 
/*    */   public Authorities()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Authorities(AuthoritiesId id, Users users)
/*    */   {
/* 28 */     this.id = id;
/* 29 */     this.users = users;
/*    */   }
/*    */ 
/*    */   @EmbeddedId
/*    */   @AttributeOverrides({@javax.persistence.AttributeOverride(name="authority", column=@javax.persistence.Column(name="authority", nullable=false, length=40)), @javax.persistence.AttributeOverride(name="username", column=@javax.persistence.Column(name="username", nullable=false, length=45))})
/*    */   public AuthoritiesId getId()
/*    */   {
/* 39 */     return this.id;
/*    */   }
/*    */ 
/*    */   public void setId(AuthoritiesId id) {
/* 43 */     this.id = id;
/*    */   }
/*    */   @ManyToOne(fetch=FetchType.LAZY)
/*    */   @JoinColumn(name="username", nullable=false, insertable=false, updatable=false)
/*    */   public Users getUsers() {
/* 49 */     return this.users;
/*    */   }
/*    */ 
/*    */   public void setUsers(Users users) {
/* 53 */     this.users = users;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Authorities
 * JD-Core Version:    0.6.2
 */
/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;
/*    */ 
/*    */ @Embeddable
/*    */ public class AuthoritiesId
/*    */   implements Serializable
/*    */ {
/*    */   private String authority;
/*    */   private String username;
/*    */ 
/*    */   public AuthoritiesId()
/*    */   {
/*    */   }
/*    */ 
/*    */   public AuthoritiesId(String authority, String username)
/*    */   {
/* 21 */     this.authority = authority;
/* 22 */     this.username = username;
/*    */   }
/*    */ 
/*    */   @Column(name="authority", nullable=false, length=40)
/*    */   public String getAuthority()
/*    */   {
/* 28 */     return this.authority;
/*    */   }
/*    */ 
/*    */   public void setAuthority(String authority) {
/* 32 */     this.authority = authority;
/*    */   }
/*    */ 
/*    */   @Column(name="username", nullable=false, length=45)
/*    */   public String getUsername() {
/* 37 */     return this.username;
/*    */   }
/*    */ 
/*    */   public void setUsername(String username) {
/* 41 */     this.username = username;
/*    */   }
/*    */ 
/*    */   public boolean equals(Object other)
/*    */   {
/* 46 */     if (this == other) return true;
/* 47 */     if (other == null) return false;
/* 48 */     if (!(other instanceof AuthoritiesId)) return false;
/* 49 */     AuthoritiesId castOther = (AuthoritiesId)other;
/*    */ 
/* 51 */     return ((getAuthority() == castOther.getAuthority()) || ((getAuthority() != null) && (castOther.getAuthority() != null) && (getAuthority().equals(castOther.getAuthority())))) && ((getUsername() == castOther.getUsername()) || ((getUsername() != null) && (castOther.getUsername() != null) && (getUsername().equals(castOther.getUsername()))));
/*    */   }
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 56 */     int result = 17;
/*    */ 
/* 58 */     result = 37 * result + (getAuthority() == null ? 0 : getAuthority().hashCode());
/* 59 */     result = 37 * result + (getUsername() == null ? 0 : getUsername().hashCode());
/* 60 */     return result;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.AuthoritiesId
 * JD-Core Version:    0.6.2
 */
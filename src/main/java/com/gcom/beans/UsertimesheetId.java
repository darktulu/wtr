/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;
/*    */ 
/*    */ @Embeddable
/*    */ public class UsertimesheetId
/*    */   implements Serializable
/*    */ {
/*    */   private String usersUsername;
/*    */   private int timesheetIdtimesheet;
/*    */ 
/*    */   public UsertimesheetId()
/*    */   {
/*    */   }
/*    */ 
/*    */   public UsertimesheetId(String usersUsername, int timesheetIdtimesheet)
/*    */   {
/* 20 */     this.usersUsername = usersUsername;
/* 21 */     this.timesheetIdtimesheet = timesheetIdtimesheet;
/*    */   }
/*    */ 
/*    */   @Column(name="users_username", nullable=false, length=45)
/*    */   public String getUsersUsername() {
/* 26 */     return this.usersUsername;
/*    */   }
/*    */ 
/*    */   public void setUsersUsername(String usersUsername) {
/* 30 */     this.usersUsername = usersUsername;
/*    */   }
/*    */ 
/*    */   @Column(name="timesheet_idtimesheet", nullable=false)
/*    */   public int getTimesheetIdtimesheet() {
/* 35 */     return this.timesheetIdtimesheet;
/*    */   }
/*    */ 
/*    */   public void setTimesheetIdtimesheet(int timesheetIdtimesheet) {
/* 39 */     this.timesheetIdtimesheet = timesheetIdtimesheet;
/*    */   }
/*    */ 
/*    */   public boolean equals(Object other) {
/* 43 */     if (this == other) {
/* 44 */       return true;
/*    */     }
/* 46 */     if (other == null) {
/* 47 */       return false;
/*    */     }
/* 49 */     if (!(other instanceof UsertimesheetId)) {
/* 50 */       return false;
/*    */     }
/* 52 */     UsertimesheetId castOther = (UsertimesheetId)other;
/*    */ 
/* 54 */     return ((getUsersUsername() == castOther.getUsersUsername()) || ((getUsersUsername() != null) && (castOther.getUsersUsername() != null) && (getUsersUsername().equals(castOther.getUsersUsername())))) && (getTimesheetIdtimesheet() == castOther.getTimesheetIdtimesheet());
/*    */   }
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 59 */     int result = 17;
/*    */ 
/* 61 */     result = 37 * result + (getUsersUsername() == null ? 0 : getUsersUsername().hashCode());
/* 62 */     result = 37 * result + getTimesheetIdtimesheet();
/* 63 */     return result;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.UsertimesheetId
 * JD-Core Version:    0.6.2
 */
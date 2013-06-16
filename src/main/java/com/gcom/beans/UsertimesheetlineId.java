/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;
/*    */ 
/*    */ @Embeddable
/*    */ public class UsertimesheetlineId
/*    */   implements Serializable
/*    */ {
/*    */   private String usersHasTimesheetUsersUsername;
/*    */   private int usersHasTimesheetTimesheetIdtimesheet;
/*    */   private int taskIdtask;
/*    */   private Date day;
/*    */ 
/*    */   public UsertimesheetlineId()
/*    */   {
/*    */   }
/*    */ 
/*    */   public UsertimesheetlineId(String usersHasTimesheetUsersUsername, int usersHasTimesheetTimesheetIdtimesheet, int taskIdtask, Date day)
/*    */   {
/* 23 */     this.usersHasTimesheetUsersUsername = usersHasTimesheetUsersUsername;
/* 24 */     this.usersHasTimesheetTimesheetIdtimesheet = usersHasTimesheetTimesheetIdtimesheet;
/* 25 */     this.taskIdtask = taskIdtask;
/* 26 */     this.day = day;
/*    */   }
/*    */ 
/*    */   @Column(name="users_has_timesheet_users_username", nullable=false, length=45)
/*    */   public String getUsersHasTimesheetUsersUsername() {
/* 31 */     return this.usersHasTimesheetUsersUsername;
/*    */   }
/*    */ 
/*    */   public void setUsersHasTimesheetUsersUsername(String usersHasTimesheetUsersUsername) {
/* 35 */     this.usersHasTimesheetUsersUsername = usersHasTimesheetUsersUsername;
/*    */   }
/*    */ 
/*    */   @Column(name="users_has_timesheet_timesheet_idtimesheet", nullable=false)
/*    */   public int getUsersHasTimesheetTimesheetIdtimesheet() {
/* 40 */     return this.usersHasTimesheetTimesheetIdtimesheet;
/*    */   }
/*    */ 
/*    */   public void setUsersHasTimesheetTimesheetIdtimesheet(int usersHasTimesheetTimesheetIdtimesheet) {
/* 44 */     this.usersHasTimesheetTimesheetIdtimesheet = usersHasTimesheetTimesheetIdtimesheet;
/*    */   }
/*    */ 
/*    */   @Column(name="task_idtask", nullable=false)
/*    */   public int getTaskIdtask() {
/* 49 */     return this.taskIdtask;
/*    */   }
/*    */ 
/*    */   public void setTaskIdtask(int taskIdtask) {
/* 53 */     this.taskIdtask = taskIdtask;
/*    */   }
/*    */ 
/*    */   @Column(name="day", nullable=false, length=10)
/*    */   public Date getDay() {
/* 58 */     return this.day;
/*    */   }
/*    */ 
/*    */   public void setDay(Date day) {
/* 62 */     this.day = day;
/*    */   }
/*    */ 
/*    */   public boolean equals(Object other) {
/* 66 */     if (this == other) {
/* 67 */       return true;
/*    */     }
/* 69 */     if (other == null) {
/* 70 */       return false;
/*    */     }
/* 72 */     if (!(other instanceof UsertimesheetlineId)) {
/* 73 */       return false;
/*    */     }
/* 75 */     UsertimesheetlineId castOther = (UsertimesheetlineId)other;
/*    */ 
/* 77 */     return ((getUsersHasTimesheetUsersUsername() == castOther.getUsersHasTimesheetUsersUsername()) || ((getUsersHasTimesheetUsersUsername() != null) && (castOther.getUsersHasTimesheetUsersUsername() != null) && (getUsersHasTimesheetUsersUsername().equals(castOther.getUsersHasTimesheetUsersUsername())))) && (getUsersHasTimesheetTimesheetIdtimesheet() == castOther.getUsersHasTimesheetTimesheetIdtimesheet()) && (getTaskIdtask() == castOther.getTaskIdtask()) && ((getDay() == castOther.getDay()) || ((getDay() != null) && (castOther.getDay() != null) && (getDay().equals(castOther.getDay()))));
/*    */   }
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     int result = 17;
/*    */ 
/* 86 */     result = 37 * result + (getUsersHasTimesheetUsersUsername() == null ? 0 : getUsersHasTimesheetUsersUsername().hashCode());
/* 87 */     result = 37 * result + getUsersHasTimesheetTimesheetIdtimesheet();
/* 88 */     result = 37 * result + getTaskIdtask();
/* 89 */     result = 37 * result + (getDay() == null ? 0 : getDay().hashCode());
/* 90 */     return result;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.UsertimesheetlineId
 * JD-Core Version:    0.6.2
 */
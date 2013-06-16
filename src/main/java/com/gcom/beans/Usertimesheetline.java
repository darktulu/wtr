/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.AttributeOverrides;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.EmbeddedId;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.JoinColumns;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="usertimesheetline")
/*     */ public class Usertimesheetline
/*     */   implements Serializable
/*     */ {
/*     */   private UsertimesheetlineId id;
/*     */   private Task task;
/*     */   private Usertimesheet usertimesheet;
/*     */   private String number;
/*     */   private String other1;
/*     */   private String other2;
/*     */ 
/*     */   public Usertimesheetline()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Usertimesheetline(UsertimesheetlineId id, Task task, Usertimesheet usertimesheet)
/*     */   {
/*  33 */     this.id = id;
/*  34 */     this.task = task;
/*  35 */     this.usertimesheet = usertimesheet;
/*     */   }
/*     */ 
/*     */   public Usertimesheetline(UsertimesheetlineId id, Task task, Usertimesheet usertimesheet, String number, String other1, String other2) {
/*  39 */     this.id = id;
/*  40 */     this.task = task;
/*  41 */     this.usertimesheet = usertimesheet;
/*  42 */     this.number = number;
/*  43 */     this.other1 = other1;
/*  44 */     this.other2 = other2;
/*     */   }
/*     */ 
/*     */   @EmbeddedId
/*     */   @AttributeOverrides({@javax.persistence.AttributeOverride(name="usersHasTimesheetUsersUsername", column=@Column(name="users_has_timesheet_users_username", nullable=false, length=45)), @javax.persistence.AttributeOverride(name="usersHasTimesheetTimesheetIdtimesheet", column=@Column(name="users_has_timesheet_timesheet_idtimesheet", nullable=false)), @javax.persistence.AttributeOverride(name="taskIdtask", column=@Column(name="task_idtask", nullable=false)), @javax.persistence.AttributeOverride(name="day", column=@Column(name="day", nullable=false, length=10))})
/*     */   public UsertimesheetlineId getId()
/*     */   {
/*  58 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(UsertimesheetlineId id) {
/*  62 */     this.id = id;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="task_idtask", nullable=false, insertable=false, updatable=false)
/*     */   public Task getTask() {
/*  68 */     return this.task;
/*     */   }
/*     */ 
/*     */   public void setTask(Task task) {
/*  72 */     this.task = task;
/*     */   }
/*     */ 
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumns({@JoinColumn(name="users_has_timesheet_users_username", referencedColumnName="users_username", nullable=false, insertable=false, updatable=false), @JoinColumn(name="users_has_timesheet_timesheet_idtimesheet", referencedColumnName="timesheet_idtimesheet", nullable=false, insertable=false, updatable=false)})
/*     */   public Usertimesheet getUsertimesheet()
/*     */   {
/*  80 */     return this.usertimesheet;
/*     */   }
/*     */ 
/*     */   public void setUsertimesheet(Usertimesheet usertimesheet) {
/*  84 */     this.usertimesheet = usertimesheet;
/*     */   }
/*     */ 
/*     */   @Column(name="number", length=45)
/*     */   public String getNumber() {
/*  89 */     return this.number;
/*     */   }
/*     */ 
/*     */   public void setNumber(String number) {
/*  93 */     this.number = number;
/*     */   }
/*     */ 
/*     */   @Column(name="other1", length=45)
/*     */   public String getOther1() {
/*  98 */     return this.other1;
/*     */   }
/*     */ 
/*     */   public void setOther1(String other1) {
/* 102 */     this.other1 = other1;
/*     */   }
/*     */ 
/*     */   @Column(name="other2", length=45)
/*     */   public String getOther2() {
/* 107 */     return this.other2;
/*     */   }
/*     */ 
/*     */   public void setOther2(String other2) {
/* 111 */     this.other2 = other2;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Usertimesheetline
 * JD-Core Version:    0.6.2
 */
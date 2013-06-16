/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import javax.persistence.AttributeOverrides;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.EmbeddedId;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="usertimesheet")
/*     */ public class Usertimesheet
/*     */   implements Serializable
/*     */ {
/*     */   private UsertimesheetId id;
/*     */   private Users users;
/*     */   private Timesheet timesheet;
/*     */   private String status;
/*     */   private Date entryDate;
/*     */   private String motif;
/*  34 */   private Set<Usertimesheetline> usertimesheetlines = new HashSet(0);
/*     */ 
/*     */   public Usertimesheet() {
/*     */   }
/*     */ 
/*     */   public Usertimesheet(UsertimesheetId id, Users users, Timesheet timesheet) {
/*  40 */     this.id = id;
/*  41 */     this.users = users;
/*  42 */     this.timesheet = timesheet;
/*     */   }
/*     */ 
/*     */   public Usertimesheet(UsertimesheetId id, Users users, Timesheet timesheet, String status, Date entryDate, String motif, Set<Usertimesheetline> usertimesheetlines) {
/*  46 */     this.id = id;
/*  47 */     this.users = users;
/*  48 */     this.timesheet = timesheet;
/*  49 */     this.status = status;
/*  50 */     this.entryDate = entryDate;
/*  51 */     this.motif = motif;
/*  52 */     this.usertimesheetlines = usertimesheetlines;
/*     */   }
/*     */ 
/*     */   @EmbeddedId
/*     */   @AttributeOverrides({@javax.persistence.AttributeOverride(name="usersUsername", column=@Column(name="users_username", nullable=false, length=45)), @javax.persistence.AttributeOverride(name="timesheetIdtimesheet", column=@Column(name="timesheet_idtimesheet", nullable=false))})
/*     */   public UsertimesheetId getId()
/*     */   {
/*  62 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(UsertimesheetId id) {
/*  66 */     this.id = id;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="users_username", nullable=false, insertable=false, updatable=false)
/*     */   public Users getUsers() {
/*  72 */     return this.users;
/*     */   }
/*     */ 
/*     */   public void setUsers(Users users) {
/*  76 */     this.users = users;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="timesheet_idtimesheet", nullable=false, insertable=false, updatable=false)
/*     */   public Timesheet getTimesheet() {
/*  82 */     return this.timesheet;
/*     */   }
/*     */ 
/*     */   public void setTimesheet(Timesheet timesheet) {
/*  86 */     this.timesheet = timesheet;
/*     */   }
/*     */ 
/*     */   @Column(name="status", length=45)
/*     */   public String getStatus() {
/*  91 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/*  95 */     this.status = status;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="entryDate", length=10)
/*     */   public Date getEntryDate() {
/* 101 */     return this.entryDate;
/*     */   }
/*     */ 
/*     */   public void setEntryDate(Date entryDate) {
/* 105 */     this.entryDate = entryDate;
/*     */   }
/*     */ 
/*     */   @Column(name="motif", length=1000)
/*     */   public String getMotif() {
/* 110 */     return this.motif;
/*     */   }
/*     */ 
/*     */   public void setMotif(String motif) {
/* 114 */     this.motif = motif;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="usertimesheet")
/*     */   public Set<Usertimesheetline> getUsertimesheetlines() {
/* 119 */     return this.usertimesheetlines;
/*     */   }
/*     */ 
/*     */   public void setUsertimesheetlines(Set<Usertimesheetline> usertimesheetlines) {
/* 123 */     this.usertimesheetlines = usertimesheetlines;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Usertimesheet
 * JD-Core Version:    0.6.2
 */
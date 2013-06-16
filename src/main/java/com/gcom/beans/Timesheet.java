/*     */ package com.gcom.beans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="timesheet")
/*     */ public class Timesheet
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idtimesheet;
/*     */   private Date start;
/*     */   private Date end;
/*     */   private Date entryStrat;
/*     */   private Date entryEnd;
/*     */   private String year;
/*     */   private String month;
/*     */   private String daysoff;
/*     */   private String statys;
/*  35 */   private Set<Usertimesheet> usertimesheets = new HashSet(0);
/*     */ 
/*     */   public Timesheet() {
/*     */   }
/*     */ 
/*     */   public Timesheet(Date start, Date end, Date entryStrat, Date entryEnd, String year, String month, String daysoff, String statys, Set<Usertimesheet> usertimesheets) {
/*  41 */     this.start = start;
/*  42 */     this.end = end;
/*  43 */     this.entryStrat = entryStrat;
/*  44 */     this.entryEnd = entryEnd;
/*  45 */     this.year = year;
/*  46 */     this.month = month;
/*  47 */     this.daysoff = daysoff;
/*  48 */     this.statys = statys;
/*  49 */     this.usertimesheets = usertimesheets;
/*     */   }
/*  56 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idtimesheet", unique=true, nullable=false)
/*     */   public Integer getIdtimesheet() { return this.idtimesheet; }
/*     */ 
/*     */   public void setIdtimesheet(Integer idtimesheet)
/*     */   {
/*  60 */     this.idtimesheet = idtimesheet;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="start", length=10)
/*     */   public Date getStart() {
/*  66 */     return this.start;
/*     */   }
/*     */ 
/*     */   public void setStart(Date start) {
/*  70 */     this.start = start;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="end", length=10)
/*     */   public Date getEnd() {
/*  76 */     return this.end;
/*     */   }
/*     */ 
/*     */   public void setEnd(Date end) {
/*  80 */     this.end = end;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="entryStrat", length=10)
/*     */   public Date getEntryStrat() {
/*  86 */     return this.entryStrat;
/*     */   }
/*     */ 
/*     */   public void setEntryStrat(Date entryStrat) {
/*  90 */     this.entryStrat = entryStrat;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="entryEnd", length=10)
/*     */   public Date getEntryEnd() {
/*  96 */     return this.entryEnd;
/*     */   }
/*     */ 
/*     */   public void setEntryEnd(Date entryEnd) {
/* 100 */     this.entryEnd = entryEnd;
/*     */   }
/*     */ 
/*     */   @Column(name="year", length=45)
/*     */   public String getYear() {
/* 105 */     return this.year;
/*     */   }
/*     */ 
/*     */   public void setYear(String year) {
/* 109 */     this.year = year;
/*     */   }
/*     */ 
/*     */   @Column(name="month", length=45)
/*     */   public String getMonth() {
/* 114 */     return this.month;
/*     */   }
/*     */ 
/*     */   public void setMonth(String month) {
/* 118 */     this.month = month;
/*     */   }
/*     */ 
/*     */   @Column(name="daysoff", length=500)
/*     */   public String getDaysoff() {
/* 123 */     return this.daysoff;
/*     */   }
/*     */ 
/*     */   public void setDaysoff(String daysoff) {
/* 127 */     this.daysoff = daysoff;
/*     */   }
/*     */ 
/*     */   @Column(name="statys", length=45)
/*     */   public String getStatys() {
/* 132 */     return this.statys;
/*     */   }
/*     */ 
/*     */   public void setStatys(String statys) {
/* 136 */     this.statys = statys;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="timesheet")
/*     */   public Set<Usertimesheet> getUsertimesheets() {
/* 141 */     return this.usertimesheets;
/*     */   }
/*     */ 
/*     */   public void setUsertimesheets(Set<Usertimesheet> usertimesheets) {
/* 145 */     this.usertimesheets = usertimesheets;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Timesheet
 * JD-Core Version:    0.6.2
 */
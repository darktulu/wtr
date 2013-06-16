/*    */ package com.gcom.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="task")
/*    */ public class Task
/*    */   implements Serializable
/*    */ {
/*    */   private Integer idtask;
/*    */   private Project project;
/*    */   private String name;
/* 28 */   private Set<Usertimesheetline> usertimesheetlines = new HashSet(0);
/*    */ 
/*    */   public Task() {
/*    */   }
/*    */ 
/*    */   public Task(Project project) {
/* 34 */     this.project = project;
/*    */   }
/*    */ 
/*    */   public Task(Project project, String name, Set<Usertimesheetline> usertimesheetlines) {
/* 38 */     this.project = project;
/* 39 */     this.name = name;
/* 40 */     this.usertimesheetlines = usertimesheetlines;
/*    */   }
/* 47 */   @Id
/*    */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    */   @Column(name="idtask", unique=true, nullable=false)
/*    */   public Integer getIdtask() { return this.idtask; }
/*    */ 
/*    */   public void setIdtask(Integer idtask)
/*    */   {
/* 51 */     this.idtask = idtask;
/*    */   }
/*    */   @ManyToOne(fetch=FetchType.LAZY)
/*    */   @JoinColumn(name="project_idproject", nullable=false)
/*    */   public Project getProject() {
/* 57 */     return this.project;
/*    */   }
/*    */ 
/*    */   public void setProject(Project project) {
/* 61 */     this.project = project;
/*    */   }
/*    */ 
/*    */   @Column(name="name", length=999)
/*    */   public String getName() {
/* 66 */     return this.name;
/*    */   }
/*    */ 
/*    */   public void setName(String name) {
/* 70 */     this.name = name;
/*    */   }
/*    */ 
/*    */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="task")
/*    */   public Set<Usertimesheetline> getUsertimesheetlines() {
/* 75 */     return this.usertimesheetlines;
/*    */   }
/*    */ 
/*    */   public void setUsertimesheetlines(Set<Usertimesheetline> usertimesheetlines) {
/* 79 */     this.usertimesheetlines = usertimesheetlines;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Task
 * JD-Core Version:    0.6.2
 */
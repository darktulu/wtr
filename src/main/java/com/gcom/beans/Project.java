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
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="project")
/*     */ public class Project
/*     */   implements Serializable
/*     */ {
/*     */   private Integer idproject;
/*     */   private Customer customer;
/*     */   private Costcenter costcenter;
/*     */   private String name;
/*     */   private String manager;
/*     */   private Date startDate;
/*     */   private Date endDate;
/*     */   private String duration;
/*     */   private Double baseLineCost;
/*     */   private Double plannedRevenue;
/*     */   private Double plannedMargin;
/*     */   private String status;
/*     */   private String currency;
/*  41 */   private Set<Task> tasks = new HashSet(0);
/*  42 */   private Set<Budget> budgets = new HashSet(0);
/*  43 */   private Set<Wtr> wtrs = new HashSet(0);
/*  44 */   private Set<Po> pos = new HashSet(0);
            private String project_type;
			private String manager_idmanager;
            
            
/*     */ 
/*     */   public Project() {
/*     */   }
/*     */ 
/*     */   public Project(Customer customer, Costcenter costcenter) {
/*  50 */     this.customer = customer;
/*  51 */     this.costcenter = costcenter;
/*     */   }
/*     */ 
/*     */   public Project(Customer customer, Costcenter costcenter, String name, String manager, Date startDate, Date endDate, String duration, Double baseLineCost, Double plannedRevenue, Double plannedMargin, String status, String currency, Set<Task> tasks, Set<Budget> budgets, Set<Wtr> wtrs, Set<Po> pos) {
/*  55 */     this.customer = customer;
/*  56 */     this.costcenter = costcenter;
/*  57 */     this.name = name;
/*  58 */     this.manager = manager;
/*  59 */     this.startDate = startDate;
/*  60 */     this.endDate = endDate;
/*  61 */     this.duration = duration;
/*  62 */     this.baseLineCost = baseLineCost;
/*  63 */     this.plannedRevenue = plannedRevenue;
/*  64 */     this.plannedMargin = plannedMargin;
/*  65 */     this.status = status;
/*  66 */     this.currency = currency;
/*  67 */     this.tasks = tasks;
/*  68 */     this.budgets = budgets;
/*  69 */     this.wtrs = wtrs;
/*  70 */     this.pos = pos;
/*     */   }
/*  77 */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.IDENTITY)
/*     */   @Column(name="idproject", unique=true, nullable=false)
/*     */   public Integer getIdproject() { return this.idproject; }
/*     */ 
/*     */   public void setIdproject(Integer idproject)
/*     */   {
/*  81 */     this.idproject = idproject;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="customer_idcustomer", nullable=false)
/*     */   public Customer getCustomer() {
/*  87 */     return this.customer;
/*     */   }
/*     */ 
/*     */   public void setCustomer(Customer customer) {
/*  91 */     this.customer = customer;
/*     */   }
/*     */   @ManyToOne(fetch=FetchType.LAZY)
/*     */   @JoinColumn(name="costCenter_idcostCenter", nullable=false)
/*     */   public Costcenter getCostcenter() {
/*  97 */     return this.costcenter;
/*     */   }
/*     */ 
/*     */   public void setCostcenter(Costcenter costcenter) {
/* 101 */     this.costcenter = costcenter;
/*     */   }
/*     */ 
/*     */   @Column(name="name", length=45)
/*     */   public String getName() {
/* 106 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String name) {
/* 110 */     this.name = name;
/*     */   }
/*     */ 
/*     */   @Column(name="manager", length=45)
/*     */   public String getManager() {
/* 115 */     return this.manager;
/*     */   }
/*     */ 
/*     */   public void setManager(String manager) {
/* 119 */     this.manager = manager;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="startDate", length=10)
/*     */   public Date getStartDate() {
/* 125 */     return this.startDate;
/*     */   }
/*     */ 
/*     */   public void setStartDate(Date startDate) {
/* 129 */     this.startDate = startDate;
/*     */   }
/*     */   @Temporal(TemporalType.DATE)
/*     */   @Column(name="endDate", length=10)
/*     */   public Date getEndDate() {
/* 135 */     return this.endDate;
/*     */   }
/*     */ 
/*     */   public void setEndDate(Date endDate) {
/* 139 */     this.endDate = endDate;
/*     */   }
/*     */ 
/*     */   @Column(name="duration", length=45)
/*     */   public String getDuration() {
/* 144 */     return this.duration;
/*     */   }
/*     */ 
/*     */   public void setDuration(String duration) {
/* 148 */     this.duration = duration;
/*     */   }
/*     */ 
/*     */   @Column(name="baseLineCost", precision=22, scale=0)
/*     */   public Double getBaseLineCost() {
/* 153 */     return this.baseLineCost;
/*     */   }
/*     */ 
/*     */   public void setBaseLineCost(Double baseLineCost) {
/* 157 */     this.baseLineCost = baseLineCost;
/*     */   }
/*     */ 
/*     */   @Column(name="plannedRevenue", precision=22, scale=0)
/*     */   public Double getPlannedRevenue() {
/* 162 */     return this.plannedRevenue;
/*     */   }
/*     */ 
/*     */   public void setPlannedRevenue(Double plannedRevenue) {
/* 166 */     this.plannedRevenue = plannedRevenue;
/*     */   }
/*     */ 
/*     */   @Column(name="plannedMargin", precision=22, scale=0)
/*     */   public Double getPlannedMargin() {
/* 171 */     return this.plannedMargin;
/*     */   }
/*     */ 
/*     */   public void setPlannedMargin(Double plannedMargin) {
/* 175 */     this.plannedMargin = plannedMargin;
/*     */   }
/*     */ 
/*     */   @Column(name="status", length=45)
/*     */   public String getStatus() {
/* 180 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status) {
/* 184 */     this.status = status;
/*     */   }
/*     */ 
/*     */   @Column(name="currency", length=45)
/*     */   public String getCurrency() {
/* 189 */     return this.currency;
/*     */   }
/*     */ 
/*     */   public void setCurrency(String currency) {
/* 193 */     this.currency = currency;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="project")
/*     */   public Set<Task> getTasks() {
/* 198 */     return this.tasks;
/*     */   }
/*     */ 
/*     */   public void setTasks(Set<Task> tasks) {
/* 202 */     this.tasks = tasks;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="project")
/*     */   public Set<Budget> getBudgets() {
/* 207 */     return this.budgets;
/*     */   }
/*     */ 
/*     */   public void setBudgets(Set<Budget> budgets) {
/* 211 */     this.budgets = budgets;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="project")
/*     */   public Set<Wtr> getWtrs() {
/* 216 */     return this.wtrs;
/*     */   }
/*     */ 
/*     */   public void setWtrs(Set<Wtr> wtrs) {
/* 220 */     this.wtrs = wtrs;
/*     */   }
/*     */ 
/*     */   @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="project")
/*     */   public Set<Po> getPos() {
/* 225 */     return this.pos;
/*     */   }
/*     */ 
/*     */   public void setPos(Set<Po> pos) {
/* 229 */     this.pos = pos;
/*     */   }
/*     */   
            @Column(name="project_type", length=45)
			public String getProject_type() {
				return project_type;
			}
			public void setProject_type(String project_type) {
				this.project_type = project_type;
			}

			@Column(name="manager_idmanager", length=45)
			public String getManager_idmanager() {
				return manager_idmanager;
			}
			public void setManager_idmanager(String manager_idmanager) {
				this.manager_idmanager = manager_idmanager;
			} }

/* Location:           C:\Users\Bazinga\Desktop\classes\
 * Qualified Name:     com.wadia.beans.Project
 * JD-Core Version:    0.6.2
 */
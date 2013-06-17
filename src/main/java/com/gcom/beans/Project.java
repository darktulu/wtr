package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "project")
public class Project implements Serializable {
    private Integer idproject;
    private Customer customer;
    private Costcenter costcenter;
    private String name;
    private String manager;
    private Date startDate;
    private Date endDate;
    private String duration;
    private Double baseLineCost;
    private Double plannedRevenue;
    private Double plannedMargin;
    private String status;
    private String currency;
    private Set<Task> tasks = new HashSet(0);
    private Set<Budget> budgets = new HashSet(0);
    private Set<Wtr> wtrs = new HashSet(0);
    private Set<Po> pos = new HashSet(0);
    private String project_type;
    private String manager_idmanager;


    public Project() {
    }

    public Project(Customer customer, Costcenter costcenter) {
        this.customer = customer;
        this.costcenter = costcenter;
    }

    public Project(Customer customer, Costcenter costcenter, String name, String manager, Date startDate, Date endDate, String duration, Double baseLineCost, Double plannedRevenue, Double plannedMargin, String status, String currency, Set<Task> tasks, Set<Budget> budgets, Set<Wtr> wtrs, Set<Po> pos) {
        this.customer = customer;
        this.costcenter = costcenter;
        this.name = name;
        this.manager = manager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.duration = duration;
        this.baseLineCost = baseLineCost;
        this.plannedRevenue = plannedRevenue;
        this.plannedMargin = plannedMargin;
        this.status = status;
        this.currency = currency;
        this.tasks = tasks;
        this.budgets = budgets;
        this.wtrs = wtrs;
        this.pos = pos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproject", unique = true, nullable = false)
    public Integer getIdproject() {
        return this.idproject;
    }

    public void setIdproject(Integer idproject) {
        this.idproject = idproject;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_idcustomer", nullable = false)
    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "costCenter_idcostCenter", nullable = false)
    public Costcenter getCostcenter() {
        return this.costcenter;
    }

    public void setCostcenter(Costcenter costcenter) {
        this.costcenter = costcenter;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "manager", length = 45)
    public String getManager() {
        return this.manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "startDate", length = 10)
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "endDate", length = 10)
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Column(name = "duration", length = 45)
    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Column(name = "baseLineCost", precision = 22, scale = 0)
    public Double getBaseLineCost() {
        return this.baseLineCost;
    }

    public void setBaseLineCost(Double baseLineCost) {
        this.baseLineCost = baseLineCost;
    }

    @Column(name = "plannedRevenue", precision = 22, scale = 0)
    public Double getPlannedRevenue() {
        return this.plannedRevenue;
    }

    public void setPlannedRevenue(Double plannedRevenue) {
        this.plannedRevenue = plannedRevenue;
    }

    @Column(name = "plannedMargin", precision = 22, scale = 0)
    public Double getPlannedMargin() {
        return this.plannedMargin;
    }

    public void setPlannedMargin(Double plannedMargin) {
        this.plannedMargin = plannedMargin;
    }

    @Column(name = "status", length = 45)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "currency", length = 45)
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "project")
    public Set<Task> getTasks() {
        return this.tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "project")
    public Set<Budget> getBudgets() {
        return this.budgets;
    }

    public void setBudgets(Set<Budget> budgets) {
        this.budgets = budgets;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "project")
    public Set<Wtr> getWtrs() {
        return this.wtrs;
    }

    public void setWtrs(Set<Wtr> wtrs) {
        this.wtrs = wtrs;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "project")
    public Set<Po> getPos() {
        return this.pos;
    }

    public void setPos(Set<Po> pos) {
        this.pos = pos;
    }

    @Column(name = "project_type", length = 45)
    public String getProject_type() {
        return project_type;
    }

    public void setProject_type(String project_type) {
        this.project_type = project_type;
    }

    @Column(name = "manager_idmanager", length = 45)
    public String getManager_idmanager() {
        return manager_idmanager;
    }

    public void setManager_idmanager(String manager_idmanager) {
        this.manager_idmanager = manager_idmanager;
    }
}

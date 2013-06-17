package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "costcenter")
public class Costcenter implements Serializable {
    private Integer idcostCenter;
    private Lob lob;
    private String year;
    private Double budget;
    private String status;
    private String currency;
    private Set<Project> projects = new HashSet(0);

    public Costcenter() {
    }

    public Costcenter(Lob lob) {
        this.lob = lob;
    }

    public Costcenter(Lob lob, String year, Double budget, String status, String currency, Set<Project> projects) {
        this.lob = lob;
        this.year = year;
        this.budget = budget;
        this.status = status;
        this.currency = currency;
        this.projects = projects;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcostCenter", unique = true, nullable = false)
    public Integer getIdcostCenter() {
        return this.idcostCenter;
    }

    public void setIdcostCenter(Integer idcostCenter) {
        this.idcostCenter = idcostCenter;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lob_idlob", nullable = false)
    public Lob getLob() {
        return this.lob;
    }

    public void setLob(Lob lob) {
        this.lob = lob;
    }

    @Column(name = "year", length = 45)
    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Column(name = "budget", precision = 22, scale = 0)
    public Double getBudget() {
        return this.budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
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

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "costcenter")
    public Set<Project> getProjects() {
        return this.projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}

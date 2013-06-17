package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "bu")
public class Bu implements Serializable {
    private Integer idbu;
    private Company company;
    private String name;
    private String operatingSector;
    private String director;
    private String operationsDirector;
    private String financeManager;
    private String technicalDirector;
    private String hrDirector;
    private String linkGed;
    private Set<Lob> lobs = new HashSet(0);

    public Bu() {
    }

    public Bu(Company company) {
        this.company = company;
    }

    public Bu(Company company, String name, String operatingSector, String director, String operationsDirector, String financeManager, String technicalDirector, String hrDirector, String linkGed, Set<Lob> lobs) {
        this.company = company;
        this.name = name;
        this.operatingSector = operatingSector;
        this.director = director;
        this.operationsDirector = operationsDirector;
        this.financeManager = financeManager;
        this.technicalDirector = technicalDirector;
        this.hrDirector = hrDirector;
        this.linkGed = linkGed;
        this.lobs = lobs;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbu", unique = true, nullable = false)
    public Integer getIdbu() {
        return this.idbu;
    }

    public void setIdbu(Integer idbu) {
        this.idbu = idbu;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_idcompany", nullable = false)
    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "operatingSector", length = 45)
    public String getOperatingSector() {
        return this.operatingSector;
    }

    public void setOperatingSector(String operatingSector) {
        this.operatingSector = operatingSector;
    }

    @Column(name = "director", length = 45)
    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Column(name = "operationsDirector", length = 45)
    public String getOperationsDirector() {
        return this.operationsDirector;
    }

    public void setOperationsDirector(String operationsDirector) {
        this.operationsDirector = operationsDirector;
    }

    @Column(name = "financeManager", length = 45)
    public String getFinanceManager() {
        return this.financeManager;
    }

    public void setFinanceManager(String financeManager) {
        this.financeManager = financeManager;
    }

    @Column(name = "technicalDirector", length = 45)
    public String getTechnicalDirector() {
        return this.technicalDirector;
    }

    public void setTechnicalDirector(String technicalDirector) {
        this.technicalDirector = technicalDirector;
    }

    @Column(name = "hrDirector", length = 45)
    public String getHrDirector() {
        return this.hrDirector;
    }

    public void setHrDirector(String hrDirector) {
        this.hrDirector = hrDirector;
    }

    @Column(name = "linkGed", length = 45)
    public String getLinkGed() {
        return this.linkGed;
    }

    public void setLinkGed(String linkGed) {
        this.linkGed = linkGed;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "bu")
    public Set<Lob> getLobs() {
        return this.lobs;
    }

    public void setLobs(Set<Lob> lobs) {
        this.lobs = lobs;
    }
}

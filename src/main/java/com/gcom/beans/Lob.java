package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lob")
public class Lob implements Serializable {
    private Integer idlob;
    private Bu bu;
    private String name;
    private String description;
    private String manager;
    private String linkGed;
    private String manager_idmanager;
    private Set<Costcenter> costcenters = new HashSet(0);
    private Set<Affectation> affectations = new HashSet(0);

    public Lob() {
    }

    public Lob(Bu bu) {
        this.bu = bu;
    }

    public Lob(Bu bu, String name, String description, String manager, String linkGed, Set<Costcenter> costcenters, Set<Affectation> affectations) {
        this.bu = bu;
        this.name = name;
        this.description = description;
        this.manager = manager;
        this.linkGed = linkGed;
        this.costcenters = costcenters;
        this.affectations = affectations;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlob", unique = true, nullable = false)
    public Integer getIdlob() {
        return this.idlob;
    }

    public void setIdlob(Integer idlob) {
        this.idlob = idlob;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bu_idbu", nullable = false)
    public Bu getBu() {
        return this.bu;
    }

    public void setBu(Bu bu) {
        this.bu = bu;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description", length = 500)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "manager", length = 45)
    public String getManager() {
        return this.manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Column(name = "linkGed", length = 45)
    public String getLinkGed() {
        return this.linkGed;
    }

    public void setLinkGed(String linkGed) {
        this.linkGed = linkGed;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "lob")
    public Set<Costcenter> getCostcenters() {
        return this.costcenters;
    }

    public void setCostcenters(Set<Costcenter> costcenters) {
        this.costcenters = costcenters;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "lob")
    public Set<Affectation> getAffectations() {
        return this.affectations;
    }

    public void setAffectations(Set<Affectation> affectations) {
        this.affectations = affectations;
    }

    @Column(name = "manager_idmanager", length = 45)
    public String getManager_idmanager() {
        return manager_idmanager;
    }

    public void setManager_idmanager(String manager_idmanager) {
        this.manager_idmanager = manager_idmanager;
    }
}

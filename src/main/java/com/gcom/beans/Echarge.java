package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "echarge")
public class Echarge implements Serializable {
    private Integer id;
    private String nom;
    private String resourceId;
    private int mois;
    private int ans;

    public Echarge() {
    }

    public Echarge(String nom, String resourceId, int mois, int ans) {
        this.nom = nom;
        this.resourceId = resourceId;
        this.mois = mois;
        this.ans = ans;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nom", nullable = false, length = 500)
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Column(name = "resource_id", nullable = false, length = 500)
    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Column(name = "mois", nullable = false)
    public int getMois() {
        return this.mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    @Column(name = "ans", nullable = false)
    public int getAns() {
        return this.ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}

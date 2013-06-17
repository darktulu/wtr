package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "e_prime")
public class EPrime implements Serializable {
    private Integer idPrime;
    private String resourceId;
    private String nom;
    private float montant;
    private String type;
    private String commentaire;
    private int mois;
    private int ans;

    public EPrime() {
    }

    public EPrime(String resourceId, String nom, float montant, String type, int mois, int ans) {
        this.resourceId = resourceId;
        this.nom = nom;
        this.montant = montant;
        this.type = type;
        this.mois = mois;
        this.ans = ans;
    }

    public EPrime(String resourceId, String nom, float montant, String type, String commentaire, int mois, int ans) {
        this.resourceId = resourceId;
        this.nom = nom;
        this.montant = montant;
        this.type = type;
        this.commentaire = commentaire;
        this.mois = mois;
        this.ans = ans;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prime", unique = true, nullable = false)
    public Integer getIdPrime() {
        return this.idPrime;
    }

    public void setIdPrime(Integer idPrime) {
        this.idPrime = idPrime;
    }

    @Column(name = "resource_id", nullable = false, length = 500)
    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Column(name = "nom", nullable = false, length = 500)
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Column(name = "montant", nullable = false, precision = 12, scale = 0)
    public float getMontant() {
        return this.montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    @Column(name = "type", nullable = false, length = 100)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "commentaire", length = 500)
    public String getCommentaire() {
        return this.commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
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

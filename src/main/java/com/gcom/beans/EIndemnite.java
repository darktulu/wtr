package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "e_indemnite")
public class EIndemnite implements Serializable {
    private Integer idIndem;
    private String resureceId;
    private String nom;
    private String type;
    private float montant;
    private String commentaire;
    private int mois;
    private int ans;

    public EIndemnite() {
    }

    public EIndemnite(String resureceId, String nom, String type, float montant, int mois, int ans) {
        this.resureceId = resureceId;
        this.nom = nom;
        this.type = type;
        this.montant = montant;
        this.mois = mois;
        this.ans = ans;
    }

    public EIndemnite(String resureceId, String nom, String type, float montant, String commentaire, int mois, int ans) {
        this.resureceId = resureceId;
        this.nom = nom;
        this.type = type;
        this.montant = montant;
        this.commentaire = commentaire;
        this.mois = mois;
        this.ans = ans;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_indem", unique = true, nullable = false)
    public Integer getIdIndem() {
        return this.idIndem;
    }

    public void setIdIndem(Integer idIndem) {
        this.idIndem = idIndem;
    }

    @Column(name = "resurece_id", nullable = false, length = 500)
    public String getResureceId() {
        return this.resureceId;
    }

    public void setResureceId(String resureceId) {
        this.resureceId = resureceId;
    }

    @Column(name = "nom", nullable = false, length = 500)
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Column(name = "type", nullable = false, length = 50)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "montant", nullable = false, precision = 12, scale = 0)
    public float getMontant() {
        return this.montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
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

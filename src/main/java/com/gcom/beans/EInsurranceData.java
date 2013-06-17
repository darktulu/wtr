package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "e_insurrance_data")
public class EInsurranceData implements Serializable {
    private Integer inssuranceId;
    private String resurceId;
    private String matricule;
    private Date date;
    private String type;
    private Date dateSoins;
    private String dossier;
    private String personName;
    private String totalAmount;
    private String status;
    private String statusDescription;
    private int numberOfPieces;

    public EInsurranceData() {
    }

    public EInsurranceData(String resurceId) {
        this.resurceId = resurceId;
    }

    public EInsurranceData(String resurceId, String matricule, Date date, String type, Date dateSoins, String dossier, String personName, String totalAmount, String status, String statusDescription) {
        this.resurceId = resurceId;
        this.matricule = matricule;
        this.date = date;
        this.type = type;
        this.dateSoins = dateSoins;
        this.dossier = dossier;
        this.personName = personName;
        this.totalAmount = totalAmount;
        this.status = status;
        this.statusDescription = statusDescription;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INSSURANCE_ID", unique = true, nullable = false)
    public Integer getInssuranceId() {
        return this.inssuranceId;
    }

    public void setInssuranceId(Integer inssuranceId) {
        this.inssuranceId = inssuranceId;
    }

    @Column(name = "RESURCE_ID", nullable = false, length = 500)
    public String getResurceId() {
        return this.resurceId;
    }

    public void setResurceId(String resurceId) {
        this.resurceId = resurceId;
    }

    @Column(name = "matricule", length = 500)
    public String getMatricule() {
        return this.matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE", length = 10)
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "TYPE", length = 100)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date_soins", length = 10)
    public Date getDateSoins() {
        return this.dateSoins;
    }

    public void setDateSoins(Date dateSoins) {
        this.dateSoins = dateSoins;
    }

    @Column(name = "dossier", length = 500)
    public String getDossier() {
        return this.dossier;
    }

    public void setDossier(String dossier) {
        this.dossier = dossier;
    }

    @Column(name = "PERSON_NAME", length = 100)
    public String getPersonName() {
        return this.personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Column(name = "TOTAL_AMOUNT")
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Column(name = "STATUS", length = 100)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "STATUS_DESCRIPTION", length = 500)
    public String getStatusDescription() {
        return this.statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public int getNumberOfPieces() {
        return this.numberOfPieces;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }
}

package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "insurrance_chronology")
public class InssuranceChronology implements Serializable {
    private Integer inssuranceChronologyID;
    private String resurceId;
    private String matricule;
    private String status;
    private Date whenUpdated;

    public InssuranceChronology() {
    }

    public InssuranceChronology(String resurceId, String matricule, String status, Date whenUpdated) {
        this.resurceId = resurceId;
        this.matricule = matricule;
        this.status = status;
        this.whenUpdated = whenUpdated;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INSSURANCE_CHRONOLOGY_ID", unique = true, nullable = false)
    public Integer getInssuranceChronologyID() {
        return this.inssuranceChronologyID;
    }

    public void setInssuranceChronologyID(Integer inssuranceChronologyID) {
        this.inssuranceChronologyID = inssuranceChronologyID;
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

    @Column(name = "STATUS", length = 500)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "WHEN_UPDATED", length = 10)
    public Date getWhenUpdated() {
        return this.whenUpdated;
    }

    public void setWhenUpdated(Date whenUpdated) {
        this.whenUpdated = whenUpdated;
    }
}

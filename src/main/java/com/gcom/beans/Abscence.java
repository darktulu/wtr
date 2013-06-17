package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "abscence")
public class Abscence implements Serializable {
    private Integer id;
    private String ressourceId;
    private Date startDay;
    private Date endDay;
    private int nbDays;
    private String justified;
    private String reason;
    private String type;

    public Abscence() {
    }

    public Abscence(String ressourceId, Date startDay, Date endDay, int nbDays,
                    String justified, String reason) {
        this.ressourceId = ressourceId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.nbDays = nbDays;
        this.justified = justified;
        this.reason = reason;
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

    @Column(name = "ressource_id", nullable = false, length = 500)
    public String getRessourceId() {
        return this.ressourceId;
    }

    public void setRessourceId(String ressourceId) {
        this.ressourceId = ressourceId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "start_day", nullable = false, length = 10)
    public Date getStartDay() {
        return this.startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "end_day", nullable = false, length = 10)
    public Date getEndDay() {
        return this.endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    @Column(name = "nb_days", nullable = false)
    public int getNbDays() {
        return this.nbDays;
    }

    public void setNbDays(int nbDays) {
        this.nbDays = nbDays;
    }

    @Column(name = "justified", nullable = false, length = 50)
    public String getJustified() {
        return this.justified;
    }

    public void setJustified(String justified) {
        this.justified = justified;
    }

    @Column(name = "reason", length = 500)
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getType() {
        return type;
    }

    @Column(name = "type", length = 500)
    public void setType(String type) {
        this.type = type;
    }
}

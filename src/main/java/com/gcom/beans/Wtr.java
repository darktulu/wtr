package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "wtr")
public class Wtr implements Serializable {
    private Integer idwtr;
    private Project project;
    private Date dateWtr;
    private Double duration;

    public Wtr() {
    }

    public Wtr(Project project, Date dateWtr, Double duration) {
        this.project = project;
        this.dateWtr = dateWtr;
        this.duration = duration;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idwtr", unique = true, nullable = false)
    public Integer getIdwtr() {
        return this.idwtr;
    }

    public void setIdwtr(Integer idwtr) {
        this.idwtr = idwtr;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_idProject")
    public Project getProject() {
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dateWtr", length = 10)
    public Date getDateWtr() {
        return this.dateWtr;
    }

    public void setDateWtr(Date dateWtr) {
        this.dateWtr = dateWtr;
    }

    @Column(name = "duration", precision = 22, scale = 0)
    public Double getDuration() {
        return this.duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}

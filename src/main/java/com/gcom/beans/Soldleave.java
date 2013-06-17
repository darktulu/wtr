package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "soldleave")
public class Soldleave implements Serializable {
    private Integer id;
    private String resourceId;
    private Integer year;
    private Integer sold;
    private Integer consumed;
    private Integer planned;
    private String status;

    public Soldleave() {
    }

    public Soldleave(String resourceId) {
        this.resourceId = resourceId;
    }

    public Soldleave(String resourceId, Integer year, Integer sold, Integer consumed, Integer planned) {
        this.resourceId = resourceId;
        this.year = year;
        this.sold = sold;
        this.consumed = consumed;
        this.planned = planned;
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

    @Column(name = "resourceID", nullable = false, length = 500)
    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Column(name = "year")
    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Column(name = "sold")
    public Integer getSold() {
        return this.sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    @Column(name = "consumed")
    public Integer getConsumed() {
        return this.consumed;
    }

    public void setConsumed(Integer consumed) {
        this.consumed = consumed;
    }

    @Column(name = "planned")
    public Integer getPlanned() {
        return this.planned;
    }

    public void setPlanned(Integer planned) {
        this.planned = planned;
    }

    @Column(name = "Status", length = 300)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

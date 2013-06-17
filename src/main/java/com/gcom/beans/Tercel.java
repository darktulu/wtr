package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tercel")
public class Tercel implements Serializable {
    private Integer tercelId;
    private String resourceId;
    private Integer tercMin;
    private Integer tercMidle;
    private Integer tercMax;

    public Tercel() {
    }

    public Tercel(String resourceId) {
        this.resourceId = resourceId;
    }

    public Tercel(String resourceId, Integer tercMin, Integer tercMidle, Integer tercMax) {
        this.resourceId = resourceId;
        this.tercMin = tercMin;
        this.tercMidle = tercMidle;
        this.tercMax = tercMax;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tercel_id", unique = true, nullable = false)
    public Integer getTercelId() {
        return this.tercelId;
    }

    public void setTercelId(Integer tercelId) {
        this.tercelId = tercelId;
    }

    @Column(name = "resourceId", nullable = false, length = 500)
    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Column(name = "terc_min")
    public Integer getTercMin() {
        return this.tercMin;
    }

    public void setTercMin(Integer tercMin) {
        this.tercMin = tercMin;
    }

    @Column(name = "terc_midle")
    public Integer getTercMidle() {
        return this.tercMidle;
    }

    public void setTercMidle(Integer tercMidle) {
        this.tercMidle = tercMidle;
    }

    @Column(name = "terc_max")
    public Integer getTercMax() {
        return this.tercMax;
    }

    public void setTercMax(Integer tercMax) {
        this.tercMax = tercMax;
    }
}

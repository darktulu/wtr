package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "paymentterm")
public class Paymentterm implements Serializable {
    private Integer idpaymentterm;
    private Po po;
    private String phase;
    private String percentage;
    private Integer duration;
    private String shipmentTerm;
    private String speceficsConditions;
    private String status;
    private Set<Acceptance> acceptances = new HashSet(0);

    public Paymentterm() {
    }

    public Paymentterm(Po po) {
        this.po = po;
    }

    public Paymentterm(Po po, String phase, String percentage, Integer duration, String shipmentTerm, String speceficsConditions, String status, Set<Acceptance> acceptances) {
        this.po = po;
        this.phase = phase;
        this.percentage = percentage;
        this.duration = duration;
        this.shipmentTerm = shipmentTerm;
        this.speceficsConditions = speceficsConditions;
        this.status = status;
        this.acceptances = acceptances;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpaymentterm", unique = true, nullable = false)
    public Integer getIdpaymentterm() {
        return this.idpaymentterm;
    }

    public void setIdpaymentterm(Integer idpaymentterm) {
        this.idpaymentterm = idpaymentterm;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "po_idpo", nullable = false)
    public Po getPo() {
        return this.po;
    }

    public void setPo(Po po) {
        this.po = po;
    }

    @Column(name = "phase", length = 100)
    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @Column(name = "percentage", length = 45)
    public String getPercentage() {
        return this.percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    @Column(name = "duration")
    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Column(name = "shipmentTerm", length = 200)
    public String getShipmentTerm() {
        return this.shipmentTerm;
    }

    public void setShipmentTerm(String shipmentTerm) {
        this.shipmentTerm = shipmentTerm;
    }

    @Column(name = "speceficsConditions", length = 200)
    public String getSpeceficsConditions() {
        return this.speceficsConditions;
    }

    public void setSpeceficsConditions(String speceficsConditions) {
        this.speceficsConditions = speceficsConditions;
    }

    @Column(name = "status", length = 45)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "paymentterm")
    public Set<Acceptance> getAcceptances() {
        return this.acceptances;
    }

    public void setAcceptances(Set<Acceptance> acceptances) {
        this.acceptances = acceptances;
    }
}

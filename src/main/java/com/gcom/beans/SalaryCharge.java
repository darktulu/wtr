package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "salary_charge")
public class SalaryCharge implements Serializable {
    private Integer idCharge;
    private String nomCharge;
    private String type;
    private double tax;
    private double plafond;

    public SalaryCharge() {
    }

    public SalaryCharge(String nomCharge, String type, double tax, double plafond) {
        this.nomCharge = nomCharge;
        this.type = type;
        this.tax = tax;
        this.plafond = plafond;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_charge", unique = true, nullable = false)
    public Integer getIdCharge() {
        return this.idCharge;
    }

    public void setIdCharge(Integer idCharge) {
        this.idCharge = idCharge;
    }

    @Column(name = "nom_charge", nullable = false, length = 300)
    public String getNomCharge() {
        return this.nomCharge;
    }

    public void setNomCharge(String nomCharge) {
        this.nomCharge = nomCharge;
    }

    @Column(name = "type", nullable = false, length = 50)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "tax", nullable = false, precision = 22, scale = 0)
    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Column(name = "plafond", nullable = false, precision = 22, scale = 0)
    public double getPlafond() {
        return this.plafond;
    }

    public void setPlafond(double plafond) {
        this.plafond = plafond;
    }
}

package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ware_projectOtherCosts")
public class WareProjectOtherCosts implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer idprojectOtherCosts;
    private Project project;
    private Date min_date;
    private Date max_date;
    private double projectHours;
    private double deliveryHours;
    private double costSupport;
    private double costSales;

    @Id
    @Column(name = "idprojectothercosts", unique = true, nullable = false)
    public Integer getIdprojectOtherCosts() {
        return idprojectOtherCosts;
    }

    public void setIdprojectOtherCosts(Integer idprojectOtherCosts) {
        this.idprojectOtherCosts = idprojectOtherCosts;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idproject", nullable = false)
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Column(name = "min")
    public Date getMin_date() {
        return min_date;
    }

    public void setMin_date(Date min_date) {
        this.min_date = min_date;
    }

    @Column(name = "max")
    public Date getMax_date() {
        return max_date;
    }

    public void setMax_date(Date max_date) {
        this.max_date = max_date;
    }

    @Column(name = "projectHours")
    public double getProjectHours() {
        return projectHours;
    }

    public void setProjectHours(double projectHours) {
        this.projectHours = projectHours;
    }

    @Column(name = "deliveryHours")
    public double getDeliveryHours() {
        return deliveryHours;
    }

    public void setDeliveryHours(double deliveryHours) {
        this.deliveryHours = deliveryHours;
    }

    @Column(name = "costSupport")
    public double getCostSupport() {
        return costSupport;
    }

    public void setCostSupport(double costSupport) {
        this.costSupport = costSupport;
    }

    @Column(name = "costSales")
    public double getCostSales() {
        return costSales;
    }

    public void setCostSales(double costSales) {
        this.costSales = costSales;
    }
}

package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ware_projectData")
public class WareProjectData implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer idprojectdata;
    private Project project;
    private Integer day;
    private Integer month;
    private Integer year;
    private Double totalSales;
    private Double totalRevenue;
    private Double totalInvoiceHT;
    private Double totalInvoiceTTC;
    private Double CostIbuy;
    private Double CostIexpenses;
    private Double CostPayroll;
    private Double totalCashInHT;
    private Double totalCashInTTC;
    private Double totalCashPaymentHT;
    private Double totalCashPaymentTTC;
    private Double totalCashOut;

    @Id
    @Column(name = "idprojectdata", unique = true, nullable = false)
    public Integer getIdprojectdata() {
        return idprojectdata;
    }

    public void setIdprojectdata(Integer idprojectdata) {
        this.idprojectdata = idprojectdata;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idproject", nullable = false)
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Column(name = "day")
    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Column(name = "month")
    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    @Column(name = "year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Column(name = "totalSales")
    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    @Column(name = "totalRevenue")
    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    @Column(name = "totalInvoiceHT")
    public Double getTotalInvoiceHT() {
        return totalInvoiceHT;
    }

    public void setTotalInvoiceHT(Double totalInvoiceHT) {
        this.totalInvoiceHT = totalInvoiceHT;
    }

    @Column(name = "totalInvoiceTTC")
    public Double getTotalInvoiceTTC() {
        return totalInvoiceTTC;
    }

    public void setTotalInvoiceTTC(Double totalInvoiceTTC) {
        this.totalInvoiceTTC = totalInvoiceTTC;
    }

    @Column(name = "costIbuy")
    public Double getCostIbuy() {
        return CostIbuy;
    }

    public void setCostIbuy(Double costIbuy) {
        CostIbuy = costIbuy;
    }

    @Column(name = "costIexpenses")
    public Double getCostIexpenses() {
        return CostIexpenses;
    }

    public void setCostIexpenses(Double costIexpenses) {
        CostIexpenses = costIexpenses;
    }

    @Column(name = "costPayroll")
    public Double getCostPayroll() {
        return CostPayroll;
    }

    public void setCostPayroll(Double costPayroll) {
        CostPayroll = costPayroll;
    }

    @Column(name = "totalCashInHT")
    public Double getTotalCashInHT() {
        return totalCashInHT;
    }

    public void setTotalCashInHT(Double totalCashInHT) {
        this.totalCashInHT = totalCashInHT;
    }

    @Column(name = "totalCashInTTC")
    public Double getTotalCashInTTC() {
        return totalCashInTTC;
    }

    public void setTotalCashInTTC(Double totalCashInTTC) {
        this.totalCashInTTC = totalCashInTTC;
    }

    @Column(name = "totalCashPaymentHT")
    public Double getTotalCashPaymentHT() {
        return totalCashPaymentHT;
    }

    public void setTotalCashPaymentHT(Double totalCashPaymentHT) {
        this.totalCashPaymentHT = totalCashPaymentHT;
    }

    @Column(name = "totalCashPaymentTTC")
    public Double getTotalCashPaymentTTC() {
        return totalCashPaymentTTC;
    }

    public void setTotalCashPaymentTTC(Double totalCashPaymentTTC) {
        this.totalCashPaymentTTC = totalCashPaymentTTC;
    }

    @Column(name = "totalCashOut")
    public Double getTotalCashOut() {
        return totalCashOut;
    }

    public void setTotalCashOut(Double totalCashOut) {
        this.totalCashOut = totalCashOut;
    }
}

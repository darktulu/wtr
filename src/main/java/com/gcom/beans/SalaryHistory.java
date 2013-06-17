package com.gcom.beans;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "salaryhistory")
public class SalaryHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "username", nullable = false, length = 300)
    private String username;
    @Column(name = "fullname", nullable = false, length = 300)
    private String fullname;
    @Column(name = "year")
    private Integer year;
    @Column(name = "month")
    private Integer month;
    @Column(name = "workedDays")
    private Integer workedDays;
    @Column(name = "base_salary", precision = 22, scale = 0)
    private double baseSalary;
    @Column(name = "brut_salary", precision = 22, scale = 0)
    private double brutSalary;
    @Column(name = "salaire_net", precision = 22, scale = 0)
    private double salaireNet;
    @Column(name = "contract", length = 300)
    private String contract;
    @Column(name = "situation_familiale", length = 300)
    private String situationFamiliale;
    @Column(name = "nombre_enfants")
    private Integer nombreEnfants;
    @Column(name = "paixDebut", length = 300)
    private String paixDebut;
    @Column(name = "paixFin", length = 300)
    private String paixFin;
    @Temporal(TemporalType.DATE)
    @Column(name = "congeDebut", length = 10)
    private Date congeDebut;
    @Temporal(TemporalType.DATE)
    @Column(name = "congeFin", length = 10)
    private Date congeFin;
    @Column(name = "cnss", precision = 22, scale = 0)
    private double cnss;
    @Column(name = "taux_cnss", precision = 22, scale = 0)
    private double tauxCNSS;
    @Column(name = "amo", precision = 22, scale = 0)
    private double amo;
    @Column(name = "taux_amo", precision = 22, scale = 0)
    private double tauxAMO;
    @Column(name = "seniority", precision = 22, scale = 0)
    private double seniority;
    @Column(name = "jobe_title", length = 300)
    private String jobeTitle;
    @Column(name = "ir", precision = 22, scale = 0)
    private double ir;
    @OneToMany(fetch = FetchType.LAZY)
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    @JoinTable(name = "SalaryHistory_EPrimeHistory", joinColumns = {@javax.persistence.JoinColumn(name = "SALARY_ID")}, inverseJoinColumns = {@javax.persistence.JoinColumn(name = "EPRIME_ID")})
    private List<EPrimeHistory> listPrime = new ArrayList();
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    @JoinTable(name = "SalaryHistory_EIndemHistory", joinColumns = {@javax.persistence.JoinColumn(name = "SALARY_ID")}, inverseJoinColumns = {@javax.persistence.JoinColumn(name = "EINDEM_ID")})
    private List<EIndemHistory> listIndem = new ArrayList();

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return this.month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalaireNet() {
        return this.salaireNet;
    }

    public void setSalaireNet(double salaireNet) {
        this.salaireNet = salaireNet;
    }

    public String getContract() {
        return this.contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getSituationFamiliale() {
        return this.situationFamiliale;
    }

    public void setSituationFamiliale(String situationFamiliale) {
        this.situationFamiliale = situationFamiliale;
    }

    public Integer getNombreEnfants() {
        return this.nombreEnfants;
    }

    public void setNombreEnfants(Integer nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }

    public double getCnss() {
        return this.cnss;
    }

    public void setCnss(double cnss) {
        this.cnss = cnss;
    }

    public double getTauxCNSS() {
        return this.tauxCNSS;
    }

    public void setTauxCNSS(double tauxCNSS) {
        this.tauxCNSS = tauxCNSS;
    }

    public double getAmo() {
        return this.amo;
    }

    public void setAmo(double amo) {
        this.amo = amo;
    }

    public double getTauxAMO() {
        return this.tauxAMO;
    }

    public void setTauxAMO(double tauxAMO) {
        this.tauxAMO = tauxAMO;
    }

    public double getSeniority() {
        return this.seniority;
    }

    public void setSeniority(double seniority) {
        this.seniority = seniority;
    }

    public String getJobeTitle() {
        return this.jobeTitle;
    }

    public void setJobeTitle(String jobeTitle) {
        this.jobeTitle = jobeTitle;
    }

    public double getIr() {
        return this.ir;
    }

    public void setIr(double ir) {
        this.ir = ir;
    }

    public List<EPrimeHistory> getListPrime() {
        return this.listPrime;
    }

    public void setListPrime(List<EPrimeHistory> listPrime) {
        this.listPrime = listPrime;
    }

    public List<EIndemHistory> getListIndem() {
        return this.listIndem;
    }

    public void setListIndem(List<EIndemHistory> listIndem) {
        this.listIndem = listIndem;
    }

    public String getPaixDebut() {
        return this.paixDebut;
    }

    public void setPaixDebut(String paixDebut) {
        this.paixDebut = paixDebut;
    }

    public String getPaixFin() {
        return this.paixFin;
    }

    public void setPaixFin(String paixFin) {
        this.paixFin = paixFin;
    }

    public Date getCongeDebut() {
        return this.congeDebut;
    }

    public void setCongeDebut(Date congeDebut) {
        this.congeDebut = congeDebut;
    }

    public Date getCongeFin() {
        return this.congeFin;
    }

    public void setCongeFin(Date congeFin) {
        this.congeFin = congeFin;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getWorkedDays() {
        return this.workedDays;
    }

    public void setWorkedDays(Integer workedDays) {
        this.workedDays = workedDays;
    }

    public double getBrutSalary() {
        return brutSalary;
    }

    public void setBrutSalary(double brutSalary) {
        this.brutSalary = brutSalary;
    }
}

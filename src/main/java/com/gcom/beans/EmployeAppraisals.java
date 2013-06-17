package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employe_appraisals")
public class EmployeAppraisals implements Serializable {
    private Integer idEmpAppriasals;
    private String employe;
    private String apparaisee;
    private int apparaisal;
    private String status;
    private Date date;

    public EmployeAppraisals() {
    }

    public EmployeAppraisals(String employe, String apparaisee, int apparaisal, String status, Date date) {
        this.employe = employe;
        this.apparaisee = apparaisee;
        this.apparaisal = apparaisal;
        this.status = status;
        this.date = date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Emp_Appriasals", unique = true, nullable = false)
    public Integer getIdEmpAppriasals() {
        return this.idEmpAppriasals;
    }

    public void setIdEmpAppriasals(Integer idEmpAppriasals) {
        this.idEmpAppriasals = idEmpAppriasals;
    }

    @Column(name = "Employe", nullable = false, length = 50)
    public String getEmploye() {
        return this.employe;
    }

    public void setEmploye(String employe) {
        this.employe = employe;
    }

    @Column(name = "apparaisee", nullable = false, length = 50)
    public String getApparaisee() {
        return this.apparaisee;
    }

    public void setApparaisee(String apparaisee) {
        this.apparaisee = apparaisee;
    }

    @Column(name = "Apparaisal", nullable = false)
    public int getApparaisal() {
        return this.apparaisal;
    }

    public void setApparaisal(int apparaisal) {
        this.apparaisal = apparaisal;
    }

    @Column(name = "Status", nullable = false, length = 50)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Date", nullable = false, length = 10)
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

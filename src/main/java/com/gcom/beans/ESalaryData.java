package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "e_salary_data")
public class ESalaryData implements Serializable {
    private Integer salaryId;
    private String resurceId;
    private Double baseSalary;
    private String description;
    private int mois;
    private int ans;

    public ESalaryData() {
    }

    public ESalaryData(String resurceId, int mois, int ans) {
        this.resurceId = resurceId;
        this.mois = mois;
        this.ans = ans;
    }

    public ESalaryData(String resurceId, Double baseSalary, String description, int mois, int ans) {
        this.resurceId = resurceId;
        this.baseSalary = baseSalary;
        this.description = description;
        this.mois = mois;
        this.ans = ans;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SALARY_ID", unique = true, nullable = false)
    public Integer getSalaryId() {
        return this.salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    @Column(name = "RESURCE_ID", nullable = false, length = 500)
    public String getResurceId() {
        return this.resurceId;
    }

    public void setResurceId(String resurceId) {
        this.resurceId = resurceId;
    }

    @Column(name = "BASE_SALARY", precision = 22, scale = 0)
    public Double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Column(name = "DESCRIPTION", length = 500)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "mois", nullable = false)
    public int getMois() {
        return this.mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    @Column(name = "ans", nullable = false)
    public int getAns() {
        return this.ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public String toString() {
        return new StringBuilder().append("ESalaryData [").append(this.salaryId != null ? new StringBuilder().append("salaryId=").append(this.salaryId).append(", ").toString() : "").append(this.resurceId != null ? new StringBuilder().append("resurceId=").append(this.resurceId).append(", ").toString() : "").append(this.baseSalary != null ? new StringBuilder().append("baseSalary=").append(this.baseSalary).append(", ").toString() : "").append(this.description != null ? new StringBuilder().append("description=").append(this.description).append(", ").toString() : "").append("mois=").append(this.mois).append(", ans=").append(this.ans).append("]").toString();
    }
}

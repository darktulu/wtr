package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "e_warning_data")
public class EWarningData implements Serializable {
    private Integer warningId;
    private String resurceId;
    private Date date;
    private String warningType;
    private String sevirity;
    private String raison;

    public EWarningData() {
    }

    public EWarningData(String resurceId) {
        this.resurceId = resurceId;
    }

    public EWarningData(String resurceId, Date date, String warningType, String sevirity, String raison) {
        this.resurceId = resurceId;
        this.date = date;
        this.warningType = warningType;
        this.sevirity = sevirity;
        this.raison = raison;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WARNING_ID", unique = true, nullable = false)
    public Integer getWarningId() {
        return this.warningId;
    }

    public void setWarningId(Integer warningId) {
        this.warningId = warningId;
    }

    @Column(name = "RESURCE_ID", nullable = false, length = 500)
    public String getResurceId() {
        return this.resurceId;
    }

    public void setResurceId(String resurceId) {
        this.resurceId = resurceId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE", length = 10)
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "WARNING_TYPE", length = 100)
    public String getWarningType() {
        return this.warningType;
    }

    public void setWarningType(String warningType) {
        this.warningType = warningType;
    }

    @Column(name = "SEVIRITY", length = 100)
    public String getSevirity() {
        return this.sevirity;
    }

    public void setSevirity(String sevirity) {
        this.sevirity = sevirity;
    }

    @Column(name = "RAISON", length = 500)
    public String getRaison() {
        return this.raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }
}

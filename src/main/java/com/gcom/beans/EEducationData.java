package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "e_education_data")
public class EEducationData implements Serializable {
    private Integer idEducation;
    private String resurceId;
    private String type;
    private String nameInstitut;
    private String addressInstitut;
    private String courseStudy;
    private Date dateFrom;
    private Date dateTo;
    private boolean certification;

    public EEducationData() {
    }

    public EEducationData(String resurceId, String type, String nameInstitut, String addressInstitut, String courseStudy, Date dateFrom, Date dateTo, boolean certification) {
        this.resurceId = resurceId;
        this.type = type;
        this.nameInstitut = nameInstitut;
        this.addressInstitut = addressInstitut;
        this.courseStudy = courseStudy;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.certification = certification;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Education", unique = true, nullable = false)
    public Integer getIdEducation() {
        return this.idEducation;
    }

    public void setIdEducation(Integer idEducation) {
        this.idEducation = idEducation;
    }

    @Column(name = "RESURCE_ID", nullable = false, length = 500)
    public String getResurceId() {
        return this.resurceId;
    }

    public void setResurceId(String resurceId) {
        this.resurceId = resurceId;
    }

    @Column(name = "Type", nullable = false, length = 100)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "Name_Institut", nullable = false, length = 100)
    public String getNameInstitut() {
        return this.nameInstitut;
    }

    public void setNameInstitut(String nameInstitut) {
        this.nameInstitut = nameInstitut;
    }

    @Column(name = "Address_Institut", nullable = false, length = 500)
    public String getAddressInstitut() {
        return this.addressInstitut;
    }

    public void setAddressInstitut(String addressInstitut) {
        this.addressInstitut = addressInstitut;
    }

    @Column(name = "Course_Study", nullable = false, length = 100)
    public String getCourseStudy() {
        return this.courseStudy;
    }

    public void setCourseStudy(String courseStudy) {
        this.courseStudy = courseStudy;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Date_From", nullable = false, length = 10)
    public Date getDateFrom() {
        return this.dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Date_To", nullable = false, length = 10)
    public Date getDateTo() {
        return this.dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    @Column(name = "Certification", nullable = false)
    public boolean isCertification() {
        return this.certification;
    }

    public void setCertification(boolean certification) {
        this.certification = certification;
    }
}

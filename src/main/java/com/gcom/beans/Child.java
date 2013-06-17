package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "child")
public class Child implements Serializable {
    private String childId;
    private String spouseId;
    private Date childBirthday;
    private String childName;
    private String status;
    private String approved;

    public Child() {
    }

    public Child(String childId, String spouseId) {
        this.childId = childId;
        this.spouseId = spouseId;
    }

    public Child(String childId, String spouseId, Date childBirthday, String childName, String status, String approved) {
        this.childId = childId;
        this.spouseId = spouseId;
        this.childBirthday = childBirthday;
        this.childName = childName;
        this.status = status;
        this.approved = approved;
    }

    @Id
    @Column(name = "CHILD_ID", unique = true, nullable = false, length = 100)
    public String getChildId() {
        return this.childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    @Column(name = "SPOUSE_ID", nullable = false, length = 100)
    public String getSpouseId() {
        return this.spouseId;
    }

    public void setSpouseId(String spouseId) {
        this.spouseId = spouseId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "CHILD_BIRTHDAY", length = 10)
    public Date getChildBirthday() {
        return this.childBirthday;
    }

    public void setChildBirthday(Date childBirthday) {
        this.childBirthday = childBirthday;
    }

    @Column(name = "CHILD_NAME", length = 500)
    public String getChildName() {
        return this.childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    @Column(name = "status", length = 30)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "approved", length = 100)
    public String getApproved() {
        return this.approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }
}

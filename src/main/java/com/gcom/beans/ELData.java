package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Entity
@Table(name = "e_l_data")
public class ELData implements Serializable {
    private Integer leaveId;
    private String resurceId;
    private String date;
    private String leaveType;
    private Date leaveStartDate;
    private Date leaveEndDate;
    private Integer totalDays;
    private String status;
    private String satatusDescription;
    private String backUpPerson;
    private String callAvailability;
    private String callType;
    private String mailAccess;

    public ELData() {
    }

    public ELData(String resurceId) {
        this.resurceId = resurceId;
    }

    public ELData(String resurceId, String date, String leaveType, Date leaveStartDate, Date leaveEndDate, Integer totalDays, String status, String satatusDescription) {
        this.resurceId = resurceId;
        this.date = date;
        this.leaveType = leaveType;
        this.leaveStartDate = leaveStartDate;
        this.leaveEndDate = leaveEndDate;
        this.totalDays = totalDays;
        this.status = status;
        this.satatusDescription = satatusDescription;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEAVE_ID", unique = true, nullable = false)
    public Integer getLeaveId() {
        return this.leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    @Column(name = "RESURCE_ID", nullable = false, length = 500)
    public String getResurceId() {
        return this.resurceId;
    }

    public void setResurceId(String resurceId) {
        this.resurceId = resurceId;
    }

    @Column(name = "DATE", length = 50)
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Column(name = "LEAVE_TYPE", length = 100)
    public String getLeaveType() {
        return this.leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "LEAVE_START_DATE", length = 10)
    public Date getLeaveStartDate() {
        return this.leaveStartDate;
    }

    public void setLeaveStartDate(Date leaveStartDate) {
        this.leaveStartDate = leaveStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "LEAVE_END_DATE", length = 10)
    public Date getLeaveEndDate() {
        return this.leaveEndDate;
    }

    public void setLeaveEndDate(Date leaveEndDate) {
        this.leaveEndDate = leaveEndDate;
    }

    @Column(name = "TOTAL_DAYS")
    public Integer getTotalDays() {
        return this.totalDays;
    }

    public void setTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
    }

    @Column(name = "STATUS", length = 100)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "SATATUS_DESCRIPTION", length = 500)
    public String getSatatusDescription() {
        return this.satatusDescription;
    }

    public void setSatatusDescription(String satatusDescription) {
        this.satatusDescription = satatusDescription;
    }

    @Column(name = "BACK_UP_PERSON", length = 100)
    public String getBackUpPerson() {
        return this.backUpPerson;
    }

    public void setBackUpPerson(String backUpPerson) {
        this.backUpPerson = backUpPerson;
    }

    @Column(name = "CALL_AVAILABILITY", length = 100)
    public String getCallAvailability() {
        return this.callAvailability;
    }

    public void setCallAvailability(String callAvailability) {
        this.callAvailability = callAvailability;
    }

    @Column(name = "CALL_TYPE", length = 100)
    public String getCallType() {
        return this.callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    @Column(name = "MAIL_ACCESS", length = 100)
    public String getMailAccess() {
        return this.mailAccess;
    }

    public void setMailAccess(String mailAccess) {
        this.mailAccess = mailAccess;
    }

    public int getYear(Date date) {
        Calendar myCalendar = GregorianCalendar.getInstance();
        myCalendar.setTime(date);
        return myCalendar.get(1);
    }
}

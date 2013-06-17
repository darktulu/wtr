package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "appraisals")
public class Appraisals implements Serializable {
    private Integer appraisal;
    private int year;
    private Date startDate;
    private Date endDate;
    private Date planningStartDate;
    private Date planningEndDate;
    private Date midYearReviewStartDate;
    private Date midYearReviewEndDate;
    private Date endYearSummaryStartDate;
    private Date endYearSummaryEndDate;
    private String status;

    public Appraisals() {
    }

    public Appraisals(int year, Date startDate, Date endDate, Date planningStartDate, Date planningEndDate, Date midYearReviewStartDate, Date midYearReviewEndDate, Date endYearSummaryStartDate, Date endYearSummaryEndDate) {
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
        this.planningStartDate = planningStartDate;
        this.planningEndDate = planningEndDate;
        this.midYearReviewStartDate = midYearReviewStartDate;
        this.midYearReviewEndDate = midYearReviewEndDate;
        this.endYearSummaryStartDate = endYearSummaryStartDate;
        this.endYearSummaryEndDate = endYearSummaryEndDate;
    }

    public Appraisals(int year, Date startDate, Date endDate, Date planningStartDate, Date planningEndDate, Date midYearReviewStartDate, Date midYearReviewEndDate, Date endYearSummaryStartDate, Date endYearSummaryEndDate, String status) {
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
        this.planningStartDate = planningStartDate;
        this.planningEndDate = planningEndDate;
        this.midYearReviewStartDate = midYearReviewStartDate;
        this.midYearReviewEndDate = midYearReviewEndDate;
        this.endYearSummaryStartDate = endYearSummaryStartDate;
        this.endYearSummaryEndDate = endYearSummaryEndDate;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Appraisal", unique = true, nullable = false)
    public Integer getAppraisal() {
        return this.appraisal;
    }

    public void setAppraisal(Integer appraisal) {
        this.appraisal = appraisal;
    }

    @Column(name = "Year", nullable = false)
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Start_Date", nullable = false, length = 10)
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "End_date", nullable = false, length = 10)
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Planning_Start_Date", nullable = false, length = 10)
    public Date getPlanningStartDate() {
        return this.planningStartDate;
    }

    public void setPlanningStartDate(Date planningStartDate) {
        this.planningStartDate = planningStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Planning_end_date", nullable = false, length = 10)
    public Date getPlanningEndDate() {
        return this.planningEndDate;
    }

    public void setPlanningEndDate(Date planningEndDate) {
        this.planningEndDate = planningEndDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Mid_Year_Review_Start_Date", nullable = false, length = 10)
    public Date getMidYearReviewStartDate() {
        return this.midYearReviewStartDate;
    }

    public void setMidYearReviewStartDate(Date midYearReviewStartDate) {
        this.midYearReviewStartDate = midYearReviewStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Mid_Year_Review_end_Date", nullable = false, length = 10)
    public Date getMidYearReviewEndDate() {
        return this.midYearReviewEndDate;
    }

    public void setMidYearReviewEndDate(Date midYearReviewEndDate) {
        this.midYearReviewEndDate = midYearReviewEndDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "End_Year_summary_start_date", nullable = false, length = 10)
    public Date getEndYearSummaryStartDate() {
        return this.endYearSummaryStartDate;
    }

    public void setEndYearSummaryStartDate(Date endYearSummaryStartDate) {
        this.endYearSummaryStartDate = endYearSummaryStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "End_Year_summary_end_date", nullable = false, length = 10)
    public Date getEndYearSummaryEndDate() {
        return this.endYearSummaryEndDate;
    }

    public void setEndYearSummaryEndDate(Date endYearSummaryEndDate) {
        this.endYearSummaryEndDate = endYearSummaryEndDate;
    }

    @Column(name = "status")
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

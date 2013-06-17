package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "e_contract_data")
public class EContractData implements Serializable {
    private Integer contratId;
    private String resurceId;
    private String contractType;
    private String legalEntity;
    private Date hireDate;
    private Date contractStartDate;
    private Date contractEndDate;
    private String contractStatus;
    private String description;
    private Date probationPeriodStartDate;
    private Date probationPeriodEndDate;
    private String probationExtended;
    private String confirmed;
    private Date probationPeriodExtensionStartDate;
    private Date probationPeriodExtensionEndDate;
    private Date confirmationDate;
    private String noticeWthProbation;
    private String noticeAftProbation;
    private Date resign;
    private Date fire;
    private String contractEndingComment;

    public EContractData() {
    }

    public EContractData(String resurceId) {
        this.resurceId = resurceId;
    }

    public EContractData(String resurceId, String contractType, Date hireDate, Date contractStartDate, Date contractEndDate, String contractStatus, String description) {
        this.resurceId = resurceId;
        this.contractType = contractType;
        this.hireDate = hireDate;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractStatus = contractStatus;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTRAT_Id", unique = true, nullable = false)
    public Integer getContratId() {
        return this.contratId;
    }

    public void setContratId(Integer contratId) {
        this.contratId = contratId;
    }

    @Column(name = "RESURCE_ID", nullable = false, length = 500)
    public String getResurceId() {
        return this.resurceId;
    }

    public void setResurceId(String resurceId) {
        this.resurceId = resurceId;
    }

    @Column(name = "CONTRACT_TYPE", length = 100)
    public String getContractType() {
        return this.contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "HIRE_DATE", length = 10)
    public Date getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "CONTRACT_START_DATE", length = 10)
    public Date getContractStartDate() {
        return this.contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "CONTRACT_END_DATE", length = 10)
    public Date getContractEndDate() {
        return this.contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    @Column(name = "CONTRACT_STATUS", length = 100)
    public String getContractStatus() {
        return this.contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    @Column(name = "DESCRIPTION", length = 500)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return new StringBuilder().append("EContractData [").append(this.contratId != null ? new StringBuilder().append("contratId=").append(this.contratId).append(", ").toString() : "").append(this.resurceId != null ? new StringBuilder().append("resurceId=").append(this.resurceId).append(", ").toString() : "").append(this.contractType != null ? new StringBuilder().append("contractType=").append(this.contractType).append(", ").toString() : "").append(this.hireDate != null ? new StringBuilder().append("hireDate=").append(this.hireDate).append(", ").toString() : "").append(this.contractStartDate != null ? new StringBuilder().append("contractStartDate=").append(this.contractStartDate).append(", ").toString() : "").append(this.contractEndDate != null ? new StringBuilder().append("contractEndDate=").append(this.contractEndDate).append(", ").toString() : "").append(this.contractStatus != null ? new StringBuilder().append("contractStatus=").append(this.contractStatus).append(", ").toString() : "").append(this.description != null ? new StringBuilder().append("description=").append(this.description).toString() : "").append("]").toString();
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ProbationPeriodStartDate", length = 10)
    public Date getProbationPeriodStartDate() {
        return this.probationPeriodStartDate;
    }

    public void setProbationPeriodStartDate(Date probationPeriodStartDate) {
        this.probationPeriodStartDate = probationPeriodStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ProbationPeriodEndDate", length = 10)
    public Date getProbationPeriodEndDate() {
        return this.probationPeriodEndDate;
    }

    public void setProbationPeriodEndDate(Date probationPeriodEndDate) {
        this.probationPeriodEndDate = probationPeriodEndDate;
    }

    @Column(name = "ProbationExtended", length = 100)
    public String getProbationExtended() {
        return this.probationExtended;
    }

    public void setProbationExtended(String probationExtended) {
        this.probationExtended = probationExtended;
    }

    @Column(name = "Confirmed", length = 100)
    public String getConfirmed() {
        return this.confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ProbationPeriodExtensionStartDate", length = 10)
    public Date getProbationPeriodExtensionStartDate() {
        return this.probationPeriodExtensionStartDate;
    }

    public void setProbationPeriodExtensionStartDate(Date probationPeriodExtensionStartDate) {
        this.probationPeriodExtensionStartDate = probationPeriodExtensionStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ProbationPeriodExtensionEndDate", length = 10)
    public Date getProbationPeriodExtensionEndDate() {
        return this.probationPeriodExtensionEndDate;
    }

    public void setProbationPeriodExtensionEndDate(Date probationPeriodExtensionEndDate) {
        this.probationPeriodExtensionEndDate = probationPeriodExtensionEndDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ConfirmationDate", length = 10)
    public Date getConfirmationDate() {
        return this.confirmationDate;
    }

    public void setConfirmationDate(Date confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    @Column(name = "NoticeWthProbation", length = 200)
    public String getNoticeWthProbation() {
        return this.noticeWthProbation;
    }

    public void setNoticeWthProbation(String noticeWthProbation) {
        this.noticeWthProbation = noticeWthProbation;
    }

    @Column(name = "NoticeAftProbation", length = 200)
    public String getNoticeAftProbation() {
        return this.noticeAftProbation;
    }

    public void setNoticeAftProbation(String noticeAftProbation) {
        this.noticeAftProbation = noticeAftProbation;
    }

    @Column(name = "LegalEntity", length = 100)
    public String getLegalEntity() {
        return this.legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Resign", length = 10)
    public Date getResign() {
        return this.resign;
    }

    public void setResign(Date resign) {
        this.resign = resign;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Fire", length = 10)
    public Date getFire() {
        return this.fire;
    }

    public void setFire(Date fire) {
        this.fire = fire;
    }

    @Column(name = "ContractEndingComment", length = 200)
    public String getContractEndingComment() {
        return this.contractEndingComment;
    }

    public void setContractEndingComment(String contractEndingComment) {
        this.contractEndingComment = contractEndingComment;
    }
}

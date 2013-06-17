package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "inssurancecontract")
public class InssuranceContract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contractid", unique = true, nullable = false)
    private Integer contractId;
    @Column(name = "contractnumber", nullable = false, length = 500)
    private String contractNumber;
    @Temporal(TemporalType.DATE)
    @Column(name = "contractstartDay", nullable = false, length = 10)
    private Date contractStartDay;
    @Temporal(TemporalType.DATE)
    @Column(name = "contractendDay", nullable = false, length = 10)
    private Date contractEndDay;
    @Column(name = "contractdescription", nullable = false, length = 800)
    private String contractDescription;
    @Column(name = "servicedescription", nullable = false, length = 800)
    private String serviceDescription;
    @Column(name = "inssurance", nullable = false, length = 800)
    private String inssurance;
    @Column(name = "agent", nullable = false, length = 800)
    private String agent;
    @Column(name = "contractstatus", nullable = false, length = 800)
    private String contractStatus;

    public InssuranceContract() {
    }

    public InssuranceContract(String contractNumber, Date contractStartDay,
                              Date contractEndDay, String contractDescription,
                              String serviceDescription, String inssurance, String agent,
                              String contractStatus) {
        super();
        this.contractNumber = contractNumber;
        this.contractStartDay = contractStartDay;
        this.contractEndDay = contractEndDay;
        this.contractDescription = contractDescription;
        this.serviceDescription = serviceDescription;
        this.inssurance = inssurance;
        this.agent = agent;
        this.contractStatus = contractStatus;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Date getContractStartDay() {
        return contractStartDay;
    }

    public void setContractStartDay(Date contractStartDay) {
        this.contractStartDay = contractStartDay;
    }

    public Date getContractEndDay() {
        return contractEndDay;
    }

    public void setContractEndDay(Date contractEndDay) {
        this.contractEndDay = contractEndDay;
    }

    public String getContractDescription() {
        return contractDescription;
    }

    public void setContractDescription(String contractDescription) {
        this.contractDescription = contractDescription;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getInssurance() {
        return inssurance;
    }

    public void setInssurance(String inssurance) {
        this.inssurance = inssurance;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }
}

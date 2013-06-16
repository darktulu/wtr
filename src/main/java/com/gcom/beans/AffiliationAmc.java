package com.gcom.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "affiliationamc")
public class AffiliationAmc implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "affiliationid", unique = true, nullable = false)
	private Integer affiliationId;
	
	@Column(name = "user", nullable = false, length = 200)
	private String user;
	
	@Column(name = "matriculeamc", nullable = false, length = 800)
	private String matriculeAmc;
	
	@Column(name = "contractnumber", nullable = false, length = 800)
	private String contractNumber;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "affiliationstartdate", nullable = false, length = 10)
	private Date affiliationStartDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "affiliationenddate", nullable = false, length = 10)
	private Date affiliationEndDate;
	
	public AffiliationAmc(){}
	
	

	public AffiliationAmc(String user, String matriculeAmc,String contractNumber, Date affiliationStartDate,Date affiliationEndDate) {
		super();
		this.user = user;
		this.matriculeAmc = matriculeAmc;
		this.contractNumber = contractNumber;
		this.affiliationStartDate = affiliationStartDate;
		this.affiliationEndDate = affiliationEndDate;
	}

	public Integer getAffiliationId() {
		return affiliationId;
	}

	public void setAffiliationId(Integer affiliationId) {
		this.affiliationId = affiliationId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMatriculeAmc() {
		return matriculeAmc;
	}

	public void setMatriculeAmc(String matriculeAmc) {
		this.matriculeAmc = matriculeAmc;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Date getAffiliationStartDate() {
		return affiliationStartDate;
	}

	public void setAffiliationStartDate(Date affiliationStartDate) {
		this.affiliationStartDate = affiliationStartDate;
	}

	public Date getAffiliationEndDate() {
		return affiliationEndDate;
	}

	public void setAffiliationEndDate(Date affiliationEndDate) {
		this.affiliationEndDate = affiliationEndDate;
	}

}

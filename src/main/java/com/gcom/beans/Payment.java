package com.gcom.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "payment")
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idPayment;
	private Acceptance acceptance;
	private String numPayment;
	private Date datePayment;
	private Double amount;
	private String modePayment;
	private String refModePayment;
	private String approuvalPayment;
	private Date dateCash;
	private String comment;

	public Payment() {
	}

	public Payment(Acceptance acceptance, String numPayment, Date datePayment,Double amount) {
		this.acceptance = acceptance;
		this.numPayment = numPayment;
		this.datePayment = datePayment;
		this.amount = amount;
	}

	@Override
	public String toString() {

		return idPayment + " " + numPayment;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPayment", unique = true, nullable = false)
	public Integer getIdPayment() {
		return this.idPayment;
	}

	public void setIdPayment(Integer idPayment) {
		this.idPayment = idPayment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "acceptance_idAcceptance")
	public Acceptance getAcceptance() {
		return this.acceptance;
	}

	public void setAcceptance(Acceptance acceptance) {
		this.acceptance = acceptance;
	}

	@Column(name = "numPayment", length = 45)
	public String getNumPayment() {
		return this.numPayment;
	}

	public void setNumPayment(String numPayment) {
		this.numPayment = numPayment;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datePayment", length = 10)
	public Date getDatePayment() {
		return this.datePayment;
	}

	public void setDatePayment(Date datePayment) {
		this.datePayment = datePayment;
	}

	@Column(name = "amount", precision = 22, scale = 0)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "modePayment", length = 45)
	public String getModePayment() {
		return this.modePayment;
	}

	public void setModePayment(String modePayment) {
		this.modePayment = modePayment;
	}

	@Column(name = "refModePayment", length = 45)
	public String getRefModePayment() {
		return this.refModePayment;
	}

	public void setRefModePayment(String refModePayment) {
		this.refModePayment = refModePayment;
	}

	@Column(name = "approuvalPayment", length = 45)
	public String getApprouvalPayment() {
		return this.approuvalPayment;
	}

	public void setApprouvalPayment(String approuvalPayment) {
		this.approuvalPayment = approuvalPayment;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateCash", length = 10)
	public Date getDateCash() {
		return this.dateCash;
	}

	public void setDateCash(Date dateCash) {
		this.dateCash = dateCash;
	}

	@Column(name = "comment", length = 9999)
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}

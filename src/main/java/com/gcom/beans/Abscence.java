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
@Table(name = "abscence")
public class Abscence implements Serializable {
	private Integer id;
	private String ressourceId;
	private Date startDay;
	private Date endDay;
	private int nbDays;
	private String justified;
	private String reason;
	private String type;

	public Abscence() {
	}

	public Abscence(String ressourceId, Date startDay, Date endDay, int nbDays,
			String justified, String reason) {
				this.ressourceId = ressourceId;
				this.startDay = startDay;
				this.endDay = endDay;
				this.nbDays = nbDays;
				this.justified = justified;
				this.reason = reason;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ressource_id", nullable = false, length = 500)
	public String getRessourceId() {
		/* 54 */return this.ressourceId;
	}

	public void setRessourceId(String ressourceId) {
		/* 58 */this.ressourceId = ressourceId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "start_day", nullable = false, length = 10)
	public Date getStartDay() {
		/* 64 */return this.startDay;
	}

	public void setStartDay(Date startDay) {
		/* 68 */this.startDay = startDay;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "end_day", nullable = false, length = 10)
	public Date getEndDay() {
		/* 74 */return this.endDay;
	}

	public void setEndDay(Date endDay) {
		/* 78 */this.endDay = endDay;
	}

	@Column(name = "nb_days", nullable = false)
	public int getNbDays() {
		/* 83 */return this.nbDays;
	}

	public void setNbDays(int nbDays) {
		/* 87 */this.nbDays = nbDays;
	}

	@Column(name = "justified", nullable = false, length = 50)
	public String getJustified() {
		/* 92 */return this.justified;
	}

	public void setJustified(String justified) {
		/* 96 */this.justified = justified;
	}

	@Column(name = "reason", length = 500)
	public String getReason() {
		/* 101 */return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getType() {
		return type;
	}
	
	@Column(name = "type", length = 500)
	public void setType(String type) {
		this.type = type;
	}
}

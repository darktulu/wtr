package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "dayoff")
public class Dayoff implements Serializable {
    private Integer iddayoff;
    private Date date;
    private String type;
    private String description;

    public Dayoff() {
    }

    public Dayoff(Date date, String type, String description) {
        this.date = date;
        this.type = type;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddayoff", unique = true, nullable = false)
    public Integer getIddayoff() {
        return this.iddayoff;
    }

    public void setIddayoff(Integer iddayoff) {
        this.iddayoff = iddayoff;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date", length = 10)
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "type", length = 45)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "description", length = 45)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "timesheet")
public class Timesheet implements Serializable {
    private Integer idtimesheet;
    private Date start;
    private Date end;
    private Date entryStrat;
    private Date entryEnd;
    private String year;
    private String month;
    private String daysoff;
    private String statys;
    private Set<Usertimesheet> usertimesheets = new HashSet(0);

    public Timesheet() {
    }

    public Timesheet(Date start, Date end, Date entryStrat, Date entryEnd, String year, String month, String daysoff, String statys, Set<Usertimesheet> usertimesheets) {
        this.start = start;
        this.end = end;
        this.entryStrat = entryStrat;
        this.entryEnd = entryEnd;
        this.year = year;
        this.month = month;
        this.daysoff = daysoff;
        this.statys = statys;
        this.usertimesheets = usertimesheets;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtimesheet", unique = true, nullable = false)
    public Integer getIdtimesheet() {
        return this.idtimesheet;
    }

    public void setIdtimesheet(Integer idtimesheet) {
        this.idtimesheet = idtimesheet;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "start", length = 10)
    public Date getStart() {
        return this.start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "end", length = 10)
    public Date getEnd() {
        return this.end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "entryStrat", length = 10)
    public Date getEntryStrat() {
        return this.entryStrat;
    }

    public void setEntryStrat(Date entryStrat) {
        this.entryStrat = entryStrat;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "entryEnd", length = 10)
    public Date getEntryEnd() {
        return this.entryEnd;
    }

    public void setEntryEnd(Date entryEnd) {
        this.entryEnd = entryEnd;
    }

    @Column(name = "year", length = 45)
    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Column(name = "month", length = 45)
    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Column(name = "daysoff", length = 500)
    public String getDaysoff() {
        return this.daysoff;
    }

    public void setDaysoff(String daysoff) {
        this.daysoff = daysoff;
    }

    @Column(name = "statys", length = 45)
    public String getStatys() {
        return this.statys;
    }

    public void setStatys(String statys) {
        this.statys = statys;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "timesheet")
    public Set<Usertimesheet> getUsertimesheets() {
        return this.usertimesheets;
    }

    public void setUsertimesheets(Set<Usertimesheet> usertimesheets) {
        this.usertimesheets = usertimesheets;
    }
}

package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usertimesheet")
public class Usertimesheet implements Serializable {
    private UsertimesheetId id;
    private Users users;
    private Timesheet timesheet;
    private String status;
    private Date entryDate;
    private String motif;
    private Set<Usertimesheetline> usertimesheetlines = new HashSet(0);

    public Usertimesheet() {
    }

    public Usertimesheet(UsertimesheetId id, Users users, Timesheet timesheet) {
        this.id = id;
        this.users = users;
        this.timesheet = timesheet;
    }

    public Usertimesheet(UsertimesheetId id, Users users, Timesheet timesheet, String status, Date entryDate, String motif, Set<Usertimesheetline> usertimesheetlines) {
        this.id = id;
        this.users = users;
        this.timesheet = timesheet;
        this.status = status;
        this.entryDate = entryDate;
        this.motif = motif;
        this.usertimesheetlines = usertimesheetlines;
    }

    @EmbeddedId
    @AttributeOverrides({@javax.persistence.AttributeOverride(name = "usersUsername", column = @Column(name = "users_username", nullable = false, length = 45)), @javax.persistence.AttributeOverride(name = "timesheetIdtimesheet", column = @Column(name = "timesheet_idtimesheet", nullable = false))})
    public UsertimesheetId getId() {
        return this.id;
    }

    public void setId(UsertimesheetId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_username", nullable = false, insertable = false, updatable = false)
    public Users getUsers() {
        return this.users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "timesheet_idtimesheet", nullable = false, insertable = false, updatable = false)
    public Timesheet getTimesheet() {
        return this.timesheet;
    }

    public void setTimesheet(Timesheet timesheet) {
        this.timesheet = timesheet;
    }

    @Column(name = "status", length = 45)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "entryDate", length = 10)
    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Column(name = "motif", length = 1000)
    public String getMotif() {
        return this.motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "usertimesheet")
    public Set<Usertimesheetline> getUsertimesheetlines() {
        return this.usertimesheetlines;
    }

    public void setUsertimesheetlines(Set<Usertimesheetline> usertimesheetlines) {
        this.usertimesheetlines = usertimesheetlines;
    }
}

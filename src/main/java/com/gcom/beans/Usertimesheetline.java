package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usertimesheetline")
public class Usertimesheetline implements Serializable {
    private UsertimesheetlineId id;
    private Task task;
    private Usertimesheet usertimesheet;
    private String number;
    private String other1;
    private String other2;

    public Usertimesheetline() {
    }

    public Usertimesheetline(UsertimesheetlineId id, Task task, Usertimesheet usertimesheet) {
        this.id = id;
        this.task = task;
        this.usertimesheet = usertimesheet;
    }

    public Usertimesheetline(UsertimesheetlineId id, Task task, Usertimesheet usertimesheet, String number, String other1, String other2) {
        this.id = id;
        this.task = task;
        this.usertimesheet = usertimesheet;
        this.number = number;
        this.other1 = other1;
        this.other2 = other2;
    }

    @EmbeddedId
    @AttributeOverrides({@javax.persistence.AttributeOverride(name = "usersHasTimesheetUsersUsername", column = @Column(name = "users_has_timesheet_users_username", nullable = false, length = 45)), @javax.persistence.AttributeOverride(name = "usersHasTimesheetTimesheetIdtimesheet", column = @Column(name = "users_has_timesheet_timesheet_idtimesheet", nullable = false)), @javax.persistence.AttributeOverride(name = "taskIdtask", column = @Column(name = "task_idtask", nullable = false)), @javax.persistence.AttributeOverride(name = "day", column = @Column(name = "day", nullable = false, length = 10))})
    public UsertimesheetlineId getId() {
        return this.id;
    }

    public void setId(UsertimesheetlineId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_idtask", nullable = false, insertable = false, updatable = false)
    public Task getTask() {
        return this.task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({@JoinColumn(name = "users_has_timesheet_users_username", referencedColumnName = "users_username", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "users_has_timesheet_timesheet_idtimesheet", referencedColumnName = "timesheet_idtimesheet", nullable = false, insertable = false, updatable = false)})
    public Usertimesheet getUsertimesheet() {
        return this.usertimesheet;
    }

    public void setUsertimesheet(Usertimesheet usertimesheet) {
        this.usertimesheet = usertimesheet;
    }

    @Column(name = "number", length = 45)
    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Column(name = "other1", length = 45)
    public String getOther1() {
        return this.other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    @Column(name = "other2", length = 45)
    public String getOther2() {
        return this.other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }
}

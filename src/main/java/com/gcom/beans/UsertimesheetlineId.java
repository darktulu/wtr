package com.gcom.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class UsertimesheetlineId implements Serializable {
    private String usersHasTimesheetUsersUsername;
    private int usersHasTimesheetTimesheetIdtimesheet;
    private int taskIdtask;
    private Date day;

    public UsertimesheetlineId() {
    }

    public UsertimesheetlineId(String usersHasTimesheetUsersUsername, int usersHasTimesheetTimesheetIdtimesheet, int taskIdtask, Date day) {
        this.usersHasTimesheetUsersUsername = usersHasTimesheetUsersUsername;
        this.usersHasTimesheetTimesheetIdtimesheet = usersHasTimesheetTimesheetIdtimesheet;
        this.taskIdtask = taskIdtask;
        this.day = day;
    }

    @Column(name = "users_has_timesheet_users_username", nullable = false, length = 45)
    public String getUsersHasTimesheetUsersUsername() {
        return this.usersHasTimesheetUsersUsername;
    }

    public void setUsersHasTimesheetUsersUsername(String usersHasTimesheetUsersUsername) {
        this.usersHasTimesheetUsersUsername = usersHasTimesheetUsersUsername;
    }

    @Column(name = "users_has_timesheet_timesheet_idtimesheet", nullable = false)
    public int getUsersHasTimesheetTimesheetIdtimesheet() {
        return this.usersHasTimesheetTimesheetIdtimesheet;
    }

    public void setUsersHasTimesheetTimesheetIdtimesheet(int usersHasTimesheetTimesheetIdtimesheet) {
        this.usersHasTimesheetTimesheetIdtimesheet = usersHasTimesheetTimesheetIdtimesheet;
    }

    @Column(name = "task_idtask", nullable = false)
    public int getTaskIdtask() {
        return this.taskIdtask;
    }

    public void setTaskIdtask(int taskIdtask) {
        this.taskIdtask = taskIdtask;
    }

    @Column(name = "day", nullable = false, length = 10)
    public Date getDay() {
        return this.day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (!(other instanceof UsertimesheetlineId)) {
            return false;
        }
        UsertimesheetlineId castOther = (UsertimesheetlineId) other;

        return ((getUsersHasTimesheetUsersUsername() == castOther.getUsersHasTimesheetUsersUsername()) || ((getUsersHasTimesheetUsersUsername() != null) && (castOther.getUsersHasTimesheetUsersUsername() != null) && (getUsersHasTimesheetUsersUsername().equals(castOther.getUsersHasTimesheetUsersUsername())))) && (getUsersHasTimesheetTimesheetIdtimesheet() == castOther.getUsersHasTimesheetTimesheetIdtimesheet()) && (getTaskIdtask() == castOther.getTaskIdtask()) && ((getDay() == castOther.getDay()) || ((getDay() != null) && (castOther.getDay() != null) && (getDay().equals(castOther.getDay()))));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getUsersHasTimesheetUsersUsername() == null ? 0 : getUsersHasTimesheetUsersUsername().hashCode());
        result = 37 * result + getUsersHasTimesheetTimesheetIdtimesheet();
        result = 37 * result + getTaskIdtask();
        result = 37 * result + (getDay() == null ? 0 : getDay().hashCode());
        return result;
    }
}

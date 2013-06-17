package com.gcom.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsertimesheetId implements Serializable {
    private String usersUsername;
    private int timesheetIdtimesheet;

    public UsertimesheetId() {
    }

    public UsertimesheetId(String usersUsername, int timesheetIdtimesheet) {
        this.usersUsername = usersUsername;
        this.timesheetIdtimesheet = timesheetIdtimesheet;
    }

    @Column(name = "users_username", nullable = false, length = 45)
    public String getUsersUsername() {
        return this.usersUsername;
    }

    public void setUsersUsername(String usersUsername) {
        this.usersUsername = usersUsername;
    }

    @Column(name = "timesheet_idtimesheet", nullable = false)
    public int getTimesheetIdtimesheet() {
        return this.timesheetIdtimesheet;
    }

    public void setTimesheetIdtimesheet(int timesheetIdtimesheet) {
        this.timesheetIdtimesheet = timesheetIdtimesheet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (!(other instanceof UsertimesheetId)) {
            return false;
        }
        UsertimesheetId castOther = (UsertimesheetId) other;

        return ((getUsersUsername().equals(castOther.getUsersUsername()))
                || ((getUsersUsername() != null) && (castOther.getUsersUsername() != null)
                && (getUsersUsername().equals(castOther.getUsersUsername()))))
                && (getTimesheetIdtimesheet() == castOther.getTimesheetIdtimesheet());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getUsersUsername() == null ? 0 : getUsersUsername().hashCode());
        result = 37 * result + getTimesheetIdtimesheet();
        return result;
    }
}

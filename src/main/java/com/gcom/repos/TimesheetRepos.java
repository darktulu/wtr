package com.gcom.repos;

import com.gcom.beans.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("timesheetRepos")
public interface TimesheetRepos extends JpaRepository<Timesheet, Integer> {
}

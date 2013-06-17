package com.gcom.repos;

import com.gcom.beans.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesheetRepos extends JpaRepository<Timesheet, Integer> {
}

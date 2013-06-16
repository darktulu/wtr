package com.gcom.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcom.beans.Timesheet;

@Repository("timesheetRepos")
public interface TimesheetRepos extends JpaRepository<Timesheet,Integer> {

}

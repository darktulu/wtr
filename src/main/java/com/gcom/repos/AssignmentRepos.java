package com.gcom.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcom.beans.Assignment;


@Repository("assignmentRepos")
public interface AssignmentRepos  extends JpaRepository<Assignment, Integer>{

}

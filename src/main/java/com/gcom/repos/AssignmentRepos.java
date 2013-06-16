package com.gcom.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("assignmentRepos")
public interface AssignmentRepos  extends JpaRepository<AssignmentRepos, Integer>{

}

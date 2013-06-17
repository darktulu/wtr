package com.gcom.repos;

import com.gcom.beans.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepos extends JpaRepository<Assignment, Integer> {
}

package com.gcom.repos;

import com.gcom.beans.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssignmentRepos extends JpaRepository<Assignment, Integer> {
    List<Assignment> findByUserUsername(String username);
}

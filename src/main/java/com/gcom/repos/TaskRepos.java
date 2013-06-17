package com.gcom.repos;

import com.gcom.beans.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("taskRepos")
public interface TaskRepos extends JpaRepository<Task, Integer> {
}

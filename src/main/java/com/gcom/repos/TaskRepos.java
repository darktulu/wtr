package com.gcom.repos;

import com.gcom.beans.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepos extends JpaRepository<Task, Integer> {
}

package com.gcom.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcom.beans.Project;
import com.gcom.beans.Task;

@Repository("taskRepos")
public interface TaskRepos extends JpaRepository<Task,Integer>{

}

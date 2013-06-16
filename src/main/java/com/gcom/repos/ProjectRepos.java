package com.gcom.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gcom.beans.Project;


@Repository("projectRepos")
public interface ProjectRepos extends JpaRepository<Project,Integer> {
	
	
	@Query("update Project set status='Closed' where idproject=:idProjectToClose")
	public void closeProject(@Param("idProjectToClose") Integer idProjectToClose);
	
	@Query("From Project where status!='Closed'")
	public List<Project> getAllByProjectNotClosed();
	
	@Query("From Project where manager_idmanager=:manager")
	public List<Project> getAllByProjectManager(@Param("manager") String manager);
	
	

}

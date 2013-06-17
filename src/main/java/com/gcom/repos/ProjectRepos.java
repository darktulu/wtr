package com.gcom.repos;

import com.gcom.beans.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("projectRepos")
public interface ProjectRepos extends JpaRepository<Project, Integer> {
    @Query("update Project set status='Closed' where idproject=:idProjectToClose")
    void closeProject(@Param("idProjectToClose") Integer idProjectToClose);

    @Query("From Project where status!='Closed'")
    List<Project> getAllByProjectNotClosed();

    @Query("From Project where manager_idmanager=:manager")
    List<Project> getAllByProjectManager(@Param("manager") String manager);
}

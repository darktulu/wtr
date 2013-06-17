package com.gcom.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gcom.beans.Lob;

@Repository("lobRepos")
public interface LobRepos  extends JpaRepository<Lob, Integer> {
	@Query("from Lob where manager_idmanager=:manager")
	List<Lob> findByManager(@Param("manager") String manager);
}

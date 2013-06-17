package com.gcom.repos;

import com.gcom.beans.Lob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LobRepos extends JpaRepository<Lob, Integer> {
    @Query("from Lob where manager_idmanager=:manager")
    List<Lob> findByManager(@Param("manager") String manager);
}

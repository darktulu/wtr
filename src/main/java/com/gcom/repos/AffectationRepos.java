package com.gcom.repos;

import com.gcom.beans.Affectation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AffectationRepos extends JpaRepository<Affectation, Integer> {
    @Query("from Affectation where usersByUsersUsername.username =:username")
    Affectation findMyManager(@Param("username") String paramString);

    @Query("select usersByUsersUsername.username from Affectation where usersByUsersLm.username = :username")
    List<String> MyReportsList(@Param("username") String paramString);
}

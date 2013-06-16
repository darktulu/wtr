package com.gcom.repos;

import com.gcom.beans.Affectation;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("affectationRepos")
public abstract interface AffectationRepos extends JpaRepository<Affectation, Integer>{
  @Query("from Affectation where usersByUsersUsername.username =:username")
  public abstract Affectation findMyManager(@Param("username") String paramString);

  @Query("select usersByUsersUsername.username from Affectation where usersByUsersLm.username = :username")
  public abstract List<String> MyReportsList(@Param("username") String paramString);
}


package com.gcom.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gcom.beans.Authorities;

@Repository("authoritiesRepos")
public interface AuthoritiesRepos  extends JpaRepository<Authorities,Integer> {
	
	  @Query("From Authorities a where a.users.username=:username and a.id.authority=:role")
	  public  List<Authorities> findByUsernameAndRole(@Param("username") String paramUsername,@Param("role") String paramRole);

}

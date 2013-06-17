package com.gcom.repos;

import com.gcom.beans.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthoritiesRepos extends JpaRepository<Authorities, Integer> {
    @Query("From Authorities a where a.users.username=:username and a.id.authority=:role")
    List<Authorities> findByUsernameAndRole(@Param("username") String paramUsername, @Param("role") String paramRole);
}

package com.gcom.repos;

import com.gcom.beans.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsersRepos extends JpaRepository<Users, String> {
    Users findByUsername(String paramString);

    @Query("update Users set password=:passwordMD5  where username=:id ")
    void update(@Param("passwordMD5") String passwordMD5, @Param("id") String id);
}

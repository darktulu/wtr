package com.gcom.repos;

import com.gcom.beans.Usertimesheetline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("usertimesheetlineRepos")
public interface UsertimesheetlineRepos extends JpaRepository<Usertimesheetline, Integer> {
}

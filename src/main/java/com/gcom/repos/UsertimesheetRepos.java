package com.gcom.repos;

import com.gcom.beans.Usertimesheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("usertimesheetRepos")
public interface UsertimesheetRepos extends JpaRepository<Usertimesheet, Integer> {
}

package com.gcom.repos;

import com.gcom.beans.Usertimesheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsertimesheetRepos extends JpaRepository<Usertimesheet, Integer> {
}

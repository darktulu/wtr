package com.gcom.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcom.beans.Usertimesheet;

@Repository("usertimesheetRepos")
public interface UsertimesheetRepos extends JpaRepository<Usertimesheet,Integer> {

}

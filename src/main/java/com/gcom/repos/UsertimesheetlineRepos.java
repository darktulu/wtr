package com.gcom.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcom.beans.Usertimesheetline;


@Repository("usertimesheetlineRepos")
public interface UsertimesheetlineRepos extends JpaRepository<Usertimesheetline,Integer> {

}

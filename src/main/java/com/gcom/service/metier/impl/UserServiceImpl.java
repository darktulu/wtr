package com.gcom.service.metier.impl;


import java.io.Serializable;

import javax.inject.Inject;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcom.beans.status.Roles;
import com.gcom.repos.AuthoritiesRepos;
import com.gcom.service.metier.UserService;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService,Serializable{
	
	private static final long serialVersionUID = 1L;
	static Log log = LogFactory.getLog(UserServiceImpl.class.getName());
	
	@Inject
	private AuthoritiesRepos authoritiesRepos;
	
	
	@Override
	public boolean isHR(String username) {
		return authoritiesRepos.findByUsernameAndRole(username,Roles.HR.getValue()).size()!=0;
	}
	@Override
	public boolean isPM(String username) {
		 return authoritiesRepos.findByUsernameAndRole(username,Roles.PM.getValue()).size()!=0;
	}
	
	

	

}

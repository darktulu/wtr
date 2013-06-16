package com.gcom.view;

import java.io.Serializable;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.context.SecurityContextHolder;

import com.gcom.service.metier.UserService;

@ManagedBean(name="sessionBean")
@SessionScoped
public class SessionBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	static Log log = LogFactory.getLog(SessionBean.class.getName());
	
	private String username;
	private boolean isHR = false;
	private boolean isPM = false;


	@ManagedProperty("#{userService}")
	private UserService userService;
	
	public String getUsername() {
		username = SecurityContextHolder.getContext().getAuthentication().getName();
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String logDate() {
		Calendar rightNow = Calendar.getInstance();
		rightNow.toString();
		return " " + rightNow.getTime();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public UserService getUserService() {
		return userService;
	}

	public boolean isHR() {
		isHR = userService.isHR(SecurityContextHolder.getContext().getAuthentication().getName());
		return isHR;
	}

	public void setHR(boolean isHR) {
		this.isHR = isHR;
	}

	public boolean isPM() {
		isPM = userService.isPM(SecurityContextHolder.getContext().getAuthentication().getName());
		return isPM;
	}

	public void setPM(boolean isPM) {
		this.isPM = isPM;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	
}

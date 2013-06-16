package com.gcom.service.login;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UsersVO implements Serializable, UserDetails {
	private String username;
	private String password;
	private String info;
	private String firstname;
	private String lastname;
	private String info2;
	private String fullName;
	private List<GrantedAuthority> authoritieses;
	private boolean projectManager = false;
	private boolean lobManager = false;
	private boolean assistante = false;
	private boolean accountant = false;
	private boolean cfo = false;
	

	public UsersVO() {
	}

	public UsersVO(String username) {
		this.username = username;
	}

	public UsersVO(String username, String fullName, String password, boolean enabled,boolean accountNonExpired, boolean credentialsNonExpired,boolean accountNonLocked, List<GrantedAuthority> list, String info, String firstname, String lastname, String info2) {
		this.username = username;
		this.fullName = fullName;
		this.password = password;
		this.info = info;
		this.firstname = firstname;
		this.lastname = lastname;
		this.info2 = info2;
		this.authoritieses = list;
		
	}

	public String getFullName() {
		return this.firstname + " " + this.lastname;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfo2() {
		return this.info2;
	}

	public void setInfo2(String info2) {
		this.info2 = info2;
	}

	public List getAuthoritieses() {
		return this.authoritieses;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authoritieses;
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return true;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String toString() {
		return "username : " + this.username + " password : " + this.password+ " authorities :" + this.authoritieses;
	}

	public boolean isProjectManager() {
		return projectManager;
	}

	public void setProjectManager(boolean projectManager) {
		this.projectManager = projectManager;
	}

	public boolean isLobManager() {
		return lobManager;
	}

	public void setLobManager(boolean lobManager) {
		this.lobManager = lobManager;
	}

	public boolean isAssistante() {
		return assistante;
	}

	public void setAssistante(boolean assistante) {
		this.assistante = assistante;
	}

	public boolean isAccountant() {
		return accountant;
	}

	public void setAccountant(boolean accountant) {
		this.accountant = accountant;
	}

	public boolean isCfo() {
		return cfo;
	}

	public void setCfo(boolean cfo) {
		this.cfo = cfo;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}




}

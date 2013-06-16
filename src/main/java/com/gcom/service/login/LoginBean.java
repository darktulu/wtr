package com.gcom.service.login;

import javax.faces.application.FacesMessage;
    
import javax.faces.bean.ManagedBean;
    
import javax.faces.bean.ManagedProperty;
    
import javax.faces.bean.RequestScoped;
    
import javax.faces.context.FacesContext;
    
import org.springframework.security.core.AuthenticationException;


    
    @ManagedBean
    @RequestScoped
    public class LoginBean
    {
	    private String username;
	    private String password;
	    
	    @ManagedProperty("#{authenticationService}")
	    private AuthenticationService authenticationService;

	    
	    public String doLogin()
	    {
		    try
		    {
			  this.authenticationService.login(this.username, this.password);
			      return "MyWTRList?faces-redirect=true";
			         } catch (AuthenticationException e) {
			             FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Le mot de passe / nom d'utilisateur est incorrect.",null));
			    }
		    
		                   return "index";
		    }

	    
	    public String doLogout()
	    {
		  this.authenticationService.logout();
		  return "index";
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

	    
	    public AuthenticationService getAuthenticationService() {
		  return this.authenticationService;
		    }

	    
	    public void setAuthenticationService(
			AuthenticationService authenticationService) {
		  this.authenticationService = authenticationService;
		    }
	    
}



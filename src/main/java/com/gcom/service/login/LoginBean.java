package com.gcom.service.login;

import org.springframework.security.core.AuthenticationException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class LoginBean {
    @ManagedProperty("#{authenticationService}")
    private AuthenticationService authenticationService;

    private String username;
    private String password;

    public String doLogin() {
        try {
            this.authenticationService.login(this.username, this.password);
            return "MyWTRList?faces-redirect=true";
        } catch (AuthenticationException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Le mot de passe / nom d'utilisateur est incorrect.", null));
        }

        return "index";
    }

    public String doLogout() {
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

package com.gcom.view;

import com.gcom.service.metier.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Calendar;

@ManagedBean(name = "sessionBean")
@SessionScoped
public class SessionBean implements Serializable {
    private static final long serialVersionUID = 1L;
    static Log log = LogFactory.getLog(SessionBean.class.getName());

    @ManagedProperty("#{userService}")
    private UserService userService;

    private String username;
    private boolean isHR = false;
    private boolean isPM = false;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

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

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
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
}

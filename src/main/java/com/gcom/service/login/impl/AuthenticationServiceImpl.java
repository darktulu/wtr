package com.gcom.service.login.impl;

import com.gcom.service.login.AuthenticationService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("authenticationService")
public class AuthenticationServiceImpl implements AuthenticationService {

    @Resource(name = "authenticationManager")
    private AuthenticationManager authenticationManager;

    public void login(String login, String password) throws AuthenticationException {
        Authentication authenticate = this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login, password));

        if (authenticate.isAuthenticated()) {
            SecurityContextHolder.getContext().setAuthentication(authenticate);
        }
    }

    public void logout() {
        SecurityContextHolder.getContext().setAuthentication(null);
    }
}

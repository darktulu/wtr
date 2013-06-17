package com.gcom.service.login;

import org.springframework.security.core.AuthenticationException;

public interface AuthenticationService {
    void login(String paramString1, String paramString2) throws AuthenticationException;

    void logout();
}

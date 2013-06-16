package com.gcom.service.login;

import org.springframework.security.core.AuthenticationException;

public abstract interface AuthenticationService
{
  public abstract void login(String paramString1, String paramString2)
    throws AuthenticationException;

  public abstract void logout();
}


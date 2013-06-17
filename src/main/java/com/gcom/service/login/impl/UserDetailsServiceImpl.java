package com.gcom.service.login.impl;


import com.gcom.beans.Authorities;
import com.gcom.repos.UsersRepos;
import com.gcom.service.login.UsersVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service("userDetailsService")
@Transactional(readOnly = true)
public class UserDetailsServiceImpl implements UserDetailsService {
    protected static Logger logger = Logger.getLogger("UserDetailsService");
    @Autowired
    private UsersRepos usersRepos;

    public static List<GrantedAuthority> getGrantedAuthorities(Set<Authorities> roles) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        if (roles == null) {
            return authorities;
        }
        for (Authorities role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getId().getAuthority()));
        }
        return authorities;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            com.gcom.beans.Users users = usersRepos.findByUsername(username);

            boolean enabled = true;
            boolean accountNonExpired = true;
            boolean credentialsNonExpired = true;
            boolean accountNonLocked = true;
            return new UsersVO(users.getUsername(),
                    users.getFirstname() + " " + users.getLastname(),
                    users.getPassword(), enabled, accountNonExpired,
                    credentialsNonExpired, accountNonLocked,
                    getGrantedAuthorities(users.getAuthoritieses()),
                    users.getInfo(), users.getFirstname(),
                    users.getLastname(), users.getInfo2());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

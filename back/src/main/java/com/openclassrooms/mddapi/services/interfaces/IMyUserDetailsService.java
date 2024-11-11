package com.openclassrooms.mddapi.services.interfaces;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IMyUserDetailsService extends UserDetailsService {
    UserDetails loadUserByUsername(String username);
}

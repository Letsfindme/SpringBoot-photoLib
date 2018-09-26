package com.photolib.demo.service;

import com.photolib.demo.shared.dto.UserDtoShared;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService{
    UserDtoShared createUser(UserDtoShared user);
}

package com.photolib.demo.service.impl;

import com.photolib.demo.shared.dto.UserDtoShared;
import com.photolib.demo.shared.Utils;
import com.photolib.demo.io.repository.UserRepository;
import com.photolib.demo.service.UserService;
import com.photolib.demo.io.entity.UserEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {


    @Autowired
    UserRepository userRepository;


    @Autowired
    Utils utils;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public UserDtoShared createUser(UserDtoShared user) {

        if (userRepository.findUserByEmail(user.getEmail()) != null) throw new RuntimeException("already registered ");
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);


        String publicUserId = utils.generateUserId(30);
        userEntity.setUserId(publicUserId);

        userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));


        UserEntity storedUserDetails = userRepository.save(userEntity);


        UserDtoShared returnValue = new UserDtoShared();
        BeanUtils.copyProperties(storedUserDetails, returnValue);


        return returnValue;
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}

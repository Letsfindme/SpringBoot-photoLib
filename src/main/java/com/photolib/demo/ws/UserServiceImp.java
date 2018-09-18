package com.photolib.demo.ws;

import com.photolib.demo.Model.UserDtoShared;
import com.photolib.demo.ws.service.io.entity.UserEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {


    @Autowired
    UserRepository userRepository;


    @Override
    public UserDtoShared createUser(UserDtoShared user) {

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);


        userEntity.setEncryptedPassword("root");
        userEntity.setUserId("users");

        UserEntity storedUserDetails = userRepository.save(userEntity);

        UserDtoShared returnValue = new UserDtoShared();
        BeanUtils.copyProperties(storedUserDetails, returnValue);


        return returnValue;
    }


}

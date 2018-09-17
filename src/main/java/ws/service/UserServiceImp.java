package ws.service;

import Model.UserDtoShared;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ws.UserRepository;
import ws.service.io.entity.UserEntity;


@Service
public class UserServiceImp implements UserService {


    @Autowired
    UserRepository userRepository;


    @Override
    public UserDtoShared createUser(UserDtoShared user) {

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);


        //userEntity.setEncryptedPassword("root");
//        userEntity.setUserId("user");

  //      UserEntity storedUserDetails = userRepository.save(userEntity);

        UserDtoShared returnValue = new UserDtoShared();
    //    BeanUtils.copyProperties(storedUserDetails, returnValue);


        return returnValue;
    }


}

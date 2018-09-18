package com.photolib.demo.ws;


import com.photolib.demo.ws.service.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long>{


    UserEntity findUserByEmail(String email);



}

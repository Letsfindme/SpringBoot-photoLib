package com.photolib.demo.io.repository;


import com.photolib.demo.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long>{



    UserEntity findUserByEmail(String email);



}

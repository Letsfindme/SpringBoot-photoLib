package controller;


import Model.UserDetailsRequestModel;
import Model.UserDtoShared;
import Model.UserRestResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ws.service.UserService;




@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class UserController {



    @Autowired
    UserService userService;


    @GetMapping("/test")
    public String getUser(){
        return "getUser was called";
    }

    @PostMapping
    public UserRestResponseModel createUser(@RequestBody UserDetailsRequestModel userDetails){

        UserRestResponseModel returnValue = new UserRestResponseModel();

        UserDtoShared userDto =new UserDtoShared();

        BeanUtils.copyProperties(userDetails, userDto);

        UserDtoShared createdUser =userService.createUser(userDto);

        BeanUtils.copyProperties(createdUser,returnValue);


        return returnValue;
    }

    @PutMapping
    public String updateUser(){
        return "updateUser was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "deleteUser was called";
    }

}

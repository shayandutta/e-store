package com.shayan.electronic.store.ElectronicStore.service;

//use of repository layer to create service layer


import com.shayan.electronic.store.ElectronicStore.dtos.UserDto;
import com.shayan.electronic.store.ElectronicStore.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    //create
    //passing dto
    UserDto createUser(UserDto userDto);


    //update
    UserDto updateUser(UserDto userDto, String userId);

    //delete
    void deleteUser(String userId); //deleting users by id

    //get all user
    List<UserDto> getAllUser();

    //get single user by id
    UserDto getUserById(String userId);

    //get single user by email
    UserDto getUserByEmail(String email);

    //search user
    List<UserDto> searchUser(String keyword);

    //other user specific feature
}

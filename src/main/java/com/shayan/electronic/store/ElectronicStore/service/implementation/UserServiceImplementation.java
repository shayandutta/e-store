package com.shayan.electronic.store.ElectronicStore.service.implementation;

import com.shayan.electronic.store.ElectronicStore.Repository.UserRepository;
import com.shayan.electronic.store.ElectronicStore.dtos.UserDto;
import com.shayan.electronic.store.ElectronicStore.entity.User;
import com.shayan.electronic.store.ElectronicStore.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDto createUser(UserDto userDto) {

        //generate unique id in string form and set to dto
        String userId = UUID.randomUUID().toString();
        userDto.setUserId(userId);

        //dto -> entity
        User user = dtoToEntity(userDto); //userDto le raha hai aur User entity ka object de raha hai
        User savedUser = userRepository.save(user);

        //entity -> user
        UserDto newDto = entityToDto(savedUser);
        return newDto; //return toh dto hi karna hai
    }



    @Override
    public UserDto updateUser(UserDto userDto, String userId) {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public List<UserDto> getAllUser() {
        return List.of();
    }

    @Override
    public UserDto getUserById(String userId) {
        return null;
    }

    @Override
    public UserDto getUserByEmail(String email) {
        return null;
    }

    @Override
    public List<UserDto> searchUser(String keyword) {
        return List.of();
    }


    private UserDto entityToDto(User savedUser) {
        UserDto userDto = UserDto.builder()
                .userId(savedUser.getUserId())
                .name(savedUser.getName())
                .email(savedUser.getEmail())
                .password(savedUser.getPassword())
                .about(savedUser.getAbout())
                .gender(savedUser.getGender())
                .imageName(savedUser.getImageName())
                .build();
        return userDto;
    }

    private User dtoToEntity(UserDto userDto) {
        User user = User.builder()
                .userId(userDto.getUserId())
                .name(userDto.getName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .about(userDto.getAbout())
                .gender(userDto.getGender())
                .imageName(userDto.getImageName())
                .build();
        return user;
    }
}

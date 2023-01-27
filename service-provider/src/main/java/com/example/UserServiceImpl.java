package com.example;


import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Override
    public UserDTO findUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setName("James");
        userDTO.setId(10);
        return userDTO;
    }
}

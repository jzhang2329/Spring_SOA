package com.example;


import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Override
    public UserDTO findUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setName("张三丰");
        userDTO.setId(10);
        return userDTO;
    }
}

package com.inventory.service;


import com.inventory.dto.UserDTO;
import com.inventory.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    public UserDTO createUser(UserDTO userDTO);
    public UserResponseDTO getUserById(int userId);
    public UserDTO deleteUserById(int userId);
    public List<UserResponseDTO> getAllUsers();
    public UserDTO updateUserById(int userId, UserDTO updatedUserDTO);


}

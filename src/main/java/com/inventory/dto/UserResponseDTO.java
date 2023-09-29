package com.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {
    private String name;
    private String email;
    private String address;
    private String gender;
    private String phone;
}

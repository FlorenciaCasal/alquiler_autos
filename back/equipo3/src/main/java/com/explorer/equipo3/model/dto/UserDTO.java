package com.explorer.equipo3.model.dto;

import com.explorer.equipo3.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String name;
    private String lastname;
    private String email;
    private boolean admin;
}

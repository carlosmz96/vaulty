package com.vaulty.vaulty_api.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserRequest {

    private String email;
    private String password;
    private String firstName;
    private String lastName;

}

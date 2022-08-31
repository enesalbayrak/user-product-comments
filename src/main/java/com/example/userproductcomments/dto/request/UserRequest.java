package com.example.userproductcomments.dto.request;

import lombok.Data;

@Data
public class UserRequest {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
}

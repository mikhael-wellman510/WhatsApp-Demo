package com.example.MessengersProjectExample.Service;

import com.example.MessengersProjectExample.DTO.Request.UsersRequest;
import com.example.MessengersProjectExample.DTO.Response.UserResponse;

public interface UsersService {
    UserResponse addUsers(UsersRequest usersRequest);
}

package com.example.MessengersProjectExample.Service;

import com.example.MessengersProjectExample.DTO.Request.UsersRequest;
import com.example.MessengersProjectExample.DTO.Response.UserResponse;
import com.example.MessengersProjectExample.Entity.Users;
import com.example.MessengersProjectExample.Repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor

public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;
    @Override
    public UserResponse addUsers(UsersRequest usersRequest) {

        Users users = Users.builder()
                .phoneNumber(usersRequest.getPhoneNumber())
                .username(usersRequest.getUsername())
                .createdAt(LocalDateTime.now())
                .build();

        Users save = usersRepository.save(users);



        return UserResponse.builder()
                .id(save.getId())
                .phoneNumber(save.getPhoneNumber())
                .userName(save.getUsername())
                .build();
    }
}

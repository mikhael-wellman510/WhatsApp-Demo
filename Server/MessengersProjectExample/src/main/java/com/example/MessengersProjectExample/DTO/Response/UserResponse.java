package com.example.MessengersProjectExample.DTO.Response;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserResponse {
    private String id;
    private String phoneNumber;
    private String userName;

    @Override
    public String toString() {
        return "UserResponse{" +
                "id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}

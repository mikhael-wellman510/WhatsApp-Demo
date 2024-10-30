package com.example.MessengersProjectExample.DTO.Request;

import jakarta.validation.constraints.Digits;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UsersRequest {
    @Digits(integer = 20 , fraction = 0 , message = "Hanya bisa angka")
    private String phoneNumber;
    private String username;
    private LocalDateTime lastSeen;
    private Boolean isOnline;

    @Override
    public String toString() {
        return "UsersRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", username='" + username + '\'' +
                ", lastSeen=" + lastSeen +
                ", isOnline=" + isOnline +
                '}';
    }
}

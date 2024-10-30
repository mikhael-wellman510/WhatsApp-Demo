package com.example.MessengersProjectExample.DTO.Request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ContactsRequest {
    private String name;
    private String number;
    private String userId;

    @Override
    public String toString() {
        return "ContactsRequest{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}

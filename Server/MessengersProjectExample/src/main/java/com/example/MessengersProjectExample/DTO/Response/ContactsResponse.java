package com.example.MessengersProjectExample.DTO.Response;

import com.example.MessengersProjectExample.Entity.Users;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ContactsResponse {
    private String id;
    private Users user;
    private Users contactsId;
    private String name;

    @Override
    public String toString() {
        return "ContactsResponse{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", contactsId=" + contactsId +
                ", name='" + name + '\'' +
                '}';
    }
}

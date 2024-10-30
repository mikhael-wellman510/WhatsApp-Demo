package com.example.MessengersProjectExample.DTO.Request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class MessageRequest {

    private String conversationId;
    private String senderId;
    private String content;


    @Override
    public String toString() {
        return "MessageRequest{" +
                "conversationId='" + conversationId + '\'' +
                ", senderId='" + senderId + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

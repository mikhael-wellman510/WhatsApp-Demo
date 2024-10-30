package com.example.MessengersProjectExample.DTO.Response;

import com.example.MessengersProjectExample.Entity.Conversations;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class MessageResponse {

    private String id;
    private Conversations conversations;
    private String sender;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;

    @Override
    public String toString() {
        return "MessageResponse{" +
                "id='" + id + '\'' +
                ", conversations=" + conversations +
                ", sender='" + sender + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", deletedAt=" + deletedAt +
                '}';
    }
}

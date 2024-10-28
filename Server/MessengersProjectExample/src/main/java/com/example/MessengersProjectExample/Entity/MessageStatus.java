package com.example.MessengersProjectExample.Entity;


import com.example.MessengersProjectExample.Constant.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_message_status")
public class MessageStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "messages_id")
    private Messages messagesId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Override
    public String toString() {
        return "MessageStatus{" +
                "id='" + id + '\'' +
                ", messagesId=" + messagesId +
                ", userId=" + userId +
                ", status=" + status +
                ", updatedAt=" + updatedAt +
                '}';
    }
}

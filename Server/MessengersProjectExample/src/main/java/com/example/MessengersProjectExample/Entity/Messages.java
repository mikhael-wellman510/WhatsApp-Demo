package com.example.MessengersProjectExample.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_messages")
@Builder(toBuilder = true)
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "conversations_id")
    private Conversations conversationsId;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Users senderId;


    private String content;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Override
    public String toString() {
        return "Messages{" +
                "id='" + id + '\'' +
                ", conversationsId=" + conversationsId +
                ", senderId=" + senderId +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", deletedAt=" + deletedAt +
                '}';
    }
}

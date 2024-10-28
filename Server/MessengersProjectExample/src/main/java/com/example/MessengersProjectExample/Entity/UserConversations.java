package com.example.MessengersProjectExample.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_user_conversations")
@Builder(toBuilder = true)
public class UserConversations {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @ManyToOne
    @JoinColumn(name = "conversations_id")
    private Conversations conversationsId;

    @Column(name = "joined_at")
    private LocalDateTime joinedAt;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    @Override
    public String toString() {
        return "UserConversations{" +
                "id='" + id + '\'' +
                ", userId=" + userId +
                ", conversationsId=" + conversationsId +
                ", joinedAt=" + joinedAt +
                ", isAdmin=" + isAdmin +
                '}';
    }
}

package com.example.MessengersProjectExample.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_contacts")
@Builder(toBuilder = true)
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;


    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Users contactId;

    @Column(name = "added_at")
    private LocalDateTime addedAt;

    @Override
    public String toString() {
        return "Contacts{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", contactId=" + contactId +
                ", addedAt=" + addedAt +
                '}';
    }
}

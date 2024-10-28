package com.example.MessengersProjectExample.Repository;

import com.example.MessengersProjectExample.Entity.Conversations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationsRepository extends JpaRepository<Conversations, String> {
}

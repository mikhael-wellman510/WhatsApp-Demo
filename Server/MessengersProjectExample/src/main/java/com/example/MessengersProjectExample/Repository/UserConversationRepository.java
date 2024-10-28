package com.example.MessengersProjectExample.Repository;

import com.example.MessengersProjectExample.Entity.UserConversations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserConversationRepository extends JpaRepository<UserConversations,String> {
}

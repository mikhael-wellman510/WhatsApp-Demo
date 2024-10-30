package com.example.MessengersProjectExample.Repository;

import com.example.MessengersProjectExample.Entity.UserConversations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserConversationRepository extends JpaRepository<UserConversations,String> {
}

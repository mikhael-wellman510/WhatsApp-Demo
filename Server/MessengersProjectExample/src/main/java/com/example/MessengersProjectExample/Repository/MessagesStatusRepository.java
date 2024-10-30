package com.example.MessengersProjectExample.Repository;

import com.example.MessengersProjectExample.Entity.MessageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesStatusRepository extends JpaRepository<MessageStatus,String> {
}

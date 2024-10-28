package com.example.MessengersProjectExample.Repository;

import com.example.MessengersProjectExample.Entity.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Messages, String> {
}

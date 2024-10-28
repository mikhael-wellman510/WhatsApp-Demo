package com.example.MessengersProjectExample.Repository;

import com.example.MessengersProjectExample.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,String> {
}

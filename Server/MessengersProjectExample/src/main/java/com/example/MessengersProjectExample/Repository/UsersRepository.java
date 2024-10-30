package com.example.MessengersProjectExample.Repository;

import com.example.MessengersProjectExample.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,String> {


    Users findByPhoneNumber(@Param("number") String number);
}

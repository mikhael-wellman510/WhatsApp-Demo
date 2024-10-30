package com.example.MessengersProjectExample.Repository;

import com.example.MessengersProjectExample.Entity.Contacts;
import com.example.MessengersProjectExample.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts,String> {

    @Query(value = "select u.id as id , u.phone_number as phoneNumber , u.username , u.last_seen as lastSeen , u.is_online as isOnline , u.created_at as createdAt from m_users as u where phone_number = :number ", nativeQuery = true)
    Users findByNumber(@Param("number") String number);
}

package com.example.MessengersProjectExample.Repository;

import com.example.MessengersProjectExample.Entity.Contacts;
import com.example.MessengersProjectExample.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts,String> {

    @Query(value = "select * from m_contacts where user_id = :id" , nativeQuery = true)
    List<Contacts> findAllById(@Param("id")String id);

}

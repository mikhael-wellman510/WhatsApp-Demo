package com.example.MessengersProjectExample.Repository;

import com.example.MessengersProjectExample.Entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts,String> {
}

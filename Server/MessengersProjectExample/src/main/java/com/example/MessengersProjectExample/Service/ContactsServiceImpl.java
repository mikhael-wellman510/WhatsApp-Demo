package com.example.MessengersProjectExample.Service;

import com.example.MessengersProjectExample.DTO.Request.ContactsRequest;
import com.example.MessengersProjectExample.DTO.Response.ContactsResponse;
import com.example.MessengersProjectExample.Entity.Contacts;
import com.example.MessengersProjectExample.Entity.Users;
import com.example.MessengersProjectExample.Repository.ContactsRepository;
import com.example.MessengersProjectExample.Repository.UsersRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ContactsServiceImpl implements ContactsService{

    private final ContactsRepository contactsRepository;
    private final UsersRepository usersRepository;
    @Override
    @Transactional
    public ContactsResponse addContact(ContactsRequest contactsRequest) {


        Users findNumber = usersRepository.findByPhoneNumber(contactsRequest.getNumber());
        Users myData = usersRepository.findById(contactsRequest.getUserId()).orElse(null);

        if (findNumber != null && myData != null){

            Contacts contacts = Contacts.builder()
                    .contactId(findNumber)
                    .userId(myData)
                    .addedAt(LocalDateTime.now())
                    .build();
            Contacts save = contactsRepository.save(contacts);

            return ContactsResponse.builder()
                    .id(save.getId())
                    .user(save.getUserId())
                    .contactsId(save.getContactId())
                    .build();

        }else {
            throw new  IllegalArgumentException("nomor tidak ditemukan");
        }


    }
}
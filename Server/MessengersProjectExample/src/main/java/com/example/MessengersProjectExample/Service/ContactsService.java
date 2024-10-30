package com.example.MessengersProjectExample.Service;

import com.example.MessengersProjectExample.DTO.Request.ContactsRequest;
import com.example.MessengersProjectExample.DTO.Response.ContactsResponse;

public interface ContactsService {
    ContactsResponse addContact(ContactsRequest contactsRequest);
}

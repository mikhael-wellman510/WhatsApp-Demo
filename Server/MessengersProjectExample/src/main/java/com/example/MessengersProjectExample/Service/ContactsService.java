package com.example.MessengersProjectExample.Service;

import com.example.MessengersProjectExample.DTO.Request.ContactsRequest;
import com.example.MessengersProjectExample.DTO.Response.ContactsResponse;

import java.util.List;

public interface ContactsService {
    ContactsResponse addContact(ContactsRequest contactsRequest);
    List<ContactsResponse> listContacts(String id);
}

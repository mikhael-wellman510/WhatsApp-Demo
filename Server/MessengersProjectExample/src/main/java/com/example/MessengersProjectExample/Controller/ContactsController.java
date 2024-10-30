package com.example.MessengersProjectExample.Controller;


import com.example.MessengersProjectExample.DTO.CommonResponse;
import com.example.MessengersProjectExample.DTO.Request.ContactsRequest;
import com.example.MessengersProjectExample.DTO.Response.ContactsResponse;
import com.example.MessengersProjectExample.Service.ContactsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contacts")
@CrossOrigin
public class ContactsController {
    private final ContactsService contactsService;

    @PostMapping("/addContact")
    ResponseEntity<?> addContacts(@RequestBody ContactsRequest contactsRequest){

        ContactsResponse contactsResponse = contactsService.addContact(contactsRequest);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<ContactsResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Sukses")
                        .data(contactsResponse)
                        .build()
                );
    }
}

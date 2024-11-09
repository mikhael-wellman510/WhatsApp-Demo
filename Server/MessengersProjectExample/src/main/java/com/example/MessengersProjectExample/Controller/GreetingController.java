package com.example.MessengersProjectExample.Controller;

import com.example.MessengersProjectExample.DAMI.Greeting;
import com.example.MessengersProjectExample.DAMI.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(@Payload  HelloMessage message) throws Exception{


        return new Greeting(message.getContent(), message.getName());

    }
}

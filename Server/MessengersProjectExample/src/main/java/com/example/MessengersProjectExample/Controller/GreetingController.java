package com.example.MessengersProjectExample.Controller;

import com.example.MessengersProjectExample.DAMI.Greeting;
import com.example.MessengersProjectExample.DAMI.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception{
        System.out.println("tes " + message.getName());


        return new Greeting("Hello " + message.getName());

    }
}

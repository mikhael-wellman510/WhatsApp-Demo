package com.example.MessengersProjectExample.Controller;

import com.example.MessengersProjectExample.DAMI.Greeting;
import com.example.MessengersProjectExample.DAMI.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage helloMessage) throws Exception{
        return new Greeting("Hello " + helloMessage.getName());
    }
}

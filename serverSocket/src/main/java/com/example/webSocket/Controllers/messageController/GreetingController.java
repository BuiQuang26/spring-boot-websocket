package com.example.webSocket.Controllers.messageController;

import com.example.webSocket.messageModel.Greeting;
import com.example.webSocket.messageModel.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        System.out.println(message);
        return new Greeting("Hello, " + message.getName() + " !");
    }

}

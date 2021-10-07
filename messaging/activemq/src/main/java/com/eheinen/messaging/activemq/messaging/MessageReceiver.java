package com.eheinen.messaging.activemq.messaging;

import com.eheinen.messaging.activemq.models.Dog;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }

    public void receiveMessage(Dog dog) {
        System.out.println("Received <" + dog.getName() + ">");
    }
}

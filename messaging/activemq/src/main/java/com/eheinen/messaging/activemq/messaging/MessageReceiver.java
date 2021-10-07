package com.eheinen.messaging.activemq.messaging;

import com.eheinen.messaging.activemq.models.Dog;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(destination = "${queues.dog.name}")
    public void messageListener(Dog dog) {
        System.out.println("Received <" + dog.getName() + ">");
    }

}

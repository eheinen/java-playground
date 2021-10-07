package com.eheinen.messaging.activemq.service;

import com.eheinen.messaging.activemq.messaging.MessageSender;
import com.eheinen.messaging.activemq.models.Dog;
import org.springframework.stereotype.Service;

@Service
public class DogService {

    private final MessageSender messageSender;

    public DogService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void createDog(Dog dog) {
        messageSender.send(dog);
    }
}

package com.eheinen.messaging.activemq.messaging;


import com.eheinen.messaging.activemq.models.Dog;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private static final Log LOG = LogFactory.getLog(MessageSender.class);

    @Value("${queues.dog.name}")
    private String queueName;
    
    private final JmsTemplate jmsTemplate;

    public MessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void send(Dog dog) {
        LOG.info("Sending message...");
        jmsTemplate.convertAndSend(queueName, dog);
    }
}

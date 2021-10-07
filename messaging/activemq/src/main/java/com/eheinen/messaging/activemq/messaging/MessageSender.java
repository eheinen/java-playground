package com.eheinen.messaging.activemq.messaging;


import com.eheinen.messaging.activemq.config.activemqConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private static final Log LOG = LogFactory.getLog(MessageSender.class);

    private final RabbitTemplate rabbitTemplate;
    
    private final activemqConfig activemqConfig;

    public MessageSender(RabbitTemplate rabbitTemplate, activemqConfig activemqConfig) {
        this.rabbitTemplate = rabbitTemplate;
        this.activemqConfig = activemqConfig;
    }

    public void send(Object object) {
        LOG.info("Sending message to " + activemqConfig.getQueueName());
        rabbitTemplate.convertAndSend(activemqConfig.getTopicName(), activemqConfig.getRoutingKey(), object);
    }
}

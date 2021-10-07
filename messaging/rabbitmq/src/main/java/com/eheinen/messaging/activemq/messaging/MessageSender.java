package com.eheinen.messaging.activemq.messaging;


import com.eheinen.messaging.activemq.config.RabbitMqConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private static final Log LOG = LogFactory.getLog(MessageSender.class);

    private final RabbitTemplate rabbitTemplate;
    
    private final RabbitMqConfig rabbitMqConfig;

    public MessageSender(RabbitTemplate rabbitTemplate, RabbitMqConfig rabbitMqConfig) {
        this.rabbitTemplate = rabbitTemplate;
        this.rabbitMqConfig = rabbitMqConfig;
    }

    public void send(Object object) {
        LOG.info("Sending message to " + rabbitMqConfig.getQueueName());
        rabbitTemplate.convertAndSend(rabbitMqConfig.getTopicName(), rabbitMqConfig.getRoutingKey(), object);
    }
}

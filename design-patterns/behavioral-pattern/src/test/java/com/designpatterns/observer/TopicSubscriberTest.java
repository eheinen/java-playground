package com.designpatterns.observer;

import com.designpatterns.decorator.topicsubscriber.Subscriber;
import com.designpatterns.decorator.topicsubscriber.Topic;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TopicSubscriberTest {

    private Topic topic = new Topic();
    private Subscriber momSubscriber = new Subscriber();
    private Subscriber fatherSubscriber = new Subscriber();
    private Subscriber sisterSubscriber = new Subscriber();
    private Subscriber wifeSubscriber = new Subscriber();

    private void registerObservers() {
        topic.register(momSubscriber);
        topic.register(fatherSubscriber);
        topic.register(sisterSubscriber);
        topic.register(wifeSubscriber);

        momSubscriber.setSubject(topic);
        fatherSubscriber.setSubject(topic);
        sisterSubscriber.setSubject(topic);
        wifeSubscriber.setSubject(topic);
    }

    @Test
    public void lastMessage_asNull_whenNoneMessageWasSent() {
        registerObservers();

        assertEquals("", momSubscriber.getLastMessage());
        assertEquals("", fatherSubscriber.getLastMessage());
        assertEquals("", sisterSubscriber.getLastMessage());
        assertEquals("", wifeSubscriber.getLastMessage());
    }

    @Test
    public void lastMessage_whenMessageWasSent() {
        registerObservers();

        topic.postMessage("Hello World!");

        assertEquals("Hello World!", momSubscriber.getLastMessage());
        assertEquals("Hello World!", fatherSubscriber.getLastMessage());
        assertEquals("Hello World!", sisterSubscriber.getLastMessage());
        assertEquals("Hello World!", wifeSubscriber.getLastMessage());
    }

    @Test
    public void emptyMessages_whenNoneMessageWasSent() {
        registerObservers();

        assertTrue(momSubscriber.getMessages().isEmpty());
        assertTrue(fatherSubscriber.getMessages().isEmpty());
        assertTrue(sisterSubscriber.getMessages().isEmpty());
        assertTrue(wifeSubscriber.getMessages().isEmpty());
    }

    @Test
    public void messages_whenMessageWasSent() {
        registerObservers();

        topic.postMessage("Hi Mom!");
        topic.postMessage("Hi Father!");
        topic.postMessage("Hi Sister!");
        topic.postMessage("Hi Love!");

        List<String> messages = Arrays.asList("Hi Mom!", "Hi Father!", "Hi Sister!", "Hi Love!");

        assertEquals(messages, momSubscriber.getMessages());
        assertEquals(messages, fatherSubscriber.getMessages());
        assertEquals(messages, sisterSubscriber.getMessages());
        assertEquals(messages, wifeSubscriber.getMessages());
    }

    @Test
    public void unregisterObservers() {
        registerObservers();
        topic.unregister(fatherSubscriber);

        topic.postMessage("Hello World!");

        assertEquals("Hello World!", momSubscriber.getLastMessage());
        assertEquals("Hello World!", sisterSubscriber.getLastMessage());
        assertEquals("Hello World!", wifeSubscriber.getLastMessage());

        assertTrue(fatherSubscriber.getMessages().isEmpty());
    }

    @Test
    public void clearMessages() {
        registerObservers();

        topic.postMessage("Hello World!");
        topic.clearMessages();

        assertTrue(fatherSubscriber.getMessages().isEmpty());
    }
}

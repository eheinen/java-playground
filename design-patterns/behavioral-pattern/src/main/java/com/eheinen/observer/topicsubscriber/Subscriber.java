package com.eheinen.decorator.topicsubscriber;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements TopicObserver {

    private Topic topic;

    private List<String> messages = new ArrayList<>();

    @Override
    public void update() {
        messages = topic.getMessages();
    }

    @Override
    public List<String> getMessages() {
        return messages;
    }

    @Override
    public String getLastMessage() {
        if (messages.isEmpty()) return "";
        return messages.get(messages.size() - 1);
    }

    @Override
    public void setSubject(TopicSubject topic) {
        this.topic = (Topic) topic;
    }
}

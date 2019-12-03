package com.eheinen.decorator.topicsubscriber;

import java.util.List;

public interface TopicObserver {

    void update();

    List<String> getMessages();

    String getLastMessage();

    void setSubject(TopicSubject topic);

}

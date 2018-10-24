package com.designpatterns.topicsubscriber;

public interface TopicSubject {

    void register(TopicObserver observer);

    void unregister(TopicObserver observer);

    void notifyObservers();

}

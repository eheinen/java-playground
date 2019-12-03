package com.eheinen.decorator.topicsubscriber;

import java.util.ArrayList;
import java.util.List;

public class Topic implements TopicSubject {

    private List<TopicObserver> observers = new ArrayList<>();
    private List<String> messages = new ArrayList<>();

    @Override
    public void register(TopicObserver observer) {
        checkNullObserver(observer);

        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(TopicObserver observer) {
        checkNullObserver(observer);

        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (messages.isEmpty()) return;

        for (TopicObserver observer : observers) {
            observer.update();
        }
    }

    public void clearMessages() {
        messages.clear();
    }

    public List<String> getMessages() {
        return messages;
    }

    public void postMessage(String message) {
        this.messages.add(message);
        notifyObservers();
    }

    private void checkNullObserver(TopicObserver observer) {
        if (observer == null) throw new NullPointerException("Null Observer");
    }

}

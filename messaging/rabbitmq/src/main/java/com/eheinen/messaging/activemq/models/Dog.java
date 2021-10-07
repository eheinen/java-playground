package com.eheinen.messaging.activemq.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dog implements Serializable {
    
    private String name;
    private int age;
}

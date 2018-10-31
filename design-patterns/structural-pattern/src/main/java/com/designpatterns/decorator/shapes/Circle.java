package com.designpatterns.decorator.shapes;

public class Circle implements Shape {

    @Override
    public String draw() {
        return "Circle Drawn";
    }

    @Override
    public String resize() {
        return "Circle Resized";
    }

}

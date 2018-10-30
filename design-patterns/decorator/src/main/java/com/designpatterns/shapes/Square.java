package com.designpatterns.shapes;

public class Square implements Shape {

    @Override
    public String draw() {
        return "Square Drawn";
    }

    @Override
    public String resize() {
        return "Square Resized";
    }

}

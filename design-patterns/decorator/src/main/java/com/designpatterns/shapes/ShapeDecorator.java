package com.designpatterns.shapes;

public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        super();
        this.shape = shape;
    }

    @Override
    public String draw() {
        return shape.draw();
    }

    @Override
    public String resize() {
        return shape.resize();
    }
}

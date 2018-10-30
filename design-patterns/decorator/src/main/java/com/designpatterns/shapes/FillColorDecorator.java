package com.designpatterns.shapes;

public class FillColorDecorator extends ShapeDecorator {

    protected Color color;

    public FillColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public String draw() {
        return shape.draw().concat(" - color: " + this.color);
    }

    @Override
    public String resize() {
        return shape.resize();
    }
}

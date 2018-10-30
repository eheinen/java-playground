package com.designpatterns.shapes;

public class LineColorDecorator extends ShapeDecorator {

    protected Color color;

    public LineColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public String draw() {
        return shape.draw().concat(" - line color: " + this.color);
    }

    @Override
    public String resize() {
        return shape.resize();
    }
}

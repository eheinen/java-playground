package com.designpatterns.decorator.shapes;

public class LineStyleDecorator extends ShapeDecorator {

    protected LineStyle lineStyle;

    public LineStyleDecorator(Shape shape, LineStyle lineStyle) {
        super(shape);
        this.lineStyle = lineStyle;
    }

    @Override
    public String draw() {
        return shape.draw().concat(" - line style: " + this.lineStyle);
    }

    @Override
    public String resize() {
        return shape.resize();
    }
}

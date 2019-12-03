package com.eheinen.decorator.shapes;

public class LineThicknessDecorator extends ShapeDecorator {

    protected LineStyle lineStyle;

    public LineThicknessDecorator(Shape shape, LineStyle lineStyle) {
        super(shape);
        this.lineStyle = lineStyle;
    }

    @Override
    public String draw() {
        return shape.draw().concat(" - line thickness: " + this.lineStyle);
    }

    @Override
    public String resize() {
        return shape.resize();
    }
}

package com.eheinen.factorypattern.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    private ShapeFactory shapeFactory = new ShapeFactory();
    private Shape shape;

    @Test
    public void checkCircle() {
        shape = shapeFactory.getShape(ShapeType.CIRCLE);
        String actualShape = shape.draw();

        assertEquals("Circle", actualShape);
    }

    @Test
    public void checkSquare() {
        shape = shapeFactory.getShape(ShapeType.SQUARE);
        String actualShape = shape.draw();

        assertEquals("Square", actualShape);
    }

    @Test
    public void checkRectangle() {
        shape = shapeFactory.getShape(ShapeType.RECTANGLE);
        String actualShape = shape.draw();

        assertEquals("Rectangle", actualShape);
    }
}

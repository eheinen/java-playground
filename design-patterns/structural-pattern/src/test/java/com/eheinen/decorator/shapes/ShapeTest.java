package com.eheinen.decorator.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShapeTest {

    private Shape circleShape = new Circle();
    private Shape squareShape = new Square();

    @Test
    public void drawCircle() {
        assertEquals("Circle Drawn", circleShape.draw());
        assertEquals("Circle Resized", circleShape.resize());
    }

    @Test
    public void drawSquare() {
        assertEquals("Square Drawn", squareShape.draw());
        assertEquals("Square Resized", squareShape.resize());
    }

    @Test
    public void drawCircle_addFillColor() {
        circleShape = new FillColorDecorator(circleShape, Color.BLUE);
        assertEquals("Circle Drawn - color: " + Color.BLUE, circleShape.draw());
    }

    @Test
    public void drawCircle_addLineColor() {
        circleShape = new LineColorDecorator(circleShape, Color.GREEN);
        assertEquals("Circle Drawn - line color: " + Color.GREEN, circleShape.draw());
    }

    @Test
    public void drawCircle_addLineThickness() {
        circleShape = new LineThicknessDecorator(circleShape, LineStyle.DASH);
        assertEquals("Circle Drawn - line thickness: " + LineStyle.DASH, circleShape.draw());
    }

    @Test
    public void drawCircle_addLineStyle() {
        circleShape = new LineStyleDecorator(circleShape, LineStyle.DOT);
        assertEquals("Circle Drawn - line style: " + LineStyle.DOT, circleShape.draw());
    }

    @Test
    public void drawCircle_addLineStyle_fillColor_lineColor() {
        circleShape = new LineStyleDecorator(circleShape, LineStyle.DOT);
        circleShape = new FillColorDecorator(circleShape, Color.RED);
        circleShape = new LineColorDecorator(circleShape, Color.GREEN);

        String expected = "Circle Drawn - line style: " + LineStyle.DOT + " - color: " + Color.RED + " - line color: " + Color.GREEN;
        assertEquals(expected, circleShape.draw());
    }

}

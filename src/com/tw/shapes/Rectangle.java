package com.tw.shapes;

public class Rectangle implements ClosedShapes {
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int area() {
        return  this.length * this.breadth;
    }

    @Override
    public int perimeter() {
        return 2 * (length + breadth);
    }
}

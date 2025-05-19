package com.tw.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void calculatesAreaOfSquare() {
        final Square sq = new Square(4);
        assertEquals(16, sq.area());
    }

    @Test
    void calculatesAreaOfSquareWithSidesZero() {
        final Square square = new Square(0);
        assertEquals(0, square.area());
    }

    @Test
    void calculatesPerimeterOfSquare() {
        final Square sq = new Square(2);
        assertEquals(8, sq.perimeter());
    }

    @Test
    void calculatesPerimeterOfSquareWithSidesZero() {
        final Square square = new Square(0);
        assertEquals(0, square.perimeter());

    }
}
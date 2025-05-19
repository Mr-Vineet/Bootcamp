package com.tw.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void CalculatesAreaOfSquare() {
        final Square sq = new Square(4);
        assertEquals(16, sq.area());
    }

    @Test
    void calculatesPerimeterOfSquare() {
        final Square sq = new Square(2);
        assertEquals(8, sq.perimeter());
    }
}
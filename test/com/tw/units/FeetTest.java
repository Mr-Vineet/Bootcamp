package com.tw.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {
    @Test
    void shouldCompareFeetWithFeet() {
        final Feet fiveFeet = new Feet(5);
        assertTrue(fiveFeet.isEqual(new Feet(5)));
    }

    @Test
    void shouldReturnFalseIfComparingDifferentFeet() {
        final Feet fiveFeet = new Feet(5);
        assertFalse(fiveFeet.isEqual(new Feet(6)));
    }

    @Test
    void shouldCompareFeetWithInch() {
        final Feet oneFeet = new Feet(1);
        assertTrue(oneFeet.isEqual(new Inch(12)));
    }
}
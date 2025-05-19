package com.tw.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {
    @Test
    void shouldBeEqualIfComparingEqualInch() {
        final Inch fiveInch = new Inch(5);
        assertTrue(fiveInch.isEqual(new Inch(5)));
    }

    @Test
    void shouldBeEqualIfComparingEquivalentInchWithFeet() {
        final Inch twelveInch = new Inch(12);
        assertTrue(twelveInch.isEqual(new Feet(1)));
    }

    @Test
    void shouldBeEqualIfComparingEquivalentInchWithCentimeter() {
        final Inch twoInch = new Inch(2);
        assertTrue(twoInch.isEqual(new Centimeter(5)));
    }
}
package com.tw.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    void shouldBeEqualForEquivalentCmAndMm() {
        final Centimeter cm = new Centimeter(1);
        assertTrue(cm.isEqual(new Millimeter(10)));
    }

    @Test
    void shouldBeEqualForEquivalentCmAndInch() {
        final Centimeter fiveCm = new Centimeter(5);
        assertTrue(fiveCm.isEqual(new Inch(2)));
    }
}
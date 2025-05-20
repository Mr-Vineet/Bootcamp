package com.tw.length;

import com.tw.InvalidValueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void oneInchShouldEqualsToOneInch() throws InvalidValueException {
        assertEquals(Length.createLength(1, LengthUnits.INCH), Length.createLength(1, LengthUnits.INCH));
    }

    @Test
    void twelveInchShouldEqualsToOneFeet() throws InvalidValueException {
        assertEquals(Length.createLength(12, LengthUnits.INCH), Length.createLength(1, LengthUnits.FEET));
    }

    @Test
    void addingTwoInchWithTwoAndHalfCmWillGetFourInch() throws InvalidValueException {
        Length twoInches = Length.createLength(2, LengthUnits.INCH);
        Length twoAndHalfCm = Length.createLength(2.5, LengthUnits.CM);
        Length threeInch = Length.createLength(3, LengthUnits.INCH);
        assertEquals(threeInch, twoInches.add(twoAndHalfCm));
    }
}
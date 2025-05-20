package com.tw.volume;

import com.tw.InvalidValueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void oneGallonShouldBeEqualsToThreePointSevenEightLiters() throws InvalidValueException {
        assertEquals(Volume.gallons(1), Volume.liters(3.78));
    }

    @Test
    void oneLiteShouldBeEqualsToOneByThreePointSevenEightGallon() throws InvalidValueException {
        assertEquals(Volume.liters(1), Volume.gallons(1 / 3.78));
    }

    @Test
    void shouldThrowExceptionForNegativeValues() {
        assertThrows(InvalidValueException.class, () -> Volume.liters(-1));
    }
}
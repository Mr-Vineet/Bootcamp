package com.tw.units;

public class Feet {
    private final int value;

    public Feet(int value) {
        this.value = value;
    }

    public boolean isEqual(Feet feet) {
        return value == feet.value;
    }

    public boolean isEqual(Inch inches) {
        return value == inches.toFeet().value;
    }

    public Inch toInches() {
        return new Inch(value * 12);
    }
}

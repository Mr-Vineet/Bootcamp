package com.tw.units;

public class Inch {

    private final int value;

    public Inch(int value) {
        this.value = value;
    }

    public Feet toFeet() {
        return new Feet(value / 12);
    }

    public Centimeter toCentimeter() {
        return new Centimeter(value * 5 / 2);
    }

    public boolean isEqual(Inch inch) {
        return value == inch.value;
    }

    public boolean isEqual(Centimeter cm) {
        return value == cm.toInch().value;
    }

    public boolean isEqual(Feet feet) {
        return value == feet.toInches().value;
    }
}

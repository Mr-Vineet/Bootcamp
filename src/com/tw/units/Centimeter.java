package com.tw.units;

public class Centimeter {
    private final int value;

    public Centimeter(int value) {
        this.value = value;
    }

    public Inch toInch() {
        return new Inch(value * 2 / 5);
    }

    public boolean isEqual(Inch inch) {
        return value == inch.toCentimeter().value;
    }

    public boolean isEqual(Millimeter millimeter) {
        return value == millimeter.toCentimeter().value;
    }
}

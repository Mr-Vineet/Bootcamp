package com.tw.units;

public class Millimeter {
    private final int value;

    public Millimeter(int value) {
        this.value = value;
    }

    public Centimeter toCentimeter() {
        return new Centimeter(value / 10);
    }
}

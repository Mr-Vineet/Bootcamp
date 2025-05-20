package com.tw.length;

public enum LengthUnits {
    INCH(1),
    FEET(12),
    CM(0.4),
    MM(0.04);

    private final double factor;

    LengthUnits(double factor) {
        this.factor = factor;
    }

    public double toBase(double value) {
        return value * factor;
    }
}

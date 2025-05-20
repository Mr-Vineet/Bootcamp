package com.tw.length;

import com.tw.InvalidValueException;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnits unit;

    private Length(double value, LengthUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length createLength(double value, LengthUnits unit) throws InvalidValueException {
        if (value < 0) throw new InvalidValueException();
        return new Length(value, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return Math.abs(this.unit.toBase(this.value) - that.unit.toBase(that.value)) < 0.001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    public Length add(Length length) throws InvalidValueException {
        return Length.createLength(this.unit.toBase(this.value) + length.unit.toBase(length.value), LengthUnits.INCH);
    }
}

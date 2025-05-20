package com.tw.volume;

import com.tw.InvalidValueException;

import java.util.Objects;

public class Volume {
    private final double value;

    public Volume(double value) {
        this.value = value;
    }

    private static Volume getVolume(double value, double factor) throws InvalidValueException {
        if (value < 0) {
            throw new InvalidValueException();
        }
        return new Volume(value * factor);
    }

    public static Volume gallons(double value) throws InvalidValueException {
        return getVolume(value, 3.78);
    }


    public static Volume liters(double value) throws InvalidValueException {
        return getVolume(value, 1);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Math.abs(value - volume.value) < 0.001;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}

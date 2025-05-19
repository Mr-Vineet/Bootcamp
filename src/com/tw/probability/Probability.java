package com.tw.probability;

import java.util.Objects;

public class Probability {

    private final double value;

    private Probability(double value) {
        this.value = value;
    }

    public static Probability calculateProbability(double sampleCount, double occurrence) throws Exception {
        if (occurrence < 0 || sampleCount < 0) {
            throw new Exception("Occurrence or sample count can't be lesser than zero!");
        }

        if (occurrence > sampleCount) {
            throw new Exception("Occurrence can't be greater than sample count!");
        }

        return new Probability(occurrence / sampleCount);
    }

    public static Probability createProbability(double value) throws Exception {
        if (value < 0 || value > 1) {
            throw new Exception("Probability should be between 0 and 1");
        }

        return new Probability(value);
    }

    public Probability compliment() throws Exception {
        return Probability.createProbability(1 - this.value);
    }

    public Probability and(Probability p) throws Exception {
        return Probability.createProbability(p.value * value);
    }

    public Probability or(Probability p) throws Exception {
        return Probability.createProbability(value + p.value - this.and(p).value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Math.abs(value-that.value) < 0.01;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}

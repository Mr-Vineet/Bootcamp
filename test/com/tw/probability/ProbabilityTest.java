package com.tw.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProbabilityTest {
    @Test
    void shouldReturnProbabilityOfGettingTails() throws Exception {
        final Probability probability = Probability.calculateProbability(2, 1);

        assertEquals(Probability.createProbability(0.5), probability);
    }

    @Test
    void shouldReturnProbabilityOfNotGettingTails() throws Exception {
        final Probability probability = Probability.calculateProbability(3, 2);

        assertEquals(Probability.createProbability(0.333), probability.compliment());
    }

    @Test
    void shouldThrowExceptionWhenOccurrenceOrSampleCountIsInvalid() {
        final Exception exception = assertThrows(Exception.class, () -> Probability.calculateProbability(-1, 0));

        assertEquals("Occurrence or sample count can't be lesser than zero!", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenOccurrenceIsGreaterThanSampleCount() {
        final Exception exception = assertThrows(Exception.class, () -> Probability.calculateProbability(5, 10));

        assertEquals("Occurrence can't be greater than sample count!", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenProbabilityIsNegative() {
        final Exception exception = assertThrows(Exception.class, () -> Probability.createProbability(-0.4));

        assertEquals("Probability should be between 0 and 1", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenProbabilityIsGreaterThanOne() {
        final Exception exception = assertThrows(Exception.class, () -> Probability.createProbability(2));

        assertEquals("Probability should be between 0 and 1", exception.getMessage());
    }

    @Test
    void shouldAndTwoProbabilities() throws Exception {
        final Probability p1 = Probability.createProbability(0.2);
        final Probability p2 = Probability.createProbability(0.3);

        assertEquals(Probability.createProbability(0.06), p1.and(p2));
    }

    @Test
    void shouldReturnTheProbabilityForGettingTailsWhenTwoCoinsAreFlipped() throws Exception {
        final Probability p1 = Probability.calculateProbability(2, 1);
        final Probability p2 = Probability.calculateProbability(2, 1);

        assertEquals(Probability.createProbability(0.25), p1.and(p2));
    }

    @Test
    void shouldOrTwoProbabilities() throws Exception {
        final Probability p1 = Probability.createProbability(0.5);
        final Probability p2 = Probability.createProbability(0.5);

        assertEquals(Probability.createProbability(0.75), p1.or(p2));
    }

    @Test
    void shouldReturnTheProbabilityForGettingAtLeastOneTailWhenTwoCoinsAreFlipped() throws Exception {
        final Probability probabilityOfTailsForFirstCoin = Probability.calculateProbability(2, 1);
        final Probability probabilityOfTailsForSecondCoin = Probability.calculateProbability(2, 1);

        assertEquals(Probability.createProbability(0.75), probabilityOfTailsForFirstCoin.or(probabilityOfTailsForSecondCoin));
    }

    @Test
    void shouldGiveOrTwoProbabilities() throws Exception {
        final Probability p1 = Probability.createProbability(0.25);
        final Probability p2 = Probability.createProbability(0.1);

        assertEquals(Probability.createProbability(0.325), p1.or(p2));
    }
}
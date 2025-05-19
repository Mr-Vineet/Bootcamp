package com.tw.probability;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void TestingChancesOfGettingTail() {
        List<String> outcomes = new ArrayList<>();
        outcomes.add("Head");
        outcomes.add("Tail");
        assertEquals(0.5, Probability.favour(outcomes, "Tail"));
    }

    @Test
    void TestingChancesOfNotGettingTail() {
        List<String> outcomes = new ArrayList<>();
        outcomes.add("Head");
        outcomes.add("Tail");
        assertEquals(0.5, Probability.disFavour(outcomes, "Tail"));
    }
}
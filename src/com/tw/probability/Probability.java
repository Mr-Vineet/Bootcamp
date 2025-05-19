package com.tw.probability;

import java.util.List;

public class Probability {

    public static double favour(List<String> outcomes, String target) {
        int appeared = Probability.occurrences(outcomes, target);
        return (double) appeared / outcomes.size();
    }

    public static double disFavour(List<String> outcomes, String target) {
        return 1 - Probability.favour(outcomes, target);
    }

    private static int occurrences(List<String> outcomes, String target) {
        int occurred = 0;
        for (String outcome : outcomes) {
            if (outcome.equals(target)) {
                occurred++;
            }
        }
        return occurred;
    }

}

package com.exercismcode.exercismcode.lasagna;

public class Lasagna {
    int expectedMinutesInOvenV = 40;

    public int expectedMinutesInOven() {
        return expectedMinutesInOvenV;
    }

    public int remainingMinutesInOven(int remainingMinutes) {
        return expectedMinutesInOven() - remainingMinutes;
    }


    public int preparationTimeInMinutes(int layer) {
        return layer * 2;
    }
    public int totalTimeInMinutes(int layer, int minutesInOven) {
        return minutesInOven + preparationTimeInMinutes(layer);
    }
}

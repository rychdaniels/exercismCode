package com.exercismcode.exercismcode.birdWatcher;

import java.util.Arrays;

public class BirdWatcher {

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    public int[] getLastWeek() {
        return this.birdsPerDay;
    }
    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length-1];
    }
    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length-1] += 1;
    }
    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay)
                .filter(n -> n == 0)
                .toArray()
                .length > 0;
    }
    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(birdsPerDay)
                .limit(numberOfDays)
                .reduce(0, (subtotal, element) -> subtotal + element);
    }
    public int getBusyDays() {
        return Arrays.stream(birdsPerDay)
                .filter(n -> n >= 5)
                .toArray()
                .length;
    }
}

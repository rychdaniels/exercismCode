package com.exercismcode.exercismcode.captainslog;

import java.util.Random;

public class CaptainsLog {
    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    private final double MIN_STARDATE = 41000.0d;

    private Random random;

    public CaptainsLog(Random random) {
        this.random = random;
    }

    public char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    public String randomShipRegistryNumber() {

        return String.format("NCC-%d", 1000 + random.nextInt(9000));
    }

    public double randomStardate() {
        double valueRange = MIN_STARDATE + 1000.0 * random.nextDouble();;
        return valueRange ;
    }
}

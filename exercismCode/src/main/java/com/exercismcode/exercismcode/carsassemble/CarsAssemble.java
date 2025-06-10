package com.exercismcode.exercismcode.carsassemble;

public class CarsAssemble {
    public double carsPerHour = 221;

    public double productionRatePerHour(int speed) {

        if(speed >= 1 && speed <= 4) {
            return speed * carsPerHour;
        } else if(speed >= 5 && speed <= 8) {
            return speed * carsPerHour * 0.90;
        } else if(speed == 9) {
            return speed * carsPerHour * 0.80;
        } else {
            return speed * carsPerHour * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}

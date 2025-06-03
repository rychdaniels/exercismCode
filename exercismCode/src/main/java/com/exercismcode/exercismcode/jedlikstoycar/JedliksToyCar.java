package com.exercismcode.exercismcode.jedlikstoycar;

public class JedliksToyCar {
    private int distance = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " +  this.distance + " meters";
    }

    public String batteryDisplay() {
        if (battery <= 0) {
            return "Battery empty";
        } else {

            return "Battery at " + this.battery + "%";
        }
    }

    public void drive() {
        if(this.battery > 0) {
            this.battery -= 1;
            this.distance += 20;
        }
    }
}

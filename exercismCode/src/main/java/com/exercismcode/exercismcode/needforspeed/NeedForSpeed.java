package com.exercismcode.exercismcode.needforspeed;

public class NeedForSpeed {
    private int battery = 100;
    private int distanceDrived = 0;
    private int speed;
    private int batteryDrain;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDrived;
    }

    public void drive() {
        if(!batteryDrained()){
            this.distanceDrived += speed;
            this.battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

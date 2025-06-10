package com.exercismcode.exercismcode.experimentalremotecontrolcar;

public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distancia = 0;

    public void drive() {
        this.distancia += 10;
    }

    public int getDistanceTravelled() {
        return this.distancia;
    }
}

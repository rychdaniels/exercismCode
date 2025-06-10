package com.exercismcode.exercismcode.experimentalremotecontrolcar;

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distancia = 0;
    private int numberOfVictories = 0;


    public void drive() {
        this.distancia += 10;
    }

    public int getDistanceTravelled() {
        return this.distancia;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        return Integer.compare(car.getNumberOfVictories(), getNumberOfVictories());
    }


}

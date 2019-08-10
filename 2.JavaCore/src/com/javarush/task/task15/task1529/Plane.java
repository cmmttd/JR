package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    private int passengers;

    public Plane(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers(){
        return this.passengers;
    }

    @Override
    public void fly() {

    }
}

package com.solvd.lab2.Car;

public class Vehicle {
    protected String model;
    protected int maxSpeed;
    protected boolean isMoving;

    //constructor con un parametro
    Vehicle(boolean isMoving){
        this.isMoving = isMoving;
    }

    //getter
    public String getModel() {
        return model;
    }
    //getter
    public int getMaxSpeed() {
        return maxSpeed;
    }
    //setter
    public boolean isMoving() {
        return isMoving;
    }

    public void drive(){
        System.out.println("Vehicle is driving");
    }
    public void drive(int speed){
        System.out.println("Vehicle is driving at speed "+ speed);
    }

    //setter
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void start(){

    }
}

package com.solvd.Homework.Computer;

import java.util.Objects;

public class Computer {
    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", operativeSystem='" + operativeSystem + '\'' +
                ", screenSize=" + screenSize +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return screenSize == computer.screenSize && isTurnedOn == computer.isTurnedOn && brand.equals(computer.brand) && operativeSystem.equals(computer.operativeSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, operativeSystem, screenSize, isTurnedOn);
    }

    //Attributes
    protected String brand;
    protected String operativeSystem;
    protected int screenSize;
    protected boolean isTurnedOn;


    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getOperativeSystem() {
        return operativeSystem;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    //constructor with parameter
    Computer(boolean isTurnedOn){
        this.isTurnedOn = isTurnedOn;
        this.toString();
    }

    //Methods
    public void connectToInternet() {
        System.out.println("Computer is connected to the internet");
    }
    public void connectToInternet(int speed) {
        System.out.println("Computer is connected to the internet at " + speed + "mps");
    }
    public void disconnectFromInternet() {
        System.out.println("Disconnected from the internet");
    }
    public void turnOff(){
        System.out.println("Turning off computer...");

        }


}


package com.solvd.lab3;

import java.util.Objects;

public abstract class Computer implements ICalculator, IStoreFiles, IIDE, ISearchEngine, IPhotoshop {

    //Attributes
    protected String brand;
    protected String operativeSystem;
    protected int screenSize;
    protected boolean isTurnedOn;

    public Computer(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
        this.brand = brand;
        this.operativeSystem = getOperativeSystem();
        this.screenSize = getScreenSize();

    }

    private int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }


    public String getOperativeSystem() {
        return operativeSystem;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
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
    abstract void createFile();
    abstract void deleteFile();
}


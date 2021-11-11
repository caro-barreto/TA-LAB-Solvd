package com.solvd.Homework.Computer;

public class Laptop extends Computer {

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    private String processor;

    @Override
    public void setScreenSize(int screenSize) {
        super.setScreenSize(screenSize);
    }


    @Override
    public String getOperativeSystem() {
        return super.getOperativeSystem();
    }

    @Override
    public boolean isTurnedOn() {
        return super.isTurnedOn();
    }

    @Override
    public void connectToInternet(int speed) {
        super.connectToInternet(speed);
    }

    @Override
    public void disconnectFromInternet() {
        super.disconnectFromInternet();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Laptop(boolean isTurnedOn, String intel_i7) {
        super(isTurnedOn);
    }

    public void connectToInternet() {
        System.out.println("Laptop is connected to the internet");
    }
}

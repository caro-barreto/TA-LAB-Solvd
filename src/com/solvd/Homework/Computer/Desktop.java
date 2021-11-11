package com.solvd.Homework.Computer;

public class Desktop extends Computer {


    public Desktop(boolean isTurnedOn) {
        super (isTurnedOn);
            }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    private String graphics;


    @Override
    public void setScreenSize(int screenSize) {
        super.setScreenSize(screenSize);
    }

    @Override
    public boolean isTurnedOn() {
        return super.isTurnedOn();
    }

    @Override
    public void connectToInternet() {
        super.connectToInternet();
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
}

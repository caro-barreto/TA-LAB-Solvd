package Homework.Computer;

public class Computer {
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

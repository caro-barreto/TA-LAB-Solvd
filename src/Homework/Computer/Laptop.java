package Homework.Computer;

public class Laptop extends Computer {
    public Laptop(boolean isTurnedOn) {
        super(isTurnedOn);
        brand = "Apple";
        operativeSystem = "Linux";
        screenSize = 13;

    }

    public void connectToInternet() {
        System.out.println("Laptop is connected to the internet");
    }
}

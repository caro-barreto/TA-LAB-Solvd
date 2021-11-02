package Homework.Runner;

import Homework.Computer.Desktop;
import Homework.Computer.Laptop;

public class Runner {
    public static void main(String[] args) {

        Desktop desktop = new Desktop(true);
        desktop.setScreenSize(21);
        desktop.getBrand();
        System.out.println("This is a " + desktop.getBrand());
        desktop.connectToInternet();
        desktop.connectToInternet(200);
        System.out.println("------------------");

        Laptop laptop = new Laptop(true);
        laptop.setScreenSize(15);
        laptop.connectToInternet();
        laptop.disconnectFromInternet();
        laptop.turnOff();


    }
}

package Homework.Runner;

import Homework.Computer.Desktop;
import Homework.Computer.Laptop;

public class Runner {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

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

        System.out.println();
        Laptop laptop1 = new Laptop(true);
        laptop1.setScreenSize(14);
        laptop1.connectToInternet();

        System.out.println("Laptop");
        System.out.println(laptop.toString());
        System.out.println("Laptop1");
        System.out.println(laptop1.toString());

        System.out.println("Is laptop the same as laptop1? ");
        boolean answerLaptop = laptop1.equals(laptop);
        System.out.println(answerLaptop);
        System.out.println();



    }
}

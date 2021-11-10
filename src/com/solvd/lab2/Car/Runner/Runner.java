package com.solvd.lab2.Car.Runner;
import com.solvd.lab2.Car.Car.Car;
import com.solvd.lab2.Car.Car.Bicycle;

//si queres trabajar con otra clase en tu proyecto tenes que importarla

public class Runner {

    public static void main(String[] args) {
       // com.solvd.lab2.Car.Car.Car.Car car = new com.solvd.lab2.Car.Car.Car.Car("Toyota");
        Car car = new Car(true);
        System.out.println("Model: " + car.getModel());
        System.out.println("Max speed: " + car.getMaxSpeed());
        car.drive();
        System.out.println("-----------------------");

        Bicycle bicycle = new Bicycle(false);
        bicycle.setMaxSpeed(15);
        System.out.println("Max speed: " + bicycle.getMaxSpeed());
        bicycle.drive();
        bicycle.drive(100);
    }
}


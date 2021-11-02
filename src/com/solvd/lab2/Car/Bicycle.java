package com.solvd.lab2.Car;

public class Bicycle extends Vehicle {
    public Bicycle(boolean isMoving) {
        super(isMoving);
    }
    public void drive() {
        System.out.println("Bicycle is driving");
    }
    //si no agrego este, al pasarle parametros va a usar el de la clase padre, acá lo overriteé
    public void drive(int speed){
        System.out.println("Bicycle is driving at speed "+ speed);
    }
}

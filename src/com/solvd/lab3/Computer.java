package com.solvd.lab3;

import javax.swing.*;
import java.io.File;
import java.util.Objects;
import java.util.Scanner;


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

    public void setScreenSize(int screenSize) throws CustomException {
        if (screenSize <= 12) {
            throw new CustomException();
        }
        this.screenSize = screenSize;
    }




    public String getOperativeSystem() {

        return operativeSystem;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }


    public void connectToInternet() {
        System.out.println("Computer is connected to the internet");
    }

    public void connectToInternet(int speed) {

        System.out.println("Computer is connected to the internet at " + speed + "mps");
    }


    public int makeSumofNegativeNumbers(int a, int b) throws CustomException {
       if (a >= 0 || b >= 0) {
        throw new CustomException();
       }
        return a + b;
    }



    public String checkIfWindows() throws CustomException {
        if (this.operativeSystem != "Windows") {
            throw new CustomException();
        }
        return "Operative system is Windows";
    }


    public void disconnectFromInternet() {
        System.out.println("Disconnected from the internet");
    }

    public void turnOff() {
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

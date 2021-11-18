package com.solvd.lab3;

import com.solvd.lab4.LinuxException;
import com.solvd.lab4.UnderAgeException;
import com.solvd.lab4.WindowsException;
import com.solvd.lab4.WrongScreenSize;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;



public abstract class Computer implements ICalculator, IStoreFiles, IIDE, ISearchEngine, IPhotoshop {



    public static Logger LOGGER = Logger.getLogger(Computer.class.getName());
    public FileHandler fh;


    {
        try{
            fh = new FileHandler("src/com/solvd/lab4/Logs.txt", true);
            LOGGER.addHandler(fh);
            LOGGER.setLevel(Level.ALL);

        } catch (IOException ex){
            ex.printStackTrace();        }
    }


    //Attributes
    protected String brand;
    protected String operativeSystem;
    protected int screenSize;
    protected boolean isTurnedOn;

    public Computer(boolean isTurnedOn) throws CustomException {
        this.isTurnedOn = isTurnedOn;
        this.brand = brand;
        this.operativeSystem = getOperativeSystem();
        this.screenSize = getScreenSize();
        LOGGER.log(Level.INFO, "Object computer");

    }

    private int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) throws WrongScreenSize {
        LOGGER.log(Level.WARNING, "An error happened");
        if (screenSize <= 12) {
            throw new WrongScreenSize();
        }
        this.screenSize = screenSize;
    }


    public String getOperativeSystem(){

        return operativeSystem;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }


    public void connectToInternet() {
        LOGGER.info("Computer is connected to the internet");
    }

    public void connectToInternet(int speed) {
        if (speed <= 0){
            LOGGER.log(Level.WARNING, "Computer is not connected to the internet");
            try {
                throw new CustomException();
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }
        else {
            LOGGER.log(Level.INFO, "Computer is connected to the internet at " + speed);
        }
    }


    public String checkIfWindows() throws WindowsException {
        if (this.operativeSystem != "Windows") {
            throw new WindowsException();
        }
        return "Computer is running on Windows";
    }


    public void checkIfLinux() throws LinuxException {
        if(operativeSystem.equalsIgnoreCase("Linux")){
            LOGGER.log(Level.INFO, "Computer is running on Linux");
        }else {
            throw new LinuxException();
        }
    }

    public void disconnectFromInternet() {
        LOGGER.info("Disconnected from the internet");
    }



    public void turnOff() {
        LOGGER.log(Level.INFO, "Turning off computer...");

    }

    public void checkUserAge() {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        LOGGER.log(Level.INFO, "Enter your age");
        age = sc.nextInt();
        final int minAge = 13;

        try {
            if (age>= minAge){
                LOGGER.log(Level.INFO, "Welcome, you can use the computer :)");
            }
            else{
                throw new UnderAgeException();
            }
        }catch (UnderAgeException e) {
            LOGGER.log(Level.WARNING, "Error: " + e.getMessage());
        }
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

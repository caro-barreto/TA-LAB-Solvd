package com.solvd.lab3;

import com.solvd.lab4.WindowsException;
import com.solvd.lab4.WrongScreenSize;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Laptop extends Computer {

   public static Logger LOGGER = Logger.getLogger(Laptop.class.getName());
   public FileHandler fh;

    {
        try{
            fh = new FileHandler("src/com/solvd/lab4/Logs.txt", true);
            LOGGER.addHandler(fh);
            LOGGER.setLevel(Level.ALL);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }


    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    private String processor;

    @Override
    public void setScreenSize(int screenSize) throws WrongScreenSize {
        super.setScreenSize(screenSize);
    }


    @Override
    public String checkIfWindows() throws WindowsException {
        return super.checkIfWindows();
    }

    @Override
    public String getOperativeSystem() {

        return operativeSystem;}

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

    @Override
    void createFile() {
        LOGGER.log(Level.INFO, "File was created from class Laptop");
    }

    @Override
    void deleteFile() {

    }

    public Laptop(boolean isTurnedOn) throws CustomException {
        super(isTurnedOn);
    }

    public void connectToInternet() {
        LOGGER.log(Level.INFO, "Laptop is connected to the internet");
    }

    @Override
    public void openCalculator() {
        LOGGER.log(Level.INFO, "Hello from calculator");

    }

    @Override
    public void enterOperation() {
        LOGGER.log(Level.INFO, "Operation made from Laptop");
    }

    @Override
    public void openIDE() {
        LOGGER.log(Level.INFO, "Opening IDE");
    }

    @Override
    public void writeSomeMessyCode() {
        LOGGER.log(Level.INFO, "Writing some code from Laptop");

    }

    @Override
    public void openPhotoshop() {

    }

    @Override
    public void selectPicture() {

    }

    @Override
    public void correctLightning() {

    }

    @Override
    public void openBrowser() {
        LOGGER.log(Level.INFO, "Opening browser from laptop");

    }

    @Override
    public void typeOnSearchEngine() {
        LOGGER.log(Level.INFO, "Searching 'How to improve my Java skills");

    }

    @Override
    public void seeSearchResults() {
        LOGGER.log(Level.INFO, "Search results: PRACTICE");

    }

    @Override
    public void downloadFileFromEmail() {

    }

    @Override
    public void sendFileToDocuments() {

    }
}

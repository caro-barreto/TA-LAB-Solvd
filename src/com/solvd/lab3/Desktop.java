package com.solvd.lab3;

import com.solvd.lab4.WindowsException;
import com.solvd.lab4.WrongScreenSize;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Desktop extends Computer {

    public static Logger LOGGER = Logger.getLogger(Desktop.class.getName());
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


    public Desktop(boolean isTurnedOn) throws CustomException {
        super (isTurnedOn);
            }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    private String graphics;

    static String memoriaRAM = "12GB";

    @Override
    public String getOperativeSystem() {
    return operativeSystem;}

    @Override
    public String checkIfWindows() throws WindowsException {
        return super.checkIfWindows();
    }

    static void scanForViruses() {
        System.out.println("Scanning for viruses from static method");
    }

    @Override
    public void setScreenSize(int screenSize) throws WrongScreenSize {
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

    @Override
    void createFile() {
        LOGGER.log(Level.INFO, "File was created from Desktop");
    }

    @Override
    void deleteFile() {

    }

    @Override
    public void openCalculator() {

    }

    @Override
    public void enterOperation() {

    }

    @Override
    public void openIDE() {

    }

    @Override
    public void writeSomeMessyCode() {

    }

    @Override
    public void openPhotoshop() {
        LOGGER.log(Level.INFO, "Opening Photoshop on desktop");

    }

    @Override
    public void selectPicture() {
        LOGGER.log(Level.INFO,"Selecting picture from Images @ desktop");

    }

    @Override
    public void correctLightning() {
        LOGGER.log(Level.INFO,"Editing picture");

    }

    @Override
    public void openBrowser() {

    }

    @Override
    public void typeOnSearchEngine() {

    }

    @Override
    public void seeSearchResults() {

    }

    @Override
    public void downloadFileFromEmail() {

    }

    @Override
    public void sendFileToDocuments() {

    }
}

package com.solvd.lab3;

import jdk.swing.interop.SwingInterOpUtils;

public class Laptop extends Computer {

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    private String processor;

    @Override
    public void setScreenSize(int screenSize) {
        super.setScreenSize(screenSize);
    }


    @Override
    public String getOperativeSystem() {
        return super.getOperativeSystem();
    }

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
        System.out.println("File was created from class Laptop");
    }

    @Override
    void deleteFile() {

    }

    public Laptop(boolean isTurnedOn) {
        super(isTurnedOn);
    }

    public void connectToInternet() {
        System.out.println("Laptop is connected to the internet");
    }

    @Override
    public void openCalculator() {
        System.out.println("Hello from calculator");

    }

    @Override
    public void enterOperation() {
        System.out.println("Operation made from Laptop");

    }

    @Override
    public void openIDE() {
        System.out.println("Opening IDE");
    }

    @Override
    public void writeSomeMessyCode() {
        System.out.println("Writing some messy code from Laptop #TrueStory");

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
        System.out.println("Opening browser from laptop");

    }

    @Override
    public void typeOnSearchEngine() {
        System.out.println("Searching 'how to improve my java skills'");

    }

    @Override
    public void seeSearchResults() {
        System.out.println("Search results: PRACTICE");

    }

    @Override
    public void downloadFileFromEmail() {

    }

    @Override
    public void sendFileToDocuments() {

    }
}

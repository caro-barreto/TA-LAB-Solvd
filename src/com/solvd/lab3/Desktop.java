package com.solvd.lab3;
public class Desktop extends Computer {

    public Desktop(boolean isTurnedOn) {
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

    static void scanForViruses() {
        System.out.println("Scanning for viruses from static method");
    }

    @Override
    public void setScreenSize(int screenSize) {
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
        System.out.println("File was created from Desktop");

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
        System.out.println("Opening Photoshop on Desktop");

    }

    @Override
    public void selectPicture() {
        System.out.println("Selecting picture from Images @ desktop");

    }

    @Override
    public void correctLightning() {
        System.out.println("Editing picture");

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

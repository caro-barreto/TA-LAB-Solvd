package com.solvd.lab3;

final class PrivateLaptop extends Computer{

    public PrivateLaptop(boolean isTurnedOn) throws CustomException {
        super(isTurnedOn);
    }

    final double PASSWORD = 438096255d;

    final void checkPassword(){
        if(PASSWORD == 438096255) {
            System.out.println("Password is correct");
        }
        else{
            System.out.println("Password in incorrect");
        }
    }


    @Override
    void createFile() {

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

    }

    @Override
    public void selectPicture() {

    }

    @Override
    public void correctLightning() {

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

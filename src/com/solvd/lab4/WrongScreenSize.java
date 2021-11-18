package com.solvd.lab4;

public class WrongScreenSize extends Exception {
    private static final long serialVersionUID = 4L;

    @Override
    public String getMessage() {
        return "Check the value entered. Wrong Screen size";
    }
}

package com.solvd.lab4;

public class UnderAgeException extends Exception{

    @Override
    public String getMessage() {
        return "You are no allowed to use the computer";
    }

    private static final long serialVersionUID = 12L;
}

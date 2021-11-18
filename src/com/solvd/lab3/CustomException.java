package com.solvd.lab3;

public class CustomException extends Exception{
    @Override
    public String getMessage() {
        return "Custom exception happened";
    }

    private static final long serialVersionUID = 1L;



}


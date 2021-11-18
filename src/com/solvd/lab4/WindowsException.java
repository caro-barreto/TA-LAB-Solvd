package com.solvd.lab4;

public class WindowsException extends Exception{
    @Override
    public String getMessage() {
        return "Your SO is not Windows";
    }
}

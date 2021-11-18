package com.solvd.lab4;

public class LinuxException extends Exception{

    private static final long serialVersionUID = 2L;

    @Override
    public String getMessage() {
        return "The SO is not Linux, you'll not be able to install our software";
    }
}

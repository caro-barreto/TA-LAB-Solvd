package com.solvd.lab4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reader {
    private final static Logger LOG = Logger.getLogger(Reader.class.getName());
    public static void main(String[]args) throws FileNotFoundException, IOException{
        try(BufferedReader br= new BufferedReader(new FileReader("plasticocruel.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                LOG.log(Level.INFO, line);

            }
        }
    }
}

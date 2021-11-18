package com.solvd.lab3;

import com.solvd.lab4.LinuxException;
import com.solvd.lab4.WindowsException;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.solvd.lab3.Computer.*;

public class Runner {
    public static void main(String[] args) throws CustomException, WindowsException {
        //como esta definido a nivel de paquete puedo modificar el valor desde runner
        //Modifier.fieldStatic = "STATIC - 2";
        //System.out.println(Modifier.fieldStatic);
        //Hay que recordar que siendO static ese valor puede ser cambiado desde cualquier lugar del paquete

        //Pude llamarlo sin crear un objeto
        //System.out.println(new Modifier().fieldStatic); // tmb funciona creando objeto
   // Modifier.staticMethod();
     Logger LOGGER = Logger.getLogger(Runner.class.getName());

     LOGGER.log(Level.INFO,"Static attribute");
     LOGGER.log(Level.INFO,"Available RAM memory: " +Desktop.memoriaRAM);
     Desktop.scanForViruses();
     System.out.println();

     LOGGER.log(Level.INFO,"----FROM LAPTOP----");
     Computer computer = new Laptop(true);
     computer.operativeSystem = "Windows";
     computer.createFile();
     LOGGER.log(Level.INFO, computer.getOperativeSystem());
     System.out.println();

     LOGGER.log(Level.INFO,"----FROM DESKTOP----");
     Computer desktop = new Desktop(true);
     desktop.operativeSystem = "Linux";
     desktop.setScreenSize(15);
     desktop.brand = "Lenovo";
     desktop.createFile();
     LOGGER.log(Level.INFO,"Desktop:");
     LOGGER.log(Level.INFO,desktop.toString());
     System.out.println( );

     LOGGER.log(Level.INFO,"----EXCEPTIONS----");
     try{
      computer.checkIfLinux();

     }catch (LinuxException ex){
      LOGGER.log(Level.INFO,ex.getMessage());

     }finally {
      LOGGER.log(Level.INFO,"Exception catched");
     }
     System.out.println();


     computer.checkUserAge();
     System.out.println();

     computer.connectToInternet(-2);
     computer.connectToInternet(100);

     System.out.println();
     desktop.getOperativeSystem();
     System.out.println(desktop.getOperativeSystem());
     Computer laptop = new Laptop(true);
     laptop.getOperativeSystem();

     System.out.println("----EXCEPTIONS----");
     laptop.checkIfWindows();
     System.out.println();






    }

}

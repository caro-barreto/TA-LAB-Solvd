package com.solvd.lab3;

import static com.solvd.lab3.Computer.*;

public class Runner {
    public static void main(String[] args) throws RuntimeException, CustomException {
        //como esta definido a nivel de paquete puedo modificar el valor desde runner
        //Modifier.fieldStatic = "STATIC - 2";
        //System.out.println(Modifier.fieldStatic);
        //Hay que recordar que siendO static ese valor puede ser cambiado desde cualquier lugar del paquete

        //Pude llamarlo sin crear un objeto
        //System.out.println(new Modifier().fieldStatic); // tmb funciona creando objeto
   // Modifier.staticMethod();

     System.out.println("Static attribute");
     System.out.println("Available RAM memory: " +Desktop.memoriaRAM);
     Desktop.scanForViruses();
     System.out.println();

     System.out.println("----FROM LAPTOP----");
     Computer computer = new Laptop(true);
     computer.operativeSystem = "Windows";
     computer.createFile();
     System.out.println(computer.getOperativeSystem());
     System.out.println();

     System.out.println("----FROM DESKTOP----");
     Computer desktop = new Desktop(true);
     desktop.operativeSystem = "Linux";
     desktop.setScreenSize(15);
     desktop.brand = "Lenovo";
     desktop.createFile();
     System.out.println("Desktop:");
     System.out.println(desktop.toString());


     System.out.println("----EXCEPTIONS----");
     desktop.makeSumofNegativeNumbers(-3, 5);


     System.out.println("----EXCEPTIONS----");
     Computer laptop = new Laptop(true);
     laptop.checkIfWindows();
     System.out.println();


    }

}

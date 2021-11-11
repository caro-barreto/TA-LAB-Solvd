package com.solvd.lab3;

public class Modifier {
    //final modifier disables inheritance
    //abstract allow us to use abstract methods inside this class
    private final String field1 = "some value";
    //no puede ser modificado si es final
    // para declarar una constante ademas de final agregamos static
    //static te permite llamar el atributo o metodo sin
    //crear un objeto de ese tipo - lo creas a nivel de clase y no de objeto

    static String fieldStatic = "STATIC";
    //puedo imprimirlo desde un metodo no estatico
    public final static String CONSTANT_1 = "CONSTANT_1";
    public final static float NUMBER_PI = 3.14f;

    private String field2 = "some value";

    //static constructor - solo atributos estaticos
//    static {
//        fieldStatic = "STATIC FROM CONSTRUCTOR";
//    }

    private void method1() {
//        System.out.println(fieldStatic);
    }

    private void method2() {
    }
    public static void staticMethod(){
        //estos metodos pueden ser llamados directamente desde la clase sin crear un objeto
        System.out.println("Static method was called");
        //usualmente los metodos estaticos trabajan con atributos estaticos
        System.out.println("Static methid was used " + fieldStatic);
    }
}

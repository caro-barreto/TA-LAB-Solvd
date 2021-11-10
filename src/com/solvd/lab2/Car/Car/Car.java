package com.solvd.lab2.Car.Car;

public class Car extends Vehicle {
    public Car(boolean isMoving){
              super(isMoving);
              model = "Tesla";
              maxSpeed = 200;
        }

//    public void drive(){
//        System.out.println("com.solvd.lab2.Car.Car.Car.Car is driving");
//    }
        // otra seria poner public com.solvd.lab2.Car.Car.Car.Car(){
            // super(true)
        //eso seria asumir que is moving es siempre true

}
//    public com.solvd.lab2.Car.Car.Car.Car(){
//        model = "Tesla";
//        maxSpeed = 200;
//        isMooving = false;
//    }
    //public com.solvd.lab2.Car.Car.Car.Car(){
       // model = "Tesla";
      //  maxSpeed = 200;
        // isMooving = false;


    /*public com.solvd.lab2.Car.Car.Car.Car(String model){
        this.model = model;
        //this = este objeto
        //setea esa propiedad por parametro.
    }*/


    /*public static void main(String[] args) {
        com.solvd.lab2.Car.Car.Car.Car car = new com.solvd.lab2.Car.Car.Car.Car("Toyota");
        System.out.println("Model: " + car.model);
        System.out.println("Max speed: " + car.maxSpeed);
    }*/
    //si pongo toyota por parametro, no estoy usando
    //los default ya que no coincide el model. Entonces, no esta definito max speed
    //el undefined para int es 0



//}

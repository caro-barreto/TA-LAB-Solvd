package com.solvd.lab2.Car;

public class Car extends Vehicle {
    public Car(boolean isMoving){
              super(isMoving);
              model = "Tesla";
              maxSpeed = 200;
        }

//    public void drive(){
//        System.out.println("Car is driving");
//    }
        // otra seria poner public Car(){
            // super(true)
        //eso seria asumir que is mooving es siempre true

}
//    public Car(){
//        model = "Tesla";
//        maxSpeed = 200;
//        isMooving = false;
//    }
    //public Car(){
       // model = "Tesla";
      //  maxSpeed = 200;
        // isMooving = false;


    /*public Car(String model){
        this.model = model;
        //this = este objeto
        //setea esa propiedad por parametro.
    }*/


    /*public static void main(String[] args) {
        Car car = new Car("Toyota");
        System.out.println("Model: " + car.model);
        System.out.println("Max speed: " + car.maxSpeed);
    }*/
    //si pongo toyota por parametro, no estoy usando
    //los default ya que no coincide el model. Entonces, no esta definito max speed
    //el undefined para int es 0



//}

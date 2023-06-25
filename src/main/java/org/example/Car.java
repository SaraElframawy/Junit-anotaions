package org.example;



public class Car {
    private String brand;
    private Engine engine;
    private boolean isRunning;

    public Car(String brand,Engine engine) {
        this.brand = brand;
        this.engine =engine;
    }

    public void startUp() {
       if (engine.checkOilPressure()< 20){
           throw new RuntimeException("Oil pressure was too low");

       }
       else {
           isRunning = true;
       }
       }


    public boolean isRunning(){
        return isRunning;
    }
}



package com.marynapryx;

public class CarFactoryPattern {

    public Car getBrand(String carBrand){

        if(carBrand == null){
            return null;
        }
        if(carBrand.equalsIgnoreCase("Ford")){
            return new Ford();

        } else if(carBrand.equalsIgnoreCase("Nissan")){
            return new Nissan();

        } else if(carBrand.equalsIgnoreCase("Lexus")){
            return new Lexus();
        }

        return null;
    }
}

////////////////////////////////////////////////////////////////
// Factory pattern is a Creational pattern that provides      //
// one of the best ways to create an object.                  //
//                                                            //
///////////////////////////////////////////////////////////////

package com.marynapryx;

public class Main {

    public static void main(String[] args) {

        CarFactoryPattern carFactory = new CarFactoryPattern();

        //get an object of Ford and call its drive method.
        Car car1 = carFactory.getBrand("Ford");

        //call draw method of Ford
        car1.drive();

        //get an object of Nissan and call its drive method.
        Car car2 = carFactory.getBrand("Nissan");

        //call draw method of Nissan
        car2.drive();

        //get an object of Lexus and call its drive method.
        Car car3 = carFactory.getBrand("Lexus");

        //call draw method of Lexus
        car3.drive();
    }

    }


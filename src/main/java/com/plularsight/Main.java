package com.plularsight;

public class Main {
    public static void main(String[] args) {


        Moped slowRide = new Moped("Red", 1, 0, 0);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(2);

      // style: pass everything through the constructor and
        // let super(...) on each child push it up to Vehicle.

        Car familyCar     = new Car("Blue", 5, 15, 14);
        SemiTruck bigRig  = new SemiTruck("White", 2, 5000, 300);
        Hovercraft skimmer = new Hovercraft("Silver", 4, 100, 80);

        // Verify values came through. Notice we call getters that live
        // on Vehicle even though the instances are children — that's
        // inheritance doing its job.
        System.out.println("Moped color:        " + slowRide.getColor());
        System.out.println("Moped passengers:   " + slowRide.getNumberOfPassengers());
        System.out.println("Moped cargo:        " + slowRide.getCargoCapacity());
        System.out.println("Moped fuel:         " + slowRide.getFuelCapacity());

        System.out.println();

        System.out.println("Car:        " + familyCar.describe());
        System.out.println("SemiTruck:  " + bigRig.describe());
        System.out.println("Hovercraft: " + skimmer.describe());
    }
}
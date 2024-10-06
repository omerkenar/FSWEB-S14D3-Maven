package org.example.arge;

public class Main {
    public static void main(String[] args) {

        CarSkeleton electricCar = new ElectricCar("Mercedes", "eqs",500,500);
        CarSkeleton hybridCar = new HybridCar("Toyota", "Corolla", 1000,200,1600);
        CarSkeleton gasPoweredCar = new GasPoweredCar("Volvo","V40",1200,2000);
        printObj(electricCar);
        printObj(hybridCar);
        printObj(gasPoweredCar);
    }

    public static void printObj(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }

}

package org.example.arge;

public class GasPoweredCar extends CarSkeleton{

    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }


    @Override
    public String drive() {
        return "Gas powered car going to road..";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return "Gas powered car starting from " + getName();
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
}

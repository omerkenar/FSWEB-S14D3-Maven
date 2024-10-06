package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public  String startEngine(){
        System.out.println("name:" + getClass().getSimpleName());
        return getName() + " engine start...";

    }

    public String drive(){
        runEngine(this);
        return getName() + " going to road";
    }

    public void runEngine(CarSkeleton carSkeleton){

        if(carSkeleton instanceof ElectricCar){
            ElectricCar electricCar = (ElectricCar) carSkeleton;
            System.out.println("Elektrikli araba çalıştırıldı. " + "ortalama mesafe: " + electricCar.getAvgKmPerCharge() + ". Batarya Boyutu: " + electricCar.getBatterySize());
        } else if (carSkeleton instanceof HybridCar) {
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("Hybrid araba çalıştırıldı. " + "ortalama yakıt(lt): " + hybridCar.getAvgKmPerLiter() + ". Batarya Boyutu: " + hybridCar.getBatterySize() + ". Silindir Hacmi: " + hybridCar.getCylinders());
        } else if (carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
            System.out.println("Benzinli araba çalıştırıldı. " + "ortalama yakıt(lt): " + gasPoweredCar.getAverageKmPerLiter() + ". Silindir Hacmi: "+ gasPoweredCar.getCylinders());

        } else {
            System.out.println("Geçersiz veri girişi");
        }


    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

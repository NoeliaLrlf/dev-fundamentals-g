public class CarLastPerformanceLog {
    private int numberOfFuelCharges;
    private double spentGas;
    private Car car;

    public CarLastPerformanceLog(Car car, int numCharges, double spentGas){
        this.numberOfFuelCharges = numCharges;
        this.spentGas = spentGas;
        this.car = car;
    }

    public int getNumberOfFuelCharges(){
        return numberOfFuelCharges;
    }

    public double getSpentGas(){
        return spentGas;
    }

    public Car getCar(){
        return car;
    }
}

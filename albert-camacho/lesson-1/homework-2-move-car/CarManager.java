import java.util.ArrayList;
import java.util.List;

public class CarManager {

    private List<Car> carList;
    private List<CarLastPerformanceLog> performanceLogList;

    public CarManager(){
        carList = new ArrayList<>();
        performanceLogList = new ArrayList<>();
    }

    public void addCar(Car car){
        carList.add(car);
    }

    /*
     * Assuming we want to see the performance of cars based on their movement,
     * the fuel tanks will be filled and before moving the cars
     */
    public void moveAllCars(double distance){
        performanceLogList.clear();
        for (Car car : carList){
            fillFullThank(car);

            if (!car.getIsPowerOn()){
                car.powerOn();
            }

            int numTimesFuelWasCharged = numTimesCarWasCharged(car, distance);
            double spentGas = calcSpentGas(car, numTimesFuelWasCharged);

            CarLastPerformanceLog carPerform = new CarLastPerformanceLog(car, numTimesFuelWasCharged, spentGas);

            performanceLogList.add(carPerform);

            car.powerOff();
        }
    }

    public void printLastPerformanceComparision(){
        System.out.println("------------------------------------------------------------------------- ");
        System.out.println("|                         PERFORMANCE COMPARISON                         | ");
        System.out.println("------------------------------------------------------------------------- ");
        for (CarLastPerformanceLog performance : performanceLogList){
            Car car = performance.getCar();
            System.out.println("Model: " + car.getModel());
            System.out.println("# times the tank was charged: " + performance.getNumberOfFuelCharges());
            System.out.println("# liters were used: " + performance.getSpentGas());
            System.out.println("------------------------------------------------------------------------- ");
        }

    }

    public void printStatusAllCars(){
        System.out.println("------------------------------------------------------------------------- ");
        System.out.println("|                           STATUS OF ALL CARS                           | ");
        System.out.println("------------------------------------------------------------------------- ");
        for (Car car : carList){
            car.printInformation();
            System.out.println("------------------------------------------------------------------------- ");
        }
    }

    /*
     * It calculates how many gas was spent during las movement
     */
    private double calcSpentGas(Car car, int num){
        double scale = Math.pow(10, 2);
        double spent = (num * car.getTankCapacity()) - car.getGas();
        return Math.round(spent * scale) / scale;
    }

    /*
     * It fill all the tank
     */
    private void fillFullThank(Car car){
        double missingGas = car.getTankCapacity() - car.getGas();
        car.fillFuelTank(missingGas);
    }

    /*
     * It calculates how many times the car was charged in order to arrive the distance
     */
    private int numTimesCarWasCharged(Car car, double distance){
        double dist = distance;
        int numCharge = 1;
        while (dist > 0){
            car.move(dist);
            dist -= car.getLastDistance();
            if (dist > 0){
                fillFullThank(car);
                numCharge++;
            }
        }
        return numCharge;
    }
}

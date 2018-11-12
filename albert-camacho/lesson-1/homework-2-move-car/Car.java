
public class Car {
    private String model;
    private double gas = 0;
    private boolean isPowerOn = false;

    // How many kilometers the car has been moved
    private double lastDistance;
    private double odometerReader;

    // Liter as measurement unit
    private double tankCapacity;

    // How many kilometers per 1 liter
    private double kilometersPerLiter;

    public Car(String model, double tankCapacity, double kilometersPerLiter){
        this.model = model;
        this.tankCapacity = tankCapacity;
        this.kilometersPerLiter = kilometersPerLiter;
        this.odometerReader = 0;
    }

    public String getModel(){
        return model;
    }

    public void powerOn(){
        isPowerOn = true;
    }

    public void powerOff(){
        isPowerOn = false;
    }

    public boolean getIsPowerOn(){
        return isPowerOn;
    }

    public double getTankCapacity(){
        return tankCapacity;
    }

    public double getGas(){
        double scale = Math.pow(10, 2);
        return Math.round(gas * scale) / scale;
    }

    public double getLastDistance(){
        return lastDistance;
    }

    public void fillFuelTank(double liters){
        double missingGas = tankCapacity - gas;
        if (liters <= missingGas){
            gas =+ liters;
        } else {
            gas += missingGas;
            // Log the wasted liters
            double wasted = liters - missingGas;
            System.out.println("Alert: Overflow the fuel and " + wasted +
                               " liters were wasted when filling the tank.");
        }
    }

    public void move(double distance){
        if (isPowerOn && gas > 0){
            lastDistance = canMove(distance);
            odometerReader += lastDistance;
            gas -= lastDistance/kilometersPerLiter;
        }
    }

    /*
     * Returns the distance the car can move based on how many gas there is
     */
    private double canMove(double distance){
        double gasTobeConsumed = distance / kilometersPerLiter;
        if(gasTobeConsumed > gas){
            return gas * kilometersPerLiter;
        }
        return distance;
    }

    public void printInformation(){
        String status = isPowerOn ? "Power On" : "Power Off";
        String fmtText = "%-15s %-20s %-30s %-10s\n";

        System.out.printf(fmtText,"MODEL:", model, "STATUS:", status);
        System.out.printf(fmtText, "ODOMETER:", odometerReader + " km",
                          "DISTANCE AFTER LAST CHARGE:", lastDistance + " km");
        System.out.printf(fmtText,"CURRENT GAS:", getGas() + " lts",
                          "TANK CAPACITY:", tankCapacity + " lts");
    }

}

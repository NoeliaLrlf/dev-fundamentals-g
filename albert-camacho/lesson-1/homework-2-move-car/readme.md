**If run the following:**
```java
public class Main {
    public static void main(String arg[]){
        Car toyota = new Car("Toyota 2005", 50, 21);

        Car suzuki = new Car("Suzuki 2015", 65, 30.12);

        Car volkswagen = new Car("Volkswagen 2009", 55, 25.65);

        CarManager manager = new CarManager();
        manager.addCar(toyota);
        manager.addCar(suzuki);
        manager.addCar(volkswagen);

        manager.moveAllCars(2819.50);

        manager.printLastPerformanceComparision();

        manager.printStatusAllCars();

    }
}

```

**The Output is:** 

```

------------------------------------------------------------------------- 
|                         PERFORMANCE COMPARISON                         | 
------------------------------------------------------------------------- 
Model: Toyota 2005
# times the tank was charged: 3
# liters were used: 134.26
------------------------------------------------------------------------- 
Model: Suzuki 2015
# times the tank was charged: 2
# liters were used: 93.61
------------------------------------------------------------------------- 
Model: Volkswagen 2009
# times the tank was charged: 2
# liters were used: 109.92
------------------------------------------------------------------------- 
------------------------------------------------------------------------- 
|                           STATUS OF ALL CARS                           | 
------------------------------------------------------------------------- 
MODEL:          Toyota 2005          STATUS:                        Power Off 
ODOMETER:       2819.5 km            DISTANCE AFTER LAST CHARGE:    719.5 km  
CURRENT GAS:    15.74 lts            TANK CAPACITY:                 50.0 lts  
------------------------------------------------------------------------- 
MODEL:          Suzuki 2015          STATUS:                        Power Off 
ODOMETER:       2819.5 km            DISTANCE AFTER LAST CHARGE:    861.7 km  
CURRENT GAS:    36.39 lts            TANK CAPACITY:                 65.0 lts  
------------------------------------------------------------------------- 
MODEL:          Volkswagen 2009      STATUS:                        Power Off 
ODOMETER:       2819.5 km            DISTANCE AFTER LAST CHARGE:    1408.75 km
CURRENT GAS:    0.08 lts             TANK CAPACITY:                 55.0 lts  
------------------------------------------------------------------------- 
```

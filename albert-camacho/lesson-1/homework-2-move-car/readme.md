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
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/90/lib/idea_rt.jar=34493:/snap/intellij-idea-community/90/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/home/albert/IdeaProjects/dev-fundamentals-g/bin:/home/albert/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.3.1/junit-jupiter-api-5.3.1.jar:/home/albert/.m2/repository/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.jar:/home/albert/.m2/repository/org/opentest4j/opentest4j/1.1.1/opentest4j-1.1.1.jar:/home/albert/.m2/repository/org/junit/platform/junit-platform-commons/1.3.1/junit-platform-commons-1.3.1.jar Main
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

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

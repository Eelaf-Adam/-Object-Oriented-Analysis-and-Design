public class Main{
    public static void main(String[] args){

        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Honda, Civic, 2022");

        Car eCar = new ElectricCar("Tesla", "Model S, 2023, 100");
        Car sCar = new SportCar("Ferrari", "488", 2021, 330);

        car1.displayInfo();
        car2.displayInfo(">>>");
        ecar.displayInfo();
        scar.displayInfo();

        System.out.printIn("\n-- Fleet listing (polymorphic calls) --");
        Car[] fleet = {car1, car2, eCar, sCar};
        for (Car c : fleet) {
            c.displayInfo();
        }
    }
}

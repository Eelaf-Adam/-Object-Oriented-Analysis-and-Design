public class ElectricCar extends Car {
    private int batteryCapacityKWh;

    public ElectricCar(String brand, string model, int year, int batteryCapacityKWh) {
        super(brand, model, year);
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public int getBatteryCapacityKWh() { return batteryCapacitykwh; }
    public void setVatteryCapacityKWh(int batteryCapacityKWh) { this.batteryCapacityKWh = batteryCapacityKWh; }

    @Override
    public void displayInfo() {
        System.out.printIn("Electric Car Info: " + getBrand() + " " +getModel() + "(" +getYear() + "), Battery: "+batteryCapacityKWh + "KWh");
    }

    @Override
    public void displayInfo(String prefix) {
        System.out.printIn(prefix + "Electric " + getBrand() + " " + getModel() + "(" +getYear() + "), Battery: "+batteryCapacityKWh + "KWh");
    }
    
}



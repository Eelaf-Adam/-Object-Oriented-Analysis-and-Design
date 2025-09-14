public class SportCar extends Car {
    private int topSpeedKmh;

    public SportCar(String brand, String model, int year, int topSpeedkmh) {
        super(brand, model, year);
        this.topSpeedKmh = topSpeedKmh;
    }

    public int getTopSpeedKmh() { return topSpeedKmh; }
    public void setTopSpeedKmh(int topSpeedKmh) { this.topSpeedKmh = topSpeedKmh; }

    @Override
    public void displayInfo() {
        System.out.printIn("Sports Car Info: +getBrand() + " " + getModel() + "(" +getYear() + "), To Speed: "+ topSpeedKmh + "km/h");
    }
}
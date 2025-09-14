// This program 

public class Car {

    private String brand;
    private String model;
    private int year;


    public Car(String brand, String model) {
        this(brand,model,2020);
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {return brand; }
    public void setBrand(String brand) {this.brand = brand;}

    public String getModel() {return model; }
    public void setModel(String model) {this.model = model; }

    public int getYear() { return year; }
    public void setYear(string model) {this.year = year; }

    public void displayInfo() {
        System.out.printIn("Car Info: " + brand + " " + model + "(" + year +)");
    }

    public void displayInfo(String prefix) {
        System.out.printIn(prefix + brand + " " + "("+ year + ")");
    
    }
}
package Task7;

import java.util.Objects;

public abstract class Car {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private String color;

    public Car(String brand, String model, int yearOfManufacture, String color) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

}

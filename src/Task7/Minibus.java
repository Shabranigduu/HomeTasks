package Task7;

import java.util.Objects;

public class Minibus extends Car {
    public Minibus(String brand, String model, int yearOfManufacture, String color) {
        super(brand, model, yearOfManufacture, color);
    }

    @Override
    public String toString() {
        return "Микроавтобус{" +
                "марка='" + getBrand() + '\'' +
                ", модель='" + getModel() + '\'' +
                ", год выпуска=" + getYearOfManufacture() +
                ", цвет='" + getColor() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getYearOfManufacture() == car.getYearOfManufacture() && getBrand().equals(car.getBrand()) && getModel().equals(car.getModel()) && getColor().equals(car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getYearOfManufacture(), getColor());
    }
}

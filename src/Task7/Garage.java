package Task7;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<Car, Integer> listOfCar = new HashMap<>();

    public Map<Car, Integer> getListOfCar() {
        return listOfCar;
    }

    public int amountOfCar(Car car) {
        if (!getListOfCar().isEmpty()) {
            return listOfCar.get(car);
        } else {
            return 0;
        }
    }

    public void park(Car car) {
        if (listOfCar.containsKey(car)) {
            listOfCar.put(car, listOfCar.get(car) + 1);
        } else {
            listOfCar.put(car, 1);
        }

    }

    public void outFromGarage(Car car) {
        if (listOfCar.containsKey(car)) {
            if (listOfCar.get(car) > 1) {
                listOfCar.put(car, listOfCar.get(car) - 1);
            } else {
                getListOfCar().remove(car);
            }
        } else {
            System.out.println("Автомобиля " + car + " нет в данном гараже");
        }
    }

    private String printAllCar() {
        String result = "";
        if (!listOfCar.isEmpty()) {
            for (Car car : listOfCar.keySet()) {
                result += "\n" + car.toString() + " " + listOfCar.get(car) + "шт.";
            }
            return result;
        } else return "пусто";
    }

    public int amountCarThisType(Car car1) {
        int count = 0;
        for (Car car : listOfCar.keySet()) {
            if (car.getClass().equals(car1.getClass())) {
                count += listOfCar.get(car);
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "В данном гараже: " + this.printAllCar();
    }
}

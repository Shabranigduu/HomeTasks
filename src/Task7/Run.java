package Task7;

import java.util.Map;

public class Run {
    public static void main(String[] args) {
        Garage garage = new Garage();
        PassengerCar passengerCar1 = new PassengerCar("Lada", "Vesta", 2022, "Black");
        PassengerCar passengerCar2 = new PassengerCar("Lada", "Vesta", 2022, "White");
        PassengerCar passengerCar3 = new PassengerCar("Lada", "Vesta", 2022, "Black");
        PassengerCar passengerCar4 = new PassengerCar("Lada", "Vesta", 2022, "Black");
        Truck truck = new Truck("Volvo", "FMX", 2014, "Red");
        garage.park(passengerCar1);
        garage.park(passengerCar2);
        garage.park(passengerCar3);
        garage.park(passengerCar4);
        garage.park(truck);
        System.out.println(garage);
        System.out.println(garage.amountOfCar(passengerCar1));
        System.out.println(garage.amountCarThisType(passengerCar1));
        garage.outFromGarage(passengerCar4);
        System.out.println(garage);
    }
}

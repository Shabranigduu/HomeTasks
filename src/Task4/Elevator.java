package Task4;

public class Elevator {
    private int minFloor = 1;
    private int maxFloor = 6;
    private int currentFloor = 1;

    public Elevator() {
    }

    public Elevator(int minFloor, int maxFloor) {
        if (minFloor < 1) {
            System.out.println("Минимальный этаж не должен быть меньше 1");
        } else if (maxFloor < minFloor) {
            System.out.println("Максимальный этаж должен быть больше или равен минимальному этажу");
        } else {
            this.minFloor = minFloor;
            this.maxFloor = maxFloor;
            currentFloor = minFloor;
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp() {
        if (currentFloor < maxFloor) {
            currentFloor++;
            System.out.println("Движение вверх. Текущий этаж - " + currentFloor);
        } else {
            System.out.println("Вы уже на самом верхнем этаже.");
        }
    }

    public void moveDown() {
        if (currentFloor > minFloor) {
            currentFloor--;
            System.out.println("Движение вниз. Текущий этаж - " + currentFloor);
        } else {
            System.out.println("Вы уже на самом нижнем этаже.");
        }
    }

    public void move(int floor) {
        if (currentFloor == floor) {
            System.out.println("Вы уже на этом этаже(" + floor + ")");
        } else if (floor < minFloor || floor > maxFloor) {
            System.out.println("В здании нет " + floor + " этажа");
        } else if (floor > currentFloor) {
            while (currentFloor != floor) {
                moveUp();
            }
        } else {
            while (currentFloor != floor) {
                moveDown();
            }
        }
    }
}


package Task4;

public class Elevator {
    private int minFloor = 1;
    private int maxFloor = 6;
    private int currentFloor = 1;

    public Elevator() {
    }

    public Elevator(int minFloor, int maxFloor) {
        if (minFloor == 0) {
            System.out.println("Минимальный этаж не должен быть равен 0");
        } else if (maxFloor < minFloor && maxFloor < 1) {
            System.out.println("Максимальный этаж должен быть больше или равен минимальному этажу, при этом не меньше 1");
        } else {
            this.minFloor = minFloor;
            this.maxFloor = maxFloor;
            if (currentFloor < minFloor) {
                currentFloor = minFloor;
            }
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp() {
        currentFloor++;
        if (currentFloor - 1 < maxFloor && currentFloor != 0) {
            System.out.println("Движение вверх. Текущий этаж: " + currentFloor);
        } else if (currentFloor == 0) {
            currentFloor++;
            System.out.println("Движение вверх. Текущий этаж: " + currentFloor);
        } else {
            System.out.println("Вы уже на самом верхнем этаже.");
            currentFloor--;
        }
    }

    public void moveDown() {
        currentFloor--;
        if (currentFloor + 1 > minFloor && currentFloor != 0) {
            System.out.println("Движение вниз. Текущий этаж: " + currentFloor);
        } else if (currentFloor == 0) {
            currentFloor--;
            System.out.println("Движение вниз. Текущий этаж: " + currentFloor);
        } else {
            System.out.println("Вы уже на самом нижнем этаже.");
            currentFloor++;
        }
    }

    public void move(int floor) {
        if (currentFloor == floor) {
            System.out.println("Вы уже на этом этаже(" + floor + ")");
        } else if (floor < minFloor || floor > maxFloor || floor == 0) {
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


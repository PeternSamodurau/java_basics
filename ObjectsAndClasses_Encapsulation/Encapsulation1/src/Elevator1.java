public class Elevator1 {
    private int maxFloor;
    private int currentFloor = 1;
    private int minFloor;

    public Elevator1(int maxFloor, int minFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveUp() {
        currentFloor = currentFloor+1;
        return currentFloor;
    }

    public int moveDown() {
        currentFloor = currentFloor-1;
        return currentFloor;
    }

    public void move(int floor) {
        if (floor > 0 && floor > maxFloor) {
            System.out.println("Нет этажа выше чем :" + maxFloor);
        } else {
            for (currentFloor = 1; currentFloor <= floor; moveUp()) {
                System.out.println("Текущий этаж :" + getCurrentFloor());
            }
        }
        if (floor < -1 && floor < minFloor) {
            System.out.println("Нет этажа ниже чем :" + minFloor);
        } else {
            for (currentFloor = 1; currentFloor >= floor; moveDown()) {
                System.out.println("Текущий этаж:" + getCurrentFloor());
            }
        }
    }
}

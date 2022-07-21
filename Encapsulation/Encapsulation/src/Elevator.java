public class Elevator {
    private int currentFloor;
    private int minFloor;
    private int maxFloor;


    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor--;
    }

    public void moveUp() {
        currentFloor++;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("incorrect floor");
        } else if (floor == currentFloor) {
            System.out.println(currentFloor + " floor");
        } else if (currentFloor > floor) {
            while (currentFloor > floor) {
                moveDown();
                System.out.println(currentFloor + " floor");
            }
        } else {
            while (currentFloor < floor) {
                moveUp();
                System.out.println(currentFloor + " floor");
            }
        }
    }
}
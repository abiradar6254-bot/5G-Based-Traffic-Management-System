package TrafficManagement;

import java.util.*;

public class Grid {
    private int width, height;
    private List<Car> cars;
    private Random random;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.cars = new ArrayList<>();
        this.random = new Random();
    }

    public void initialize() {
        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            char dir = randomDirection();
            cars.add(new Car(x, y, dir));
        }
    }

    public void simulateTraffic(int steps) {
        for (int step = 0; step < steps; step++) {
            System.out.println("Time step " + step);
            for (Car car : cars) {
                if (car.needsToTurn()) {
                    car.turnRandomly();
                }
                car.move();
                checkBounds(car);
                System.out.println(car);
            }
            System.out.println();
        }
    }

    private void checkBounds(Car car) {
        if (car.x < 0) car.x = 0;
        if (car.y < 0) car.y = 0;
        if (car.x >= width) car.x = width - 1;
        if (car.y >= height) car.y = height - 1;
    }

    private char randomDirection() {
        char[] dirs = {'N', 'S', 'E', 'W'};
        return dirs[random.nextInt(dirs.length)];
    }
}

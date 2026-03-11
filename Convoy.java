package TrafficManagement;

import java.util.*;

public class Convoy {
    private List<Car> members = new ArrayList<>();

    public void addCar(Car car) {
        members.add(car);
    }

    public void moveAll() {
        for (Car car : members) {
            car.move();
        }
    }

    @Override
    public String toString() {
        return "Convoy with " + members.size() + " cars.";
    }
}

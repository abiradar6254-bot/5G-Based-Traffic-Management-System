package TrafficManagement;

import java.util.*;

public class Car {
    private static int idCounter = 0;
    public final int id;
    public int x, y;
    public char direction; // N, S, E, W
    public int remainingTurns;

    public Car(int x, int y, char direction) {
        this.id = idCounter++;
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.remainingTurns = new Random().nextInt(5) + 1;
    }

    public void move() {
        switch (direction) {
            case 'N': y--; break;
            case 'S': y++; break;
            case 'E': x++; break;
            case 'W': x--; break;
        }
        remainingTurns--;
    }

    public boolean needsToTurn() {
        return remainingTurns == 0;
    }

    public void turnRandomly() {
        char[] directions = {'N', 'S', 'E', 'W'};
        direction = directions[new Random().nextInt(directions.length)];
        remainingTurns = new Random().nextInt(5) + 1;
    }

    @Override
    public String toString() {
        return "Car#" + id + " at (" + x + "," + y + ") dir: " + direction;
    }
}

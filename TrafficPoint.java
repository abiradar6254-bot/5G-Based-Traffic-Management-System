package TrafficManagement;

public class TrafficPoint {
    public int x, y;
    public String type; // E.g., "intersection", "stop", etc.

    public TrafficPoint(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public boolean isAt(int x, int y) {
        return this.x == x && this.y == y;
    }

    @Override
    public String toString() {
        return "TrafficPoint at (" + x + "," + y + ") Type: " + type;
    }
}

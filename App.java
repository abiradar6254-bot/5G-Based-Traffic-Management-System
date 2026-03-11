package TrafficManagement;

public class App {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10); // 10x10 grid
        grid.initialize();
        grid.simulateTraffic(20); // Simulate 20 time steps
    }
}

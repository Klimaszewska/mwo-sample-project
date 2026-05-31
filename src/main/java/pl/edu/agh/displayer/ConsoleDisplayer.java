package pl.edu.agh.displayer;

import java.util.Map;

public class ConsoleDisplayer implements IDisplayer {

    @Override
    public void display(Map<String, Object> stats) {
        System.out.println("Statystki dla badanego kierowcy");
        System.out.println("--------------------------------");
        stats.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("--------------------------------");
    }
}

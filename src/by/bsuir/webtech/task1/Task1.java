package by.bsuir.webtech.task1;

public class Task1 {
    public static void main(String[] args) {
        double x = 15;
        double y = 10;
        double result = calculateFormula(x, y);
        System.out.printf("Task 1: result = %.5f", result);
    }

    private static double calculateFormula(double x, double y) {
        double result = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x) /
                (1 + x * x * y * y)));
        return result;
    }
}

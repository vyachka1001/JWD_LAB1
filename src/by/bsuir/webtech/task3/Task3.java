package by.bsuir.webtech.task3;

import by.bsuir.webtech.task3.calculator.Calculator;

import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        double leftBorder = 0;
        double rightBorder = 5;
        double step = 0.5;

        Map<Double, Double> result = Calculator.calculateFunctionInRange(leftBorder, rightBorder, step);
        printResult(result);
    }

    private static void printResult(Map<Double, Double> result) {
        System.out.printf("| %12c | %12s |\n", 'x', "tg(x)");
        for (double i : result.keySet()) {
            System.out.printf("| %12.2f | %12.2f |\n", i, result.get(i));
        }
    }
}

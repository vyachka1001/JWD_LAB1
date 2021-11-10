package by.bsuir.webtech.task3.calculator;

import java.util.TreeMap;

public class Calculator {
    public static double calculateFunction(double x) {
        double result = Math.tan(x);
        return result;
    }

    public static TreeMap<Double, Double> calculateFunctionInRange(double leftBorder, double rightBorder, double step) {
        TreeMap<Double, Double> result = new TreeMap<>();

        for(double i = leftBorder; i <= rightBorder; i += step) {
            result.put(i, calculateFunction(i));
        }
        return result;
    }
}

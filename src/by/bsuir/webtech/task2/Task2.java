package by.bsuir.webtech.task2;

import by.bsuir.webtech.task2.area.Rectangle;
import by.bsuir.webtech.task2.area.RectangleFigure;

public class Task2 {
    public static void main(String[] args) {
        RectangleFigure figure = new RectangleFigure(
                new Rectangle(-4, 5, 8, 5),
                new Rectangle(-6, 0, 12, 3)
        );
        double x = -2;
        double y = 3;

        boolean result = figure.contains(x, y);
        System.out.printf("The figure contains a point (%.2f,%.2f): %s\n", x, y, result);
    }
}

package by.bsuir.webtech.task2.area;

public class RectangleFigure {
    private final Rectangle[] figure;

    public RectangleFigure(Rectangle... rectangles) {
        figure = rectangles;
    }

    public boolean contains(double x, double y) {
        for (Rectangle rect : this.figure) {
            if (rect.isContains(x, y)) {
                return true;
            }
        }
        return false;
    }
}

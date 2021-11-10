package by.bsuir.webtech.task2.area;

public class Rectangle {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;

    public Rectangle(double x, double y, double width, double height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + width;
        this.y2 = y1 - height;
    }

    public double[] getCoords() {
        double[] coords = new double[] {x1, y1, x2, y2};
        return coords;
    }

    public boolean isContains(double x, double y) {
        boolean result = (this.x1 <= x && x <= this.x2 && this.y1 >= y && y >= this.y2);
        return result;
    }
}

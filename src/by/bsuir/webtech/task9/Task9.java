package by.bsuir.webtech.task9;

public class Task9 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new Ball(10.1, Color.BLUE));
        basket.add(new Ball(5.2, Color.GREEN));
        basket.add(new Ball(4.9, Color.YELLOW));
        basket.add(new Ball(7, Color.BLUE));
        basket.add(new Ball(8, Color.RED));

        double totalWeight = basket.countTotalBallsWeight();
        int blueBallsAmount = basket.countAmountOfBlueBalls();

        System.out.printf("Total weight = %.1f\nAmount of blue balls = %d\n", totalWeight, blueBallsAmount);
    }
}

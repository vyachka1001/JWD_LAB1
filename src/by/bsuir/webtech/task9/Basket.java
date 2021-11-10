package by.bsuir.webtech.task9;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public Basket(ArrayList<Ball> balls) {
        this.balls = new ArrayList<>(balls);
    }

    public void add(Ball ball) {
        this.balls.add(ball);
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public int countAmountOfBlueBalls() {
        int amountOfBlueBalls = 0;
        for (Ball ball : this.balls) {
            if(ball.getColor() == Color.BLUE) {
                amountOfBlueBalls++;
            }
        }
        return amountOfBlueBalls;
    }

    public double countTotalBallsWeight() {
        double totalWeight = 0;
        for (Ball ball : this.balls) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }
}

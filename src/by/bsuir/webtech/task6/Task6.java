package by.bsuir.webtech.task6;

import by.bsuir.webtech.task6.filler.Filler;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[] {0, 1, 2, 3, 4};
        int[][] matrix = new int[array.length][array.length];
        Filler.fillMatrix(array, matrix, array.length);
        for (int[] rows : matrix) {
            for (int item : rows) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}

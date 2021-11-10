package by.bsuir.webtech.task6.filler;

public class Filler {
    public static void fillMatrix(int[] array, int[][] matrix, int length) {
        int currentIndex;
        int diagonalIndex = 0;
        for(int i = 0; i < length; i++) {
            currentIndex = diagonalIndex;
            for(int j = i; j < length; j++) {
                //to fill another cells, it's necessary to add 1 point to index
                int item = array[currentIndex];
                matrix[i][j] = item;
                matrix[j][i] = item;
                currentIndex = increaseIndex(length, currentIndex, 1);
            }
            //after current matrix row/line is filled, it's necessary to add 2 points to diagonalIndex
            diagonalIndex = increaseIndex(length, diagonalIndex, 2);
        }
    }

    private static int increaseIndex(int length, int index, int value) {
        int result = (index + value) % length;
        return result;
    }
}

package by.bsuir.webtech.task7;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[] {0, 1, 6, 7, 0, -1, 4};
        sortArray(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static void sortArray(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            if(i < 0) {
                i = 0;
            }
            if(array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i -= 2;
            }
        }
    }
}

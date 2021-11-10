package by.bsuir.webtech.task5;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[] {9, 8, 4, 5, 9, 7, 13, 0, 21, 20, 25};
        int[] lengthsArray = new int[array.length];
        fillLengthsArray(lengthsArray, array);
        int length = countMaxSubSequenceLength(lengthsArray);
        int k = array.length - length;
        System.out.println("Number of elements = " + k);
    }

    private static int countMaxSubSequenceLength(int[] lengthsArray) {
        int length = 0;
        for (int currLength : lengthsArray) {
            if (currLength > length) {
                length = currLength;
            }
        }
        return length;
    }

    private static void fillLengthsArray(int[] lengthsArray, int[] array) {
        for(int i = 0; i < array.length; i++) {
            lengthsArray[i] = 1;
            for(int j = 0; j < i; j++) {
                if(array[i] > array[j] && (lengthsArray[j] + 1) > lengthsArray[i]) {
                    lengthsArray[i] = lengthsArray[j] + 1;
                }
            }
        }
    }
}

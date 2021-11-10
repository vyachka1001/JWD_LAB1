package by.bsuir.webtech.task8;

public class Task8 {
    public static void main(String[] args) {
        int[] indexes = getInsertIndexesForSequences(
                new int[] {1, 4, 6, 9},
                new int[] {2, 5, 8}
        );

        for (int index : indexes) {
            System.out.print(index + " ");
        }
    }

    private static int[] getInsertIndexesForSequences(int[] firstSequence, int[] secondSequence) {
        int firstSequenceLength = firstSequence.length;
        int secondSequenceLength = secondSequence.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] insertIndexes = new int[secondSequenceLength];
        while (i < firstSequenceLength && j < secondSequenceLength) {
            if (firstSequence[i] <= secondSequence[j]) {
                i++;
            } else {
                insertIndexes[j++] = k;
            }
            k++;
        }
        while (j < secondSequenceLength) {
            insertIndexes[j++] = k;
            k++;
        }
        return insertIndexes;
    }
}

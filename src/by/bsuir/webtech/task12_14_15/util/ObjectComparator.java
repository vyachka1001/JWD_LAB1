package by.bsuir.webtech.task12_14_15.util;

public class ObjectComparator {
    public static <T extends Comparable<? super T>> int compare(T firstObject, T secondObject) {
        if (firstObject == secondObject) {
            return 0;
        }
        if (firstObject == null) {
            return -1;
        }
        if (secondObject == null) {
            return 1;
        }
        return firstObject.compareTo(secondObject);
    }
}

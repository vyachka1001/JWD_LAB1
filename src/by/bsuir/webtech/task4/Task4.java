package by.bsuir.webtech.task4;

import by.bsuir.webtech.task4.checker.PrimeChecker;

public class Task4 {
    public static void main(String[] args) {
        int[] numbersArray = new int[] {4, 5, 7, 9, 13};
        printIndexesOfPrimes(numbersArray);
    }

    private static void printIndexesOfPrimes(int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            if (PrimeChecker.isPrime(numbersArray[i])) {
                System.out.print(i + " ");
            }
        }
    }
}

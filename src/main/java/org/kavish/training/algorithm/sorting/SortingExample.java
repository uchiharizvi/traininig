package org.kavish.training.algorithm.sorting;

import org.kavish.training.Utils;

import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int[] numbers = Utils.generateRandomNumbersArray(100);
        System.out.println("Original Numbers");
        Arrays.stream(numbers).forEach(num -> System.out.print(" " + num));
        int[] sortedNumbers = BubbleSort.sort(numbers);
        System.out.println();
        System.out.println("Sorted Numbers");
        Arrays.stream(sortedNumbers).forEach(num -> System.out.print(" " + num));
    }
}

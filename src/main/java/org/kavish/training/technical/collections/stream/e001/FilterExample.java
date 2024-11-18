package org.kavish.training.usecase.collections.stream.e001;

import org.kavish.training.utils.NumberUtils;

import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = NumberUtils.generateRandomNumber(1,100, 100);
        filterEvenNumbers(numbers);
        filterOddNumbers(numbers);
    }

    public static void filterEvenNumbers (List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num %2 ==0)
                .forEach(System.out::println);
    }

    public static void filterOddNumbers (List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num %2 !=0)
                .forEach(System.out::println);
    }

}

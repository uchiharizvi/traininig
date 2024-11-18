package org.kavish.training.usecase.collections.stream.e002;

import org.kavish.training.utils.NumberUtils;

import java.util.List;

public class Map_SquareNumbers {
    public static void main(String[] args) {
        square(NumberUtils.generateRandomNumber(35, 50, 10));
    }

    private static void square(List<Integer> numbers) {
        numbers.stream()
                .map(number->number * number)
                .forEach(System.out::println);
    }
}

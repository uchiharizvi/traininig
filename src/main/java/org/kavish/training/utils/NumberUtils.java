package org.kavish.training.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberUtils {
    public static List<Integer> generateRandomNumber(int start, int end, int count) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for(int i=0; i<count;i++) {
            int randomNumber = random.nextInt(end - start + 1) + start;
            randomNumbers.add(randomNumber);
        }
        return randomNumbers;
    }
}

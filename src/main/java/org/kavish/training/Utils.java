package org.kavish.training;

import java.util.Random;

public class Utils {
    public static int generateRandomNumbers(int range) {
        Random random = new Random();
        return random.nextInt(range);
    }

    public static int[] generateRandomNumbersArray(int range) {
        Random random = new Random();
        int[] randomNumbers = new int[range];
        for (int i = 0; i < range; i++) {
            randomNumbers[i] = random.nextInt(range);
        }
        return randomNumbers;
    }

}

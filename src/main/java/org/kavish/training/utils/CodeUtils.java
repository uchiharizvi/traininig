package org.kavish.training.utils;

import java.util.Map;

public class CodeUtils {
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    public static <T> void printObject(T data) {
        System.out.println(data.toString());
    }
}

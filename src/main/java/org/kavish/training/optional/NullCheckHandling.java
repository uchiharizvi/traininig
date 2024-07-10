package org.kavish.training.optional;

import java.util.Optional;

public class NullCheckHandling {
    public static void main(String[] args) {
        try{
            String str = null;
            Optional<String> optionalString = Optional.ofNullable(str);
            optionalString.orElseThrow(()->new NullPointerException("Str is null"));
            System.out.println("Executing Try Block");
        }catch (Exception e){
            System.out.println("Exception Occurred " + e.getMessage());
        }
    }
}

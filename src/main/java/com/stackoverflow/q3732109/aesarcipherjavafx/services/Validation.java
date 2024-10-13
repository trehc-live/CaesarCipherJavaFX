package com.stackoverflow.q3732109.aesarcipherjavafx.services;

public class Validation{
    public static boolean valid(String key){
        if (key == null || key.isEmpty())
            return false;

        try {
            Integer.parseInt(key);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


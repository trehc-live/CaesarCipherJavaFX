package com.stackoverflow.q3732109.aesarcipherjavafx.services;

public class CaesarCipher {
    final static String enAlphabet = "abcdefghijklmnopqrstuvwxyz";
    final static String ruAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    final static String digits = "0123456789";

    public static String encrypt(String text, int key){
        char[] encrypted = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            char temp = encrypted[i];

            if((encrypted[i] = moveC(encrypted[i], enAlphabet, key)) != temp ||
                    (encrypted[i] = moveC(encrypted[i], ruAlphabet, key)) != temp ||
                    (encrypted[i] = moveC(encrypted[i], digits, key)) != temp)
                continue;

        }
        return new String(encrypted);
    }

    private static char moveC(char c, String symbols, int key){
        if(symbols.indexOf(c) == -1)
            return c;
        int index = mod(symbols.indexOf(c) + key, symbols.length());
        return symbols.charAt(index);
    }

    private static int mod(int index, int length){
        return index >= 0 ? index % length : (length + index % length) % length;
    }
}


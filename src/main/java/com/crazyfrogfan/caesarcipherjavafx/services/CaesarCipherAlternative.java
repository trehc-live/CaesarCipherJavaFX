package com.crazyfrogfan.caesarcipherjavafx.services;

public class CaesarCipherAlternative {

    public static String encrypt(String text, int key){
        char[] encrypted = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            char temp = encrypted[i];
            encrypted[i] = (char)(encrypted[i] + key);
        }
        return new String(encrypted);
    }
}

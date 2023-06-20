package org.haroldsanchez;

public class Exercises {

    public int charCount(String str, char c) {
        int cont=0;
        for (int i=0; i<str.length();i++){
            if (Character.toLowerCase(c)== str.toLowerCase().charAt(i)) {
                cont++;
            }
        }
        return cont;
    }
}

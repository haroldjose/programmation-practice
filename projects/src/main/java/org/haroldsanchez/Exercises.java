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
    public int numberShort(int[] args){

        int result=args[0];
        for (int i=0;i<args.length;i++){
            result=(args[i]<=result)?args[i]:result;
        }
        return result;
    }

    public String createPhoneNumber(int[] number){

        return "("+number[0]+number[1]+number[2]+")"+number[3]+number[4]+number[5]+"-"+number[6]+number[7]+number[8]+number[9];
    }
}

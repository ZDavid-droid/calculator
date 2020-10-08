package com.company.utils;

public class Converter {
    //private int arabNum;

    public int converterRimToArab(String input){
        int ready = converterRim(input.charAt(0));
        int next = 0;
        if(input.length() < 2){
                return converterRim(input.charAt(0));
        }else{
            for(int i = 1; i < input.length(); i++){
               next =  converterRim(input.charAt(i));
               if(ready >= next){
                   ready += next;
               } else{
                   ready = converterRim(input.charAt(i)) - ready;
               }
            }
        }
       // System.out.println(ready);
            return ready;
    }
    private int converterRim(char rimNum){
        int rimToArabNum = 0;
        switch(rimNum){
            case 'I': {
                rimToArabNum = 1;
                break;
            }
            case 'V': {
                rimToArabNum = 5;
                break;
            }
            case 'X': {
                rimToArabNum = 10;
                break;
            }
        }
        return rimToArabNum;
    }

    public String converterArabToRim(int arab){
        String rez = "";
        int left = arab - 1;
        int middle = arab - 5;
        int right = arab - 10;
        int middleH = arab - 15;
        int rightH = arab - 20;
        int border = 0;
        int near = 0;
        if(left == 0 || middle == 0 || right == 0){
            rez += converterArab(arab);
        }else{
            if(arab < 5){
                near = 1;
                border = left;
            }
            if(arab >= 5 && arab < 9){
                near = 5;
                border = middle;
            }
            if(arab >= 9  && arab <= 13){
                near = 10;
                border = right;
            }

            if(arab > 13 && arab <= 18){
                rez += 'X';
                near = 5;
                border = middleH;
            }
            if(arab > 18){
                rez += 'X';
                near = 10;
                border = rightH;
            }
                rez = convert(border, rez, near);
                //border = Math.abs(border) - 1;
                //System.out.println(border);
        }
        return rez.trim();
    }

    private String convert(int border, String rez, int near){
        if(border < 1){
            //System.out.println("<=1");
            rez += converterArab(Math.abs(border));
            rez += converterArab(near);

        }else{
           // System.out.println("else");
            rez += converterArab(near);
            for(int i = 1 ; i <= border; i++){
                rez += converterArab(Math.abs(1));
            }

        }


       // System.out.println(rez);
        return rez;

    }

    private char converterArab(int arabNum){
        char rimToArabNum = ' ';
        switch(arabNum){
            case 1: {
                rimToArabNum = 'I';
                break;
            }

            case 5: {
                rimToArabNum = 'V';
                break;
            }
            case 10: {
                rimToArabNum = 'X';
                break;
            }
        }
        return rimToArabNum;
    }

}

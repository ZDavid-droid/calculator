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
            //Для тестов
           /* case 'L': {
                rimToArabNum = 50;
                break;
            }
            case 'C':{
                rimToArabNum = 100;
                break;
            }*/
        }
        return rimToArabNum;
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
            case 50: {
                rimToArabNum = 'L';
                break;
            }
            case 100:{
                rimToArabNum = 'C';
                break;
            }
        }
        return rimToArabNum;
    }

}

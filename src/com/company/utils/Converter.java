package com.company.utils;

public class Converter {
    //private int arabNum;
    public int converterRim(char rimNum){
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

    public char converterArab(int arabNum){
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

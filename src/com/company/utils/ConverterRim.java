package com.company.utils;

public class ConverterRim {

    public String converterArabToRim(int arab){
        String rez = "";

        if(arab < 0){
            rez += '-';
            arab = Math.abs(arab);
        }
        if(arab == 1 || arab == 5 || arab == 10 || arab == 50 || arab == 100){
            rez += converterArab(arab);
        }else{
            rez  += convert(0, rez, arab);
        }
        return rez.trim();
    }

    private String convert(int border, String rez, int arab){

        if(arab <= 3){
            for(int i = 0; i < arab; i++){
                rez += converterArab(1);
            }
            return rez;
        }

        if(arab >= 4 && arab < 9){

            int numOne =  arab - 5;

            if(numOne >= 1){
                rez = converterArab(5) + convert(0, rez, numOne);
            }else{
                rez = convert(0, rez, Math.abs(numOne)) + converterArab(5);
            }
        }

        if(arab >= 9 && arab < 40){
            int numOne = arab - 10;
            if(numOne >= 1){
                rez = converterArab(10) + convert(0, rez, numOne);
            } else{
                rez = convert(0, rez, Math.abs(numOne)) + converterArab(10);
            }
        }

        if(arab >= 40 && arab < 90){
            int numOne = arab - 50;
            if(numOne >= 1){
                rez = converterArab(50) + convert(0, rez, numOne);
            }else{
                rez =  "X" + converterArab(50) + convert(0, rez, Math.abs(numOne + 10));
            }
        }

        if(arab >= 90 && arab < 100){
            //System.out.println(arab);
            int numOne = arab - 90;
            if(numOne >= 1){
                rez = "X" + converterArab(100) + convert(0, rez, numOne);
            }
            else{
                rez = "X" + convert(0, rez, Math.abs(numOne)) + converterArab(100);
            }
        }
        return rez;
    }

    private char converterArab(int arabNum) {
        char rimToArabNum = ' ';
        switch (arabNum) {
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

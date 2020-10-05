package com.company;

import com.company.mathoperation.MathOperation;
import com.company.model.Expression;
import com.company.utils.Calculation;
import com.company.utils.Converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaunchCalc {
    private int a;
    private int b;
    Converter converter = new Converter();
    Expression expr = new Expression();
    Calculation calculate = new Calculation();
    public void launchCalc() throws IOException {
        int rez = 0;
        double r = 0.0;
        System.out.println("Enter math expressison:");
        while(true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String expression = reader.readLine();
            String[] rezParse = parse(expression);
           expr.setA(Integer.parseInt(rezParse[0]));
           expr.setB(Integer.parseInt(rezParse[2]));
           expr.setSign(rezParse[1].charAt(0));
           if(expr.getSign() != '/'){
             rez = calculate.calculate(expr);
             System.out.println(rez);
           } else{
               r = calculate.subtraction(expr);
               System.out.println(r);
           }





           /* for(int i = 0; i < rezParse.length; i++){
                System.out.println(rezParse[i]);
            }
            a = Integer.parseInt(rezParse[0]);
            b = Integer.parseInt(rezParse[2]);
            if(rezParse[1].contentEquals("+")){
                rez = MathOperation.Sum(a, b);
            }*/


            if(expression.contains("e")){
                break;
            }

            System.out.println("Exception");
        }

    }

    private String[] parse(String input){
        String delims = "[ ]+";
        return input.split(delims);
    }

}

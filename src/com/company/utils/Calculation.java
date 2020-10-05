package com.company.utils;

import com.company.mathoperation.MathOperation;
import com.company.model.Expression;

public class Calculation {
    public int calculate(Expression expr){
        int rezCalc = 0;
        switch(expr.getSign()){
            case '+':
                rezCalc = MathOperation.Sum(expr.getA(), expr.getB());
               break;
            case '-':
                rezCalc = MathOperation.Subtraction(expr.getA(), expr.getB());
                break;
            case '*':
                rezCalc = MathOperation.Mul(expr.getA(), expr.getB());
                break;
        }
        return rezCalc;
    }

    public double subtraction(Expression expr){
        return MathOperation.Del(expr.getA(), expr.getB());
    }
}

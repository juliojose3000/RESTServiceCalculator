package com.restcalculator.inheritance;

//Author: Julio Segura
public class Division extends Operation{

    public Division(double x, double y) {
        super(x, y, '/');
        if(y==0) setResult(0); //It can't divide by 0
        else setResult(x/y);
    }

}

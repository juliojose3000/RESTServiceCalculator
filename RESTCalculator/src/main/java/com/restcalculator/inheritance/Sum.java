package com.restcalculator.inheritance;


//Author: Julio Segura
public class Sum extends Operation{

    public Sum(double x, double y) {
        super(x, y, '+');
        setResult(x + y);
     
    }

}

package com.restcalculator.inheritance;


//Author: Julio Segura
public class Subtraction extends Operation{

    public Subtraction(double x, double y) {
        super(x, y, '-');
        this.setResult(x - y);
    }
    
}

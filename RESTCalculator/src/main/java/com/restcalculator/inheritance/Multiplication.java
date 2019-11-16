package com.restcalculator.inheritance;

//Author: Julio Segura
public class Multiplication extends Operation{
   
    public Multiplication(double x, double y) {
        super(x, y, '*');
        this.setResult(x * y);
    }

}

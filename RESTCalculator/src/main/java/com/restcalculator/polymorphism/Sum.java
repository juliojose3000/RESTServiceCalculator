package com.restcalculator.polymorphism;


//Author: Julio Segura
public class Sum extends Operation{

    @Override
    public void calcular(double x, double y) {
         setResult(x + y);
    }

}

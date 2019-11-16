package com.restcalculator.polymorphism;

//Author: Julio Segura
public abstract class Operation {
	
	double result;

    public abstract void calcular(double x, double y);
    
	public abstract double getResult();

	public abstract void setResult(double result);
    
    
}
    

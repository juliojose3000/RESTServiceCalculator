package com.restcalculator.polymorphism;

//Author: Julio Segura
public abstract class Operation {
	
	double result;

    public abstract void calcular(double x, double y);
    
	public void setResult(double result) {
		this.result = result;
	}
    
    
}
    

package com.restcalculator.polymorphism;


//Author: Julio Segura
public class Division extends Operation{

    @Override
    public void calcular(double x, double y) {
    	if(y==0) setResult(0);  //It can't divide by 0
    	else setResult(x / y);   	
    }

	@Override
	public double getResult() {
		return result;
	}

	@Override
	public void setResult(double result) {
		this.result = result;
	}
    
}

package com.restcalculator.polymorphism;


//Author: Julio Segura
public class Subtraction extends Operation{

    @Override
    public void calcular(double x, double y) {
    	setResult(x - y);
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

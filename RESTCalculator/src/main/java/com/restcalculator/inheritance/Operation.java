package com.restcalculator.inheritance;

//Author: Julio Segura
public class Operation {
  
  double x;
  double y;
  double result;
  char operation;

  public Operation(double x, double y, char operation) {
      this.x = x;
      this.y = y;
      this.operation = operation;
  }
  
  public double showResult(){
      
      return this.result;
      
  }
  

  public double getResult() {
      return result;
  }

  public void setResult(double result) {
      this.result = result;
  }
  
}
  
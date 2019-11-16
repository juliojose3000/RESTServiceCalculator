package com.restcalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restcalculator.polymorphism.*;

@RestController
@CrossOrigin
public class MathOperationsWithPolymorphismController {
	
	  Operation operation;
	
	  @RequestMapping(method = RequestMethod.GET, value="/calculator/polymorphism/mul")
	  public Operation multiplication(@RequestParam double x, @RequestParam double y) {
		  
		  operation = new Multiplication();
		  
		  operation.calcular(x, y);
		  
		  return operation;
		  
	  }
	  
	  @RequestMapping(method = RequestMethod.GET, value="/calculator/polymorphism/div")
	  public Operation division(@RequestParam double x, @RequestParam double y) {
		  
		  operation = new Division();
		  
		  operation.calcular(x, y);
		  
		  return operation;
		  
	  }
	  
	  @RequestMapping(method = RequestMethod.GET, value="/calculator/polymorphism/sum")
	  public Operation sum(@RequestParam double x, @RequestParam double y) {
		  
		  operation = new Sum();
		  
		  operation.calcular(x, y);
		  
		  return operation;
		  
	  }
	  
	  @RequestMapping(method = RequestMethod.GET, value="/calculator/polymorphism/sub")
	  public Operation subtraction(@RequestParam double x, @RequestParam double y) {
		  
		  operation = new Subtraction();
		  
		  operation.calcular(x, y);
		  
		  return operation;
		  
	  }

}

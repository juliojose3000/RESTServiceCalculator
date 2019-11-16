package com.restcalculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restcalculator.autentication.JwtResponse;
import com.restcalculator.inheritance.Division;
import com.restcalculator.inheritance.Multiplication;
import com.restcalculator.inheritance.Operation;
import com.restcalculator.inheritance.Subtraction;
import com.restcalculator.inheritance.Sum;


@RestController
@CrossOrigin
public class MathOperationsWithInheritanceController {
	
	  Operation operation;

	  @RequestMapping(method = RequestMethod.GET, value="/calculator/inheritance/mul")
	  public Operation multiplication(@RequestParam double x, @RequestParam double y) {
		  
		  operation = new Multiplication(x, y);
		  
		  return operation;
	  }
	  
	  @RequestMapping(method = RequestMethod.GET, value="/calculator/inheritance/div")
	  public Operation division(@RequestParam double x, @RequestParam double y) {
		  
		  operation = new Division(x, y);

		  return operation;
		  
	  }
	  
	  
	  @RequestMapping(method = RequestMethod.GET, value="/calculator/inheritance/sum")
	  public Operation sum(@RequestParam double x, @RequestParam double y) {
		  
		  operation = new Sum(x, y);
		  
		  return operation;
		  
	  }
	  
	  @RequestMapping(method = RequestMethod.GET, value="/calculator/inheritance/sub")
	  public Operation Subtration(@RequestParam double x, @RequestParam double y) {
		  
		  operation = new Subtraction(x, y);
		  
		  return operation;
		  
	  }
	  
	

}

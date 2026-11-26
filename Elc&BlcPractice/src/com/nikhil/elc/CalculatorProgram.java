package com.nikhil.elc;

import com.nikhil.blc.Calculator;

public class CalculatorProgram {

	public static void main(String[] args) {
		
		 int add = Calculator.add(25, 10);
		 int sub = Calculator.sub(15, 20);
		 int mul=Calculator.mul(5, 15);
		 double div=Calculator.div(50, 10);
		 
		 IO.println(mul);
		 IO.println(div);
		 
				 IO.println(add);
				IO.println(sub);
			
	}

}

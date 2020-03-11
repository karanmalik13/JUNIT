package junitdemo;

public class Calculator {
	public double add(double a,double b){
		return (a+b);
	}
	public double subtract(double a,double b){
		return (a-b);
	}
	public double multiply(double a,double b){
		return (a*b);
	}
	public double divide(double a,double b){
		if(b==0){
			throw new ArithmeticException("Error: Attempting to dividew by zero");
		}
		return (a/b);
	}
	
	public static void main(String args[])
	{
		Calculator c=new Calculator();
		c.add(4, 8);
		c.subtract(10, 3);
		c.multiply(5, 3);
		c.divide(20, 5);
		
	}

}


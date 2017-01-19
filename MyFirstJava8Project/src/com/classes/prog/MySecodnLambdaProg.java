package com.classes.prog;

public class MySecodnLambdaProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface addition = (a,b) -> a + b;
		
		MyInterface multiplication = (int a,int b) -> a * b;
		
		MyInterface division = (a,b) -> {
			if(b == 0) return 0;
			return a/b;
		};
		
		MyInterface subtraction = (a,b) -> {
			return a - b;
		};
		
		System.out.println("Addition-->" + addition.oprerations(2, 3));
		System.out.println("Multiplication-->" + multiplication.oprerations(2, 3));
		System.out.println("Division-->" + division.oprerations(2, 3));
		System.out.println("Subtraction-->" + subtraction.oprerations(2, 3));
		
	}
}

interface MyInterface{
	public int oprerations(int a,int b);
}
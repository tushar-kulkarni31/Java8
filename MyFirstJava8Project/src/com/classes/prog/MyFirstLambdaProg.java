package com.classes.prog;

import com.classes.impl.GreetingsImpl;
import com.interfaces.Greetings;

public class MyFirstLambdaProg {

	public void wishGreetings(Greetings greetings){
		greetings.wishGreetings();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyFirstLambdaProg prog = new MyFirstLambdaProg();
		prog.wishGreetings();*/
		
		Greetings greetings = new Greetings() {
			
			@Override
			public void wishGreetings() {
				// TODO Auto-generated method stub
				System.out.println("Hello World!");
			}
		};
		greetings.wishGreetings();
		
		Greetings greetings1 = new GreetingsImpl();
		greetings1.wishGreetings();
		
		MyFirstLambdaProg prog = new MyFirstLambdaProg();
		prog.wishGreetings(greetings1);
		
		Greetings greetings2 = () -> System.out.println("Hello World!");
		prog.wishGreetings(greetings2);
	}

}

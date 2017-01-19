package com.classes.prog;

public class MyThirdLambdaProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread runnnableThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("runnnableThread running");
			}
		});
		
		Runnable lambdaRunnable = () -> {
			System.out.println("lambdaThread running");
		};
		
		Thread lambdaThread = new Thread(lambdaRunnable);
		
		runnnableThread.start();
		lambdaThread.start();
	}

}

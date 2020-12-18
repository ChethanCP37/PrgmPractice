package com.qa.prgm;

public class ThreadClassExample1 implements Runnable {

	public void run() {
		System.out.println("Thread has started");
	}
	public static void main(String[] args) {
		ThreadClassExample1 thClass = new ThreadClassExample1();
		Thread th= new Thread(thClass);
		th.start();
		
	}

}

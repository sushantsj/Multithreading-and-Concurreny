package com.sushant.thread;

/**
 * 
 * @author Sushant
 * We wil create a thread by extending the thread class
 * If we use this way then our class canoot be extending with any other class.
 *
 */
public class FirstThread extends Thread{
	
	 int number;
	
	public FirstThread(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(i + " Thread number: " + number);
		}
	}
}

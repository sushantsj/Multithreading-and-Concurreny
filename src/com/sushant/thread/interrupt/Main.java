package com.sushant.thread.interrupt;

/**
 * 
 * @author Sushant
 *
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread threadobj = new Thread(new MyInterrupt());
		threadobj.start();
		Thread.sleep(3000);
		threadobj.interrupt();
		//Comment the Thread.sleep on line 13 and add below to check interrupted method.
		//Thread.sleep(3000);
		System.out.println(threadobj.isInterrupted());

	}

}

package com.sushant.thread.interrupt;

/**
 * 
 * @author Sushant
 *
 */
public class MyInterrupt implements Runnable{

	@Override
	public void run() {
		for (int i=1;i<=100;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;//This is how interrupt exception is handled most cases.
				// As we dont want ot wun the entire loop.
			}
			
			//nstead of using Thread.sleep we can use interrupted method as shown below
			/**
			 * if (Thread.interrupted() {
			 * break;
			 * }
			 * This is done without using the current reference object and its flag is set to false after method iterrupted.
			 */
		}
	}
}

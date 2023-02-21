package com.sushant.thread.sleep;

/**
 * 
 * @author Sushant
 *
 */
public class Main {

	public static void main(String[] args) {
		//Here we make use of thread.sleep method to pause our thread and then continue after a particular time.
		for(int i=1;i<=10;i++) {
			System.out.println("Main thread is printing: " + i);
			if(i==5) {
				System.out.println("Pausing the main thread for 3 seconds");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

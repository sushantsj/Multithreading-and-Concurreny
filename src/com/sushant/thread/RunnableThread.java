package com.sushant.thread;

/**
 * 
 * @author Sushant
 *Here we will create thread by implementing Runnable interface
 *If we use this way then we can use other interfaces if required.
 *and we have to create another thread class and pass the runnable class to its agument ot execute it.
 */
public class RunnableThread implements Runnable{
	
	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}

package com.sushant.thread;

/**
 * 
 * @author Sushant
 *
 */
public class ThreadBasics {

	
	public static void main(String[] args) {
		// e will get the name of the thread which is created by jvm automatically when it runs.
		System.out.println(Thread.currentThread().getName());
		
		for(int count = 1;count<=3;count++) { //Now all the threads will run at the same time but in random order,
			// we can fix the random order by providing each thread with priority number.
		FirstThread thread = new FirstThread(count);
		thread.start();
		//thread.run() if we call this instead of start then threads executes one by one not simultaneously
		}
		RunnableThread thread2 = new RunnableThread();
		Thread thread = new Thread(thread2); // creating a thread object for runnable class
		thread.start(); //When we use runnable interface way we have to create 
		//another thread class to execute its method but not in case of thread class 
	}

}

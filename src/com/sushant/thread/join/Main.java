package com.sushant.thread.join;

/**
 * 
 * @author Sushant
 *
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] marks = new int[10];
        Thread marksThread = new Thread(new Marks(marks));
        Thread avgThread = new Thread(new Average(marks));
        /**
         * If we run this without join method both the threads started randomly and gives incorrect 
         * value to fix this we have to wait for marks thread to complete and then start the average thread.
         */
        marksThread.start();
        marksThread.join();
        avgThread.start();
    }
}

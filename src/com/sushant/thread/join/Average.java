package com.sushant.thread.join;

/**
 * 
 * @author Sushant
 *
 */
public class Average implements Runnable {
    int[] marks;
    public Average(int[] marks) {
        this.marks = marks;
    }

    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i<10; i++) {
            System.out.println("Adding mark: " + marks[i]);
            sum = sum + marks[i];
        }

        System.out.println("Average " + sum/10);
    }
}

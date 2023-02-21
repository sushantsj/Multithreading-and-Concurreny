package com.sushant.thread.challenge2;

/**
 * Contains code that represents the voting process.
 * It will keep track of what cake designs are getting votes.
 */

/**
 * 
 * @author Sushant
 *
 */
public class VotingRunnable implements Runnable {

	private Design d;
	protected boolean doStop = false;

	public VotingRunnable(Design d) {
		this.d = d;
	}

	@Override
	public void run() {
		// Ch03-Step 4 - Surround the code in a while loop
		while (!doStop) {
			
			System.out.println("Voting going on for design " + d.getName());
			d.getVotes().add(1L);

			/*
			 * Ch03-Step 1 - Generate a random number To generate a random number between 0
			 * & 1000 - consider using: Math.random() * 1000
			 */
			Double randomNumber = Math.random() * 1000;

			// Ch03-Step 2 - Pause the thread for this random amount of time
			try {
				Thread.sleep(randomNumber.longValue());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

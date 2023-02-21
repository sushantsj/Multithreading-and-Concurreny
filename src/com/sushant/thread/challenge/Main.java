package com.sushant.thread.challenge;

/**
 * 
 * @author Sushant
 * Here we will create two threads one to count the vote and one to get the candidates to vote
 *
 */
public class Main {
    public static void main(String[] args) {
        Design d1 = new Design(1,"D1");
        // Ch02-Step 5 - Create an object of the VotingRunnable & CountingRunnable for design1
        CountingRunnable threadCount = new CountingRunnable(d1);
        VotingRunnable threadVote = new VotingRunnable(d1);

        // Ch02-Step 6.1 - Create a new Thread instance, passing in the VotingRunnable object for design1
        Thread threadv = new Thread(threadVote);

        // Ch02-Step 6.2 - Create a new Thread instance, passing in the CountingRunnable object for design1
        Thread threadc = new Thread(threadCount);

        // Ch02-Step 7.1 - Start the voting thread for design1
        threadv.start();
        // Ch02-Step 7.2 - Start the counting thread for design1
        threadc.start();

        Design d2 = new Design(2,"D2");
        // Ch02-Step 5 - Create an object of the VotingRunnable & CountingRunnable for design2
        CountingRunnable threadCount2 = new CountingRunnable(d2);
        VotingRunnable threadVote2 = new VotingRunnable(d2);
        // Ch02-Step 6.1 - Create a new Thread instance, passing in the VotingRunnable object for design2
        Thread threadv2 = new Thread(threadVote2);
        // Ch02-Step 6.2 - Create a new Thread instance, passing in the CountingRunnable object for design2
        Thread threadc2 = new Thread(threadCount2);

        // Ch02-Step 7.1 - Start the voting thread for design2
        threadv2.start();
        // Ch02-Step 7.2 - Start the counting thread for design2
        threadc2.start();

        Design d3 = new Design(3,"D3");
        // Ch02-Step 5 - Create an object of the VotingRunnable & CountingRunnable for design3
        CountingRunnable threadCount3 = new CountingRunnable(d3);
        VotingRunnable threadVote3 = new VotingRunnable(d3);
        // Ch02-Step 6.1 - Create a new Thread instance, passing in the VotingRunnable object for design3
        Thread threadv3 = new Thread(threadVote3);
        // Ch02-Step 6.2 - Create a new Thread instance, passing in the CountingRunnable object for design3
        Thread threadc3 = new Thread(threadCount3);

        // Ch02-Step 7.1 - Start the voting thread for design3
        threadv3.start();
        // Ch02-Step 7.2 - Start the counting thread for design3
        threadc3.start();
    }
}

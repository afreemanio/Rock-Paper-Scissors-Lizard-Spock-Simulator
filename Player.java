/* Copyright (C) 2021 Andrew Freeman
 This file is part of Rock-Paper-Scissors-Lizard-Spock-Simulator.

 Rock-Paper-Scissors-Lizard-Spock-Simulator is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Rock-Paper-Scissors-Lizard-Spock-Simulator is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

You should have received a copy of the GNU General Public License
*/


package rockPaperScissorLizardSpock;

import java.util.Random;

import static rockPaperScissorLizardSpock.RockPaperScissorLizardSpock.numToWord;


public class Player implements Runnable{
    private Thread myThread;
    private String myThreadName;
    private int myDecisionNum;
    private Random myRandom = new Random();

    //creates the thread with the name provided (player1/player2, could be anything though).
    Player(String myName){
        myThreadName = myName;
        System.out.println("Created thread " + myThreadName);
    }

    //because Player implements Runnable, this runs automatically after start(), synchronized to time between the two
    //players (allows for wait()).
    public synchronized void run(){
        while(true){
            try {
                wait();
            } catch (InterruptedException e) { //add custom exception here
                System.out.println("Waiting exception in " + myThreadName);
                e.printStackTrace();
            }
            myDecisionNum = myRandom.nextInt(5) + 1; //decides number
            System.out.println(myThreadName + " is planning on throwing " + myDecisionNum +
                    " (" + numToWord(myDecisionNum) + ")");
            notify(); //notifies other thread to go too
        }

    }

    //run this to start thread
    public void start() {
        System.out.println("Running start() in thread " + myThreadName);
        if (myThread == null){ //if no thread for this object, make a new thread
            myThread = new Thread (this, myThreadName);
            myThread.start();
        }
    }


    //called in main, gets the value from each
    public synchronized int getMyDecisionNum(){
        System.out.println("The thread " + myThreadName + " is starting getMyDecisionNum");
        System.out.println("The thread " + myThreadName + " is waiting to make a decision now.");
        notify();
        System.out.println("The thread " + myThreadName + " is waiting for both threads to decide.");

        try {
            wait(); //its like a gate, wait for both players to choose, then when one goes through this wait(),
            //it tells the other to go too, so they go at the same time.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll(); //so they go at the same time
        System.out.println("The thread " + myThreadName + " is returning value " + myDecisionNum);
        return myDecisionNum;
    }
}

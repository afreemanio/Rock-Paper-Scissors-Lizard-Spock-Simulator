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

Name: Andrew Freeman
Date of Last Update: May 1, 2020

RockPaperScissorLizardSpock

Requires:
    RockPaperScissorLizardSpock.java
    Decision.java (optional)
    Player.java

This is a program simulating a game of RockPaperScissorLizardSpock between two players. Each player is represented by
a thread, which independantly calculate their values (think of what move to play), then throw at the same time to get a result.
The results of each round and statistics about the game are collected and used at the end of the game, going up to
4 wins each (can be changed by the upTo integer).

*/


package rockPaperScissorLizardSpock;

public class RockPaperScissorLizardSpock {

    int upTo = 4;


    //tester for the class
    void tester(){
        int result = 0;
        int decision1;
        int decision2;
        int player1wins = 0;
        int player2wins = 0;

        System.out.println("Start of RockPaperScissor :)");
        System.out.println("Testing player:");
        Player player1 = new Player("player1");
        player1.start();
        Player player2 = new Player("player2");
        player2.start();


        for (int i = 0; i < 100; i++){
            if (player1wins >= upTo || player2wins >= upTo){
                break;
            }
            try { //delay in main for calling threads to start every iteration, so theres time to read
                    Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Main thread sleep error");

                e.printStackTrace();
            }
            decision1 = player1.getMyDecisionNum();
            decision2 = player2.getMyDecisionNum();
            System.out.println("Player 1 throws!");
            System.out.println("Player 2 throws!");

            result = whoWins(decision1, decision2);
            System.out.println(" \n\nResult: ");
            System.out.println("Player 1 chose " + numToWord(decision1));
            System.out.println("Player 2 chose " + numToWord(decision2));
            switch (result){
                case 1:
                    player1wins++;
                    System.out.println(numToWord(decision1) + " beats " + numToWord(decision2));
                    System.out.println("The winner is player " + result);
                    break;
                case 2:
                    player2wins++;
                    System.out.println(numToWord(decision2) + " beats " + numToWord(decision1));
                    System.out.println("The winner is player " + result);
                    break;
                case 0:
                    System.out.println("Tie, there is no winner this round");
                    break;
                default:
                    System.out.println("Error: no winner?");
            }
            System.out.println("\nPlayer 1 is at " + player1wins + " wins");
            System.out.println("Player 2 is at " + player2wins + " wins");
        }

        System.out.println("Game over!");
        System.out.println("Results: ");
        System.out.println("Player 1 won " + player1wins + " times.");
        System.out.println("Player 2 won " + player2wins + " times.");
        if (player1wins >= player2wins){
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }


    }

    public static void main(String[] args) {
        RockPaperScissorLizardSpock game = new RockPaperScissorLizardSpock();
        game.tester(); //tests here
    }

    //determines who wins, based on input values of player1 and player2
    //0 if tie, 1 if player 1, 2 if player 2
    static int whoWins(int first, int second) {
        int winner = 0;
        //1 = rock
        //2 = paper
        //3 = scissors
        //4 = lizard
        //5 = spock
        switch (first) { //holy moly this took like half an hour to type
            case 1: //if first is rock
                switch (second) {
                    case 1: //if second is rock
                        winner = 0; //tie
                        break;
                    case 2: //if second is paper
                        winner = 2; //paper wins
                        break;
                    case 3: //if second is scissors
                        winner = 1; //rock wins
                        break;
                    case 4: // if second is lizard
                        winner = 1; //rock wins
                        break;
                    case 5: // if second is spock
                        winner = 2; //spock wins
                        break;
                    default:
                        winner = -1;
                }
                break;
            case 2: // if first is paper
                switch (second) {
                    case 1: //if second is rock
                        winner = 1; //paper wins
                        break;
                    case 2: //if second is paper
                        winner = 0; //tie
                        break;
                    case 3: //if second is scissors
                        winner = 2; //scissors win
                        break;
                    case 4: // if second is lizard
                        winner = 2; //lizard eats paper lizard wins
                        break;
                    case 5: // if second is spock
                        winner = 1; //paper disproves spock paper wins
                        break;
                    default:
                        winner = -1;
                }
                break;
            case 3: // if first is scissors
                switch (second) {
                    case 1: //if second is rock
                        winner = 2; //rock wins
                        break;
                    case 2: //if second is paper
                        winner = 1; //scissors win
                        break;
                    case 3: //if second is scissors
                        winner = 0; //tie
                        break;
                    case 4: // if second is lizard
                        winner = 1; //scissors decapitate lizard scissors win
                        break;
                    case 5: // if second is spock
                        winner = 2; //spock smashes scissors spock wins
                        break;
                    default:
                        winner = -1;
                }
                break;
            case 4: // if first is lizard
                switch (second) {
                    case 1: //if second is rock
                        winner = 2; //rock crushes lizard rock wins
                        break;
                    case 2: //if second is paper
                        winner = 1; //lizard eats paper lizard wins
                        break;
                    case 3: //if second is scissors
                        winner = 2; //scissors kill lizard scissors wins
                        break;
                    case 4: // if second is lizard
                        winner = 0; //tie
                        break;
                    case 5: // if second is spock
                        winner = 1; //lizard poisons spock lizard wins
                        break;
                    default:
                        winner = -1;
                }
                break;
            case 5: // if first is spock
                switch (second) {
                    case 1: //if second is rock
                        winner = 1; //spock vaporizes rock spock wins
                        break;
                    case 2: //if second is paper
                        winner = 2; //paper disproves spock paper wins
                        break;
                    case 3: //if second is scissors
                        winner = 1; //spock smashes scissors spock wins
                        break;
                    case 4: // if second is lizard
                        winner = 2; //lizard poisons spock lizard wins
                        break;
                    case 5: // if second is spock
                        winner = 0; //tie
                        break;
                    default:
                        winner = -1;
                }
                break;
            default:
                winner = -1;
        }

        return winner;
    }

    //translates the number (1-5) to the word it corresponds to (rock-spock)
    static String numToWord(int x) {
        String returnVal = "";
        switch (x) {
            case 1:
                returnVal = "Rock";
                break;
            case 2:
                returnVal = "Paper";
                break;
            case 3:
                returnVal = "Scissors";
                break;
            case 4:
                returnVal = "Lizard";
                break;
            case 5:
                returnVal = "Spock";
                break;
            default:
                returnVal = "Error, incorrect input";
        }
        return returnVal;
    }
}
package com.company;

public class Main {
    //declaring variable name so we can access it in the program
    public static int myScore;

    public static void main(String[] args) {
	// write your code here
        //Creating variable

        myScore=1000;
        System.out.println("Setting the score to: "+myScore);
        displayScore();
        changeScore(100);


    }
    // change the score of the game and output it in console
    //creating public method to access it in the program
    public static void changeScore( int Scoredelta)
    {
        System.out.println("Changing the score by: "+ Scoredelta);
     myScore = myScore+Scoredelta;
     displayScore();
    }
    public static void displayScore()
    {
        System.out.println("Player score: "+ myScore);
    }
}

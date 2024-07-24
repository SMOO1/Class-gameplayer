/*
Name: Sasha M.
Program name: GamePlayer class
Purpose: class that provides functionality for the Game class
Date: 05/28/2024
*/

import java.util.Random; //importing random to generate random integers

public class GamePlayer { //class GamePlayer
    int lowVal;  //initializing variables along with the random class
    int highVal;
    int moveVal;
    int winsCount;
    Random random;

    // initialize the object variables (constructor)
    public GamePlayer(int lowVal, int highVal) { //accepting the parameters
        this.lowVal = lowVal; 
        this.highVal = highVal;  
        this.moveVal = 0; //setting default values for move and count values
        this.winsCount = 0;
        this.random = new Random();
    }

    //get the move value
    public int getMoveValue() {
        return this.moveVal;
    }

    //generate a move value
    public void move() {
        this.moveVal = random.nextInt(highVal-lowVal+1)+lowVal; //generating a random integer between the lowVal and highVal
    }

    // get the number of wins
    public int getWins() {
        return this.winsCount;
    }

    // update the wins count
    public void win() {
        this.winsCount+=1;
    }

}//end of class GamePlayer

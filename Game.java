// The "Game" class.
import java.util.*; 

public class Game {
     public static void main (String[] args) {         
          Scanner sc= new Scanner(System.in); //System.in is a standard input stream            
          GamePlayer player1, player2;  
          
          // Constructs each object
          player1 = new GamePlayer(1, 10);  //constructs object that returns that a move value between 1 & 10  
          player2 = new GamePlayer(1, 10);      //constructs object that returns that a move value between 1 & 10  
          
          // Play 10 rounds or until the player quits
          for (int idx = 0; idx < 10; idx++) {
               
               // Players make their move - move produces a random move value for each player
               player1.move(); //player 1 move
               player2.move(); //player 2 move
                 
               // Display Results fron the Round
               System.out.println("\n** Round: " + (idx+1) + "\n");
               System.out.println (" Player 1 Move: " + player1.getMoveValue() + " Player 2 Move: " + player2.getMoveValue());
               System.out.println();
               
               // Who won the round
               if (player1.getMoveValue() == player2.getMoveValue()) {
                    // It's a tie
                    System.out.println ("Tie Round");
               }
               else if (player1.getMoveValue() > player2.getMoveValue()) {
                    //Player 1 Wins
                    System.out.println("Player 1 wins round");
                    player1.win();  //Update Player 1 score
               }
               else {
                    //Player 2 Wins
                    System.out.println("Player 2 wins round");
                    player2.win();  //Update Player 2 score
               }
               
               // Display the game results of the round
               System.out.println("\n** Results after " + idx+1 + " Round(s) **\n");
               System.out.println (" Player 1 Rounds Won: " + player1.getWins());
               System.out.println (" Player 2 Rounds Won: " + player2.getWins());
               
               // Pause to show the user the result or allow player to quit
               System.out.println("Q to quit or any other character to continue");
               if (sc.nextLine().trim().equalsIgnoreCase("Q")) { 
                    System.out.println("Quitting game\n");
                    break;
               }          
          } // end of loop for 10 rounds
          
          // Declare the game winner
          if (player1.getWins() == player2.getWins()) {
               // It's a tie
               System.out.println ("Tie game");
          }
          else if (player1.getWins() > player2.getWins()) {
               //Player 1 Wins
               System.out.println("Player 1 wins the game");
          }
          else {
               //Player 2 Wins
               System.out.println("Player 2 wins the game");
          }
     } // main method
} // Game class

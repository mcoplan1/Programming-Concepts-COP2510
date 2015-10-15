//*******************************************************
//	Matthew Coplan
//	Nim.java
// 
//	A Nim game that is played by two persons with a row of coins. 
//*******************************************************
import java.util.Scanner;

public class Nim
{
    //instance data
    private int nCoins = 21;
    private int player =  1;
 
  //----------------------------------------------
  //Constructor -- initializes nCoins and player
  //----------------------------------------------

    public Nim(int coins, int starter)
    {
	
	// add your code here
      nCoins = coins;
      player = starter;
      
       if (starter > 2 || starter < 1)
         {
         System.out.println("Invalid Input, player 1 is assigned to be first");
         player = 1;
         }
         else
            player = starter;

      
      if (nCoins < 7 || nCoins > 21)
         {
         System.out.println("Invalid input, 21 coins is assigned to your game.");
         nCoins = 21;
         }
         else
            nCoins = coins;
    }

  //----------------------------------------------
  //Removes coins from the row.
  //----------------------------------------------

    public void takeCoins(int remove)
    {
	// add your code here
   
          
      if (remove >= nCoins)
            {
            System.out.println("You can only remove "+ nCoins + " or less from the row");
            }
         
      if (remove < 0 || remove > 3)
            {
            System.out.println("You can only remove one, two, or three from the row.");
            }

      
      if ( player == 1) 
            {
            nCoins = nCoins - remove;
            player = 2;
            }
            else
               {
               nCoins = nCoins - remove;
               player = 1;
               }
          
     
    }



  //----------------------------------------------
  // Display the game status.
  //----------------------------------------------
    public void gameStatus()
    {
	System.out.println("Number of coins left: " + nCoins);
	System.out.println();
	System.out.print("Player" + player + ", ");
    }

  //----------------------------------------------
  // Returns nCoins.
  //----------------------------------------------
  
    public int getCoins()
    {
	return nCoins;
    }

  //----------------------------------------------
  // Returns player.
  //----------------------------------------------
  
    public int getPlayer()
    {

	return player;
    }

}

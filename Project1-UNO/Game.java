import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
/**
 * 
 */

/**
 * @author Dad
 *
 */
public class Game
{
	
	//gameDirection
	//set number of card to players hand
	//get information about players and store it
	//set Card color
	//StartGame(get player inforamation, set number of card player has, direction of player)
	int score = 0;
	final int startCard = 7;
	static int playerNum = 0;
	static String playerName;

	static String option;
	
	ArrayList<ArrayList<Card>> playerDeck; //every players deck is an array list of uno cards 

	Card topCard; // displays top card on discard pile
	int choice; //index of options (i.e. 1 - red 5)
	
	
	static Scanner scnr = new Scanner (System.in);
	
	/**
	 * @param args
//	 */
	
//		
//	Player player = new Player(0);
//	player.getPlayerName();
//	
//	//public String[] getPlayers() {
//		return players;
	
	
	
	//inialized enter the number of players
	//set the name of each player to a number 
	public static void gameStart() {
		
		System.out.println("Enter 'S' to start Uno Game or enter 'Q' to Quit");
	
		option = scnr.nextLine();
		
		System.out.println("user input " + option);

		
		while(option != "Q") {
			
			System.out.println("inside while loop \n");
			try 
			{
				System.out.println("Enter the number of Players playing Uno");
				playerNum = scnr.nextInt();
				if(playerNum == 1) 
				{
					System.out.println("Number of Players has to be 2 or more. Try again\n");
				}
				else if (playerNum > 10) {
					System.out.println("Too many players! Only 2-10 players can play! Try again. \n");
			
				}
				else{ 
					System.out.println("User entered the correct number of players \n");
					for(int j = 1; j < playerNum + 1; j++) {
						System.out.print("Enter name of player " + j + ": ");
						playerName = scnr.next();
						System.out.println();
					}
				}
				
			}
	
//
		catch(InputMismatchException e) 
		{
			System.out.println("Please enter a number!");
			scnr.nextLine();
			playerNum = scnr.nextInt();
		}
//			for(int j = 1; j < playerNum + 1; j++) {
//				
//				System.out.print("Enter name of player " + j + ": ");
//				playerName = scnr.next();
////				System.out.println();
////			}
			break;
		}
//		scnr.close();
		

	}
////		
//		for(int j = 1; i < playerNum + 1; j++) {
//		
//				System.out.print("Enter name of player " + i + ": ");
//				playerName = scnr.next();
//				System.out.println();
//			}
//			scnr.close();
//		}
//	}
		
//	}
//	draw(7, playerDeck);

	//Method playerTurn
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		gameStart();
	}

}

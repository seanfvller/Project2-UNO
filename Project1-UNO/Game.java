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
	
	//Fields
	final int startCard = 7;
	static int playerNum = 0;
	static String playerName;
	
	Card deck;

	static String option;
	
	ArrayList<ArrayList<Card>> playerDeck; //every players deck is an array list of uno cards 
	ArrayList<Card> discardPile;

	Card topCard; // displays top card on discard pile
	int choice; //index of options (i.e. 1 - red 5)
	boolean gameDirection; //variable to keep track of game direction
	
	static Scanner scnr = new Scanner (System.in);
	
	/**
	 * @param args
//	 */
	
//		
//	Player player = new Player(0);
//	player.getPlayerName();
//	

	//constructor
	public Game() {
		discardPile = new ArrayList<Card>();
		
		gameDirection = false;
		playerDeck = new ArrayList<ArrayList<Card>>();
	}
	
	//inialized enter the number of players
	//set the name of each player to a number 
	public static void gameStart() {
	
		
		System.out.println("Enter 'S' to start the Uno Game or enter 'Q' to Quit");
	
		option = scnr.nextLine();
		
		System.out.println("user input " + option);  //debug
		
		while (option != "Q" ) {
			
			System.out.println("inside while loop \n"); //debug
			
			Player player = new Player(0);
			player.getPlayerName();
			
			break;
		}

//		while(option != "Q") {
//			
//			System.out.println("inside while loop \n"); //debug
//			
//			try 
//			{
//				System.out.println("Enter the number of Players playing Uno");
//				playerNum = scnr.nextInt();
//				if(playerNum == 1 || playerNum > 10) 
//				{
//					System.out.println("Only 2-10 players can play! Try again!\n");
//				}
//
//				else{ 
//					System.out.println("User entered the correct number of players \n");
//					for(int j = 1; j < playerNum + 1; j++) {
//						System.out.print("Enter name of player " + j + ": ");
//						playerName = scnr.next();
//						System.out.println();
//					}
//					break;
//				}
//				
//			}
//
//			catch(InputMismatchException e) 
//			{
//				System.out.println("Please enter a number!");
//				scnr.nextLine();
//				playerNum = scnr.nextInt();
//			}
//
//		
//		}
		

	}
	
	//create new card to for starting card
	public Card getTopCard() {
		return new Card();
	}

	//gives 7 cards to each player in the beginning
	public static void setCardForPlayer(Player p) {
		
	}
	

	//Method playerTurn 
	public void getCurrentPlayer() {
		
	}
	
	public void getPreviousPlayer(int i) {
		
	}
//	
//	public String[] getPlayers() {
//		return players;
//	}
	
	public void quitGame() {
		System.out.print("You have now exited the Uno Game. Goodbye!");
		System.exit(0);
	}
	//Game is over when player hand is empty
//	public boolean gameOver() {
//		for ()
//	}
	
	//menu for console
	public static void main(String[] args)
	{
		
		System.out.println("Hello World");  //for debugging
		gameStart();
	
		
	}

}

/**
 * 
 */

/**
 * @author Sean Fuller, Tristen Tran
 *
 */
import java.util.*;

public class Player 
{
	//Fields
	String playerName;
	int playerNumber; 
	int numberOfCards = 0; // total number of cards the player has
	Player nextPlayer;
	Player prevPlayer;
	ArrayList<Card> playerDeck;// = new ArrayList<Card>() ; //array of cards object each player hass
	
	Scanner scnr = new Scanner (System.in);
	
	
	//Constructor
	
	public Player(int playerNum)
	{
		playerName = "";
		playerNumber = playerNum;
		numberOfCards = 0;
		playerDeck = new ArrayList<Card>();
		setPlayerName();
	}
	
//	public void addPlayers(Scanner sc) {
//		this.players = new ArrayList<Player>();
//	}
	
//	Get Player name
	public void setPlayerName() {
		System.out.print("Enter name of player " + (playerNumber + 1) + ": ");
		playerName = scnr.next();
		System.out.println();
		}
//		try 
//		{
//			System.out.println("Enter the number of Players playing Uno");
//			playerNum = scnr.nextInt();
//	
//		}
//		catch(InputMismatchException e) 
//		{
//			System.out.println("Please enter a number!");
//			scnr.nextLine();
//			playerNum = scnr.nextInt();
//		}
		

//		
//		scnr.close();
//
//		
//	}
	
//	public ArrayList<Card> getPlayerHand() {
//		return playerDeck;
//		
//	}

	//Add a card to players deck
//	public void drawCard(Card card) { 
//
//			numberOfCards++;
//			//implement create card method
//			//TODO:
//			
//			playerDeck.add(card);		
//		
//	}
	
	//remove a card from players deck
	public void removeCard(int index) {
		//TODO: remove card from players hand and add it to the discard pile
		playerDeck.remove(index); 
	}
	
//	//displays the players hand to player at every turn
	public void displayPlayerDeck() {
		
		System.out.println(playerName + "'s cards");
		for (int i = 0; i < playerDeck.size(); i++) 
		{
	        System.out.println(i + ": " + playerDeck.get(i).cardColorToString() + " " + playerDeck.get(i).cardTypeToString());
			}
	
	
	}
}



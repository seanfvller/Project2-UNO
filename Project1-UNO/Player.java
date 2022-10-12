/**
 * 
 */

/**
 * @author Dad
 *
 */
import java.util.*;

public class Player
{
	//Fields
	String playerName;
	int playerNum; // number of players in game min is 2
	int numberOfCards = 0; // total number of cards the player has
	Card playerDeck[\; //array of cards object each player has
	ArrayList<String> players = new ArrayList<String>();
	Player nextPlayer;
	Player previousPlayer;
	
	Scanner scnr = new Scanner (System.in);
	
	
	//Constructor
	
	Player(int playerNumber){
		playerName = " ";
		playerNum = playerNumber;
		numberOfCards = 0;
		getPlayerName();
		
	}
	public Player(int playerNumber) 
	{
		
	}
	
	public void addPlayers(Scanner sc) {
		this.players = new ArrayList<Player>();
	}
	
	//Get Player name
	public void getPlayerName(){
		System.out.print("Enter name of player " + (playerNum++) + ": ");
		playerName = scnr.next();
		System.out.println();
	}

	//Add a card to players deck
	public void drawCard() { 
		
		
	}
	
	//remove a card from players deck
	public void removeCard() {
		
	}
	
	//displays the players hand to player at every turn
	public void displayPlayerDeck() {
		
	}
	
	public int getNumberOfCards() {
		return numberOfCards;
	}
}



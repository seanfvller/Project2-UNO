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
	//:)))
	//I hope this project fails
	String playerName;
	int playerNumber = 0; // number of players in game min is 2
	int numberOfCards = 0; // total number of cards the player has
	Card playerDeck[]; //array of cards object player has
	Player[] players = new Player[10];
	
	Player nextPlayer;
	Player previousPlayer;
	
	Scanner scnr = new Scanner (System.in);
	
	public Player(int playerNumber) 
	{
		
	}
	
	public void addPlayers(Scanner sc) {
		this.players = new ArrayList<Player>();
	}
	
	//Get Player name
	public void getPlayerName(){
		Scanner players = new Scanner (System.in);
		System.out.print("Enter name of player: ");
	}
	
	public void getNumberOfPlayer() {
		Scanner playerNumber = new Scanner (System.in);
		System.out.println("Enter number of players: ");
		
		System.out.println("Enter Name for each Player");
		System.out.println("Enter Name for Player "+ playerNumber++ + ": ");
		
		
		
	}
	
	public void drawCard() { 
		
	}
	public void removeCard() {
		
	}
	public void displayPlayerDeck() {
		
	}
	
	public int getNumberOfCards() {
		return numberOfCards;
	}
}



//}
//test tristen
//test push sean 2022-10-05 13:59
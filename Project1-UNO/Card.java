/**
 * @author Sean Fuller, Tristen Tran
 *
 */
import java.util.*;

public class Card {
	// Card Variables
	int cardColor; // 0: Red, 1: Blue, 2: Yellow, 3: Green, 4: Black (Draw Four & Wild Card only)
	int cardType; // 0 - 8: Number Card (1-9), 9: Skip Card, 10: Reverse Card, 11: Draw Four Card, 12: Wild Card
	
	/*
	 *Card Type Explanations:
	 *
	 *Number Card (1-9): A basic card that can be played if its number OR color matches that of the card on the field.
	 *
	 *Skip Card:		 An action card that can be played if its color matches that of the card on the field.
	 * 			 		 Upon playing this card, it will skip the next player's turn.
	 *
	 *Reverse Card:		 An action card that can be played if its color matches that of the card on the field.
	 *					 Upon playing this card, it will reverse the direction of the flow of the game turns.
	 *
	 *Draw Four Card: 	 An action card that can be played regardless of the number or color of the card on the field.
	 *				  	 Upon playing this card, the next player must draw four cards into their deck.
	 *
	 *Wild Card: 		 An action card that can be played regardless of the number or color of the card on the field.
	 *			 		 Upon playing this card, the player may choose its number AND color.
	*/
	
	// Card Constructor
	Card() {
		cardColor = 0;
		cardType = 0;
	}
	
	// Method to create and return new Card.class object with randomized variables.
	public Card createCard() {
		Card newCard = new Card();
		Random random = new Random();
		cardType = random.nextInt(12);
		if (cardType == 11) {
			cardColor = 4;
		}
		else {
			cardColor = random.nextInt(4);
		}
		return newCard;
	}
	
	// Method to return int cardColor variable as a printable String
	public String cardColorToString() {
		String cardColorString = null;
		
		if (this.cardColor == 0) {
			cardColorString = "Red";
		}
		else if (this.cardColor == 1) {
			cardColorString = "Blue";
		}
		else if (this.cardColor == 2) {
			cardColorString = "Yellow";
		}
		else if (this.cardColor == 3) {
			cardColorString = "Green";
		}
		else if (this.cardColor == 4) {
			cardColorString = "Black";
		}
		
		return cardColorString;
	}
	
	// Method to return int cardType variable as a printable String
	public String cardTypeToString() {
		String cardTypeString = null;
		
		if (this.cardType == 0) {
			cardTypeString = "1";
		}
		else if (this.cardType == 1) {
			cardTypeString = "2";
		}
		else if (this.cardType == 2) {
			cardTypeString = "3";
		}
		else if (this.cardType == 3) {
			cardTypeString = "4";
		}
		else if (this.cardType == 4) {
			cardTypeString = "5";
		}
		else if (this.cardType == 5) {
			cardTypeString = "6";
		}
		else if (this.cardType == 6) {
			cardTypeString = "7";
		}
		else if (this.cardType == 7) {
			cardTypeString = "8";
		}
		else if (this.cardType == 8) {
			cardTypeString = "9";
		}
		else if (this.cardType == 9) {
			cardTypeString = "Skip";
		}
		else if (this.cardType == 10) {
			cardTypeString = "Reverse";
		}
		else if (this.cardType == 11) {
			cardTypeString = "Draw Four";
		}
		
		return cardTypeString;
	}
	
//	public Card changeWildCard(Card card) {
//		Scanner scnr = new Scanner(System.in);
//		System.out.println("Please enter a color to set the Wild Card to (0: Red, 1: Blue, 2: Yellow, 3: Green):");
//		do {
//		if (scnr.nextInt() == 0) {
//			this.cardColor = 0;
//			System.out.println("The Wild Card's color has been set to Red.");
//			}
//		else if (scnr.nextInt() == 1) {
//			this.cardColor = 1;
//			System.out.println("The Wild Card's color has been set to Blue.");
//			}	
//		else if (scnr.nextInt() == 2) {
//			this.cardColor = 2;
//			System.out.println("The Wild Card's color has been set to Yellow.");
//			}
//		else if (scnr.nextInt() == 3) {
//			this.cardColor = 3;
//			System.out.println("The Wild Card's color has been set to Green.");
//			}
//		} 
//		catch (InputMismatchException e) {
//			System.out.println("Invalid Input: To select a color, you must input the integer that corresponds to it.");
//			scnr.nextLine();
//			}
//		
//		scnr.close();
//		return card;
//	}
	public static void main(String[] args) {
	}
}

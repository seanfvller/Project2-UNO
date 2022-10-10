/**
 * @author Sean Fuller
 *
 */
import java.util.Random;
public class Card {
	// Card Variables
	int cardColor; // 0: Red - 1: Blue - 2: Yellow - 3: Green
	int cardNumber; // 1-9
	int cardType; // 0: Basic - 1: Skip - 2: Reverse - 3: Draw Four
	
	// Card Constructor
	Card() {
		cardColor = 0;
		cardNumber = 0;
		cardType = 0;
	}
	
	// Method to create and return new Card.class object with randomized variables
	public Card createCard() {
		Card newCard = new Card();
		Random random = new Random();
		cardColor = random.nextInt(4);
		cardNumber = random.nextInt(10);
		cardType = random.nextInt(4);
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
			cardColorString ="Yellow";
		}
		else if (this.cardColor == 3) {
			cardColorString = "Green";
		}
		
		return cardColorString;
	}
	
	// Method to return int cardType variable as a printable String
	public String cardTypeToString() {
		String cardTypeString = null;
		
		if (this.cardType == 0) {
			cardTypeString = "Basic";
		}
		else if (this.cardType == 1) {
			cardTypeString = "Skip";
		}
		else if (this.cardType == 2) {
			cardTypeString = "Reverse";
		}
		else if (this.cardType == 3) {
			cardTypeString = "Draw Four";
		}
		
		return cardTypeString;
	}
	
	public void main(String[] args) {
		createCard();
		System.out.println(this.cardColorToString());
		System.out.println(this.cardTypeToString());
	}
}

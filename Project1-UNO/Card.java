/**
 * 
 */

/**
 * @author Dad
 *
 */
import java.util.Random;
public class Card
{
	int cardColor; // 0: Red - 1: Blue - 2: Yellow - 3: Green
	int cardNumber; // 1-9
	int cardType; // 0: Basic - 1: Skip - 2: Reverse - 3: Draw Four
	Random random = new Random();
	public Card createCard() {
		Card card = new Card();
		this.cardColor = random.nextInt(4);
		this.cardNumber = random.nextInt(10);
		this.cardType = random.nextInt(4);
		return this.Card();
	}
	public void cardColorToString() {
		if (this.cardColor == 1) {
		System.out.print("Blue.");	 
		}
		else {
		System.out.print("Not blue.");
		}
	}
}


// TEST PULL/PUSH CHANGE 2022-10-05 13:44

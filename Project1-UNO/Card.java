/**
 * 
 */

/**
 * @author Dad
 *
 */
public class Card
{
	int cardColor; // 0: Red - 1: Blue - 2: Yellow - 3: Green
	int cardNumber; // 1-9
	int cardType; // 0: Basic - 1: Skip - 2: Reverse - 3: Draw Four
	
	public Card createCard() {
		new Card();
		this.cardColor = 1;
		this.cardNumber = 1;
		this.cardType = 1;
		return this;
	}
	public void cardColorToString() {
		if (this.cardColor == 1) {
		System.out.println("Blue.");	 
		}
		else {
		System.out.println("Not blue.")
		}
	}

	public void main(String[] args)
	{
		createCard();	
		this.cardColorToString();
	}
}


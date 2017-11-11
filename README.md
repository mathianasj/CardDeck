# Card Deck
This project provides all the necessary components to represent a deck of cards, with the ability to shuffle and deal a single card from the deck.

## Usage

### Building

To build the project run the gradle build task

`gradle build`

### Example

```java
import java.security.NoSuchAlgorithmException;

public class Sample {
  public static void main(String[] args) {
    // create a new deck of cards
    Deck deck;

    try {
      deck = new Deck();

      // deal each card until no more exist
      while (deck.hasMoreCards()) {
        // print the card to the screen
        System.out.println(deck.dealOne());
      }
    } catch (NoSuchAlgorithmException | NoMoreCardsException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
```
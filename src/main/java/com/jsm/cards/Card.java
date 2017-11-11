package com.jsm.cards;

/**
 * Represents a playing card
 * 
 * @author Joshua Mathianas
 *
 */
public class Card {
  private final Suit suit;
  private final CardValue cardValue;

  public Card(Suit suit, CardValue cardValue) {
    this.suit = suit;
    this.cardValue = cardValue;
  }

  /**
   * Get the suit defined for the card
   * 
   * @return the suit of this card
   */
  public Suit getSuit() {
    return this.suit;
  }

  /**
   * Get the value of the card
   * 
   * @return the value of this card
   */
  public CardValue getCardValue() {
    return this.cardValue;
  }

  @Override
  public String toString() {
    return this.cardValue + " of " + this.suit.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cardValue == null) ? 0 : cardValue.hashCode());
    result = prime * result + ((suit == null) ? 0 : suit.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Card other = (Card) obj;
    if (cardValue != other.cardValue)
      return false;
    if (suit != other.suit)
      return false;
    return true;
  }
}

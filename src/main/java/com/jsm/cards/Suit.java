package com.jsm.cards;

/**
 * Defines all valid suits for playing card deck
 * 
 * @author Joshua Mathianas
 *
 */
public enum Suit {
  CLUB("Clubs"), DIAMOND("Diamonds"), HEART("Hearts"), SPADE("Spades");

  private final String value;

  Suit(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return this.value;
  }
}

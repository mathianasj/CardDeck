package com.jsm.cards;

/**
 * All valid card values of a playing deck
 * 
 * @author Joshua Mathianas
 *
 */
public enum CardValue {
  ACE("Ace"), KING("King"), QUEEN("Queen"), JACK("Jack"), N2("2"), N3("3"), N4("4"), N5("5"), N6(
      "6"), N7("7"), N8("8"), N9("9"), N10("10");

  private final String value;

  CardValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

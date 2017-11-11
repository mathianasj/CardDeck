package com.jsm.cards;

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

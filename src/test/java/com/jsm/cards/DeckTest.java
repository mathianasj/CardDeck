package com.jsm.cards;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import org.junit.Test;

public class DeckTest {
  @Test
  public void canDealCard() throws NoMoreCardsException, NoSuchAlgorithmException {
    Deck deck = new Deck();

    deck.dealOne();
  }

  @Test(expected = NoMoreCardsException.class)
  public void noMoreCardsThrowsException() throws NoMoreCardsException, NoSuchAlgorithmException {
    Deck deck = new Deck();

    for (int i = 0; i < 52; i++) {
      try {
        System.out.println(deck.dealOne());
      } catch (Exception e) {
      }
    }

    deck.dealOne();
  }

  @Test
  public void deckHas52Cards() throws NoMoreCardsException, NoSuchAlgorithmException {
    Deck deck = new Deck();
    LinkedList<Card> cards = new LinkedList<>();

    while (deck.hasMoreCards()) {
      cards.add(deck.dealOne());
    }

    assertEquals(52, cards.size());
  }

  @Test
  public void deckHas52UniqueCards() throws NoMoreCardsException, NoSuchAlgorithmException {
    Deck deck = new Deck();
    Set<Card> cards = new HashSet<>();

    while (deck.hasMoreCards()) {
      cards.add(deck.dealOne());
    }

    assertEquals(52, cards.size());
  }

  @Test
  public void shuffleChangesOrder() throws NoSuchAlgorithmException, NoMoreCardsException {
    Deck deck = new Deck();
    LinkedList<Card> firstList = new LinkedList<>();
    LinkedList<Card> secondList = new LinkedList<>();

    while (deck.hasMoreCards()) {
      firstList.add(deck.dealOne());
    }

    deck.shuffle();

    while (deck.hasMoreCards()) {
      secondList.add(deck.dealOne());
    }

    assertFalse(firstList.equals(secondList));
  }
}

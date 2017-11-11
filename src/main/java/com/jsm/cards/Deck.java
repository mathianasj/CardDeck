package com.jsm.cards;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import com.google.common.collect.Lists;

/**
 * Represents a deck of cards, and how to interact with it
 * 
 * @author Joshua Mathianas
 *
 */
public class Deck {
  private final Set<Card> cards;
  private Iterator<Card> iterator;

  /**
   * Create a new deck of cards and populate with all valid options defined in Suit and Card Value.
   * Shuffle is also performed as part of instantiation
   * 
   * @throws NoSuchAlgorithmException
   */
  public Deck() throws NoSuchAlgorithmException {
    cards = new HashSet<>();

    // populate deck for each suit
    Arrays.asList(Suit.values()).forEach(suit -> {
      cards.addAll(Arrays.asList(CardValue.values()).stream()
          .map(cardValue -> new Card(suit, cardValue)).collect(Collectors.toSet()));
    });

    shuffle();
  }

  /**
   * Gathers all dealt cards and shuffles the deck
   * 
   * @throws NoSuchAlgorithmException
   */
  public void shuffle() throws NoSuchAlgorithmException {
    List<Card> cardsList = Lists.newArrayList(cards);

    Collections.shuffle(cardsList, SecureRandom.getInstanceStrong());

    iterator = cardsList.iterator();
  }

  /**
   * Lets the consumer know if there are any cards left in the deck
   * 
   * @return
   */
  public Boolean hasMoreCards() {
    return iterator.hasNext();
  }

  /**
   * Gets the next card from the top of the deck
   * 
   * @return Next card in the deck
   * @throws NoMoreCardsException Thrown when no cards are left in the deck
   */
  public Card dealOne() throws NoMoreCardsException {
    if (iterator.hasNext()) {
      return iterator.next();
    }

    throw new NoMoreCardsException();
  }
}

package com.jsm.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {
	@Test
	public void testToString() {
		Card underTest = new Card(Suit.CLUB, CardValue.ACE);
		
		assertEquals("ACE of CLUB", underTest.toString());
	}
	
	@Test
	public void testGetSuit() {
		Card underTest = new Card(Suit.DIAMOND, CardValue.ACE);
		
		assertEquals(Suit.DIAMOND, underTest.getSuit());
	}
	
	@Test
	public void testGetCardValue() {
		Card underTest = new Card(Suit.DIAMOND, CardValue.ACE);
		
		assertEquals(CardValue.ACE, underTest.getCardValue());
	}
}

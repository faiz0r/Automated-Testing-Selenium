package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class normalEntries{
	Blackjack b = new Blackjack();
	
	@Test
	public void testy5() {
		assertEquals(12, b.play(10, 12));
	}
	@Test
	public void testy6() {
		assertEquals(12, b.play(12, 10));
	}
}
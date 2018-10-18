package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class bustEntries{
	Blackjack b = new Blackjack();
	@Test
	public void testy14() {
		assertEquals(0, b.play(35, 25));
	}
	@Test
	public void testy15() {
		assertEquals(0, b.play(35, 25));
	}
	@Test
	public void testy9() {
		assertEquals(0, b.play(30, 10));
	}
	@Test
	public void testy11() {
		assertEquals("Bust!",0, b.play(30, 30));
	}
	@Test
	public void testy7() {
		assertEquals(0, b.play(10, 22));
	}
	
}

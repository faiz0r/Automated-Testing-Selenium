package com.qa.myblackjack;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class invalidEntries{
	Blackjack b = new Blackjack();
	
	@Test
	public void testy1() {
		assertEquals("player and dealer too low", 0, b.play(-10, -10));
	}
	@Test
	public void testy2() {
		assertEquals("player too low",0, b.play(-10, 20));
	}
	@Test
	public void testy3() {
		assertEquals("player too low, dealer too high", 0, b.play(-10, 30));
	}
	@Test
	public void testy4() {
		assertEquals("dealer too low", 0, b.play(10, -10));
	}
	
	@Test
	public void testy8() {
		assertEquals("dealer too high",0, b.play(30, -10));
	}
	
	@Test
	public void testy10() {
		assertEquals("player and dealer too high",0, b.play(30, 50));
	}
	
	@Test
	public void testy12() {
		assertEquals(0, b.play(55, -10));
	}
	@Test
	public void testy13() {
		assertEquals(0, b.play(55, 10));
	}
	
	@Test
	public void testy16() {
		assertEquals(0, b.play(35, 50));
	}
	@Test
	public void testy17() {
		assertEquals("2 low invalid entries", 0, b.play(-10, -10));
	}
	@Test
	public void testy() {
		assertEquals("2 low invalid entries", 0, b.play(-10, -10));
	}
	
}
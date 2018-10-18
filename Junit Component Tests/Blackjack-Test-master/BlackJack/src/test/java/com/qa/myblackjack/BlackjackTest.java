package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BlackjackTest {
	Blackjack b = new Blackjack();
	static int x = 1;
	
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Welcome to my Tests");
	}
	
	@Before
	public void setup() {
		System.out.println("Test" +  x  + "/17");
	}

	@After
	public void teardown() {
		System.out.println("Test finished\n");
		x++;
	}
	@AfterClass
	public static void afterClassTest() {
		System.out.println("Test class is complete");
	}
	
}






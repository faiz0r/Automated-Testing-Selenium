package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
	
@RunWith(Parameterized.class)
public class parameterTest {
	Blackjack b = new Blackjack();
	@Parameters
	public static Collection<Object[]> date(){
		return Arrays.asList(new Object[][] {{0,0,0},{10,10,8},{2,2,1},{3,3,2},{4,4,3},{5,5,5},{8,6,8}});
	}
	
	private int intPected;
	private int intPut1;
	private int intPut2;
	
	public parameterTest(int expected, int input1, int input2) {
		intPected = expected;
		intPut1 = input1;
		intPut2 = input2;
	}

	@Test
	public void testy() {
		assertEquals(intPected, b.play(intPut1, intPut2));
	}

}

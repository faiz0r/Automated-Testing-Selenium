package com.qa.myblackjack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.textui.TestRunner;

public class Runner {
	public static void main (String[]args) {
		Runner.allTests();
	}
	
	public static void allTests() {
		Result result = JUnitCore.runClasses(
				normalEntries.class,
				bustEntries.class,
				invalidEntries.class);
		
		System.out.println("All results passed: " + result.wasSuccessful());
		
		if(!result.wasSuccessful()) {
			System.out.println("Failed Tests:");
			for (Failure failure: result.getFailures()) {
				System.out.println(failure.toString());
			}
		}
	}

}

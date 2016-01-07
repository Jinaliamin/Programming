package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.ReverseEachWord;

public class ReverseEachWordTest {


	
	@Test
	public void testPrintMessage() {
		
	String input = "hello wor";
	
	ReverseEachWord obje = new ReverseEachWord();
	String output = obje.reverseEachWordOfString(input);
	
	System.out.println( output );
	String expected = "olleh row ";
	assertTrue( expected.equals(output) );
	}
	
	@Test
	public void testPrintMessage1() {
		
	String input = "hello";
	
	ReverseEachWord obje = new ReverseEachWord();
	String output = obje.reverseEachWordOfString(input);
	
	System.out.println( output );
	String expected = "hello";
	assertFalse( expected.equals(output) );
	
	}
}

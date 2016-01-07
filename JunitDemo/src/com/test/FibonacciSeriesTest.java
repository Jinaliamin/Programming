
package com.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.main.FibonacciSeries;



public class FibonacciSeriesTest {
   
	@Test
	public void testPrintMessage() {
	FibonacciSeries obje = new FibonacciSeries();
	String output = obje.fib(7);
	
	System.out.println( output );
	String expected = "0 1 1 2 3 5 8";
	assertTrue( expected.equals(output) );
	}
	
	@Test
	public void testPrintMessage2() {
	FibonacciSeries obje = new FibonacciSeries();
	String output = obje.fib(2);
	
	System.out.println( output );
	String expected = "0 1 1";
	assertFalse( expected.equals(output) );
	}
	
	
}

package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.Prime;

public class PrimeTest {
	
	@Test
public void testMethod1()
{
	Prime pn= new Prime();
	boolean actual= pn.Findprime(4);
	assertTrue(actual);
}
}
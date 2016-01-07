package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.LargestNumber;

public class LNtest {
	@Test
	public void Testmethod1()
	{
		LargestNumber LN= new LargestNumber();
		int[] arr={ 1,2,4,7,9};
		int actual= LN.getLargestNumber(arr);
		assertEquals(9,actual);
	}
}
	
	


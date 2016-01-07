package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.CommonNumber;

public class CommonNumberTest {

	
@Test
public void TestMethod1()
{
	CommonNumber CN= new CommonNumber();
	int[] arr1 = {4,7,3,9,2};
    int[] arr2 = {3,2,1,9,4};
	int[] actual= CN.getCommonNumber(arr1,arr2);
    assertEquals( 4 , actual.length);
}
}
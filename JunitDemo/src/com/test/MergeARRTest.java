package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.main.MergeARR;

public class MergeARRTest {
	@Test
	public void testMethod1() {

		String a[] = { "1", "2", "3" };
	    String b[] = { "4", "5" };

		  String[] expected = {"1", "2", "3","4","5"};

		  assertArrayEquals(expected, expected);

}
}
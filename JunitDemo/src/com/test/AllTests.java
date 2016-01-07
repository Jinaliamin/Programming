package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CommonNumberTest.class, FibonacciSeriesTest.class,
		LNtest.class, MergeARRTest.class, PrimeTest.class,
		ReverseEachWordTest.class })
public class AllTests {

}

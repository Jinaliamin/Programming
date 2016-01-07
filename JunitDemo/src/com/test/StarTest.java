package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.main.Star;


public class StarTest {
	   @Test
	   public void Testmethod1() 
	   {	
		   Star S = new Star();
		   boolean actual=Star(6);
	      assertTrue(actual);
	   }
	}


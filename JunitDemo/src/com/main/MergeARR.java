package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeARR {

		   public static void main(String args[]) {
		      String a[] = { "1", "2", "3" };
		      String b[] = { "4", "5" };
		      List list = new ArrayList(Arrays.asList(a));
		      list.addAll(Arrays.asList(b));
		      Object[] c = list.toArray();
		      System.out.println(Arrays.toString(c));
		   }
		}


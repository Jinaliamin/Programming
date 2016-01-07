package com.main;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap_selenium
{
	public static void main(String[] args)
	{
		// Create a HashMap with three key/value pairs.
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("One", new Integer(1));
		hm.put("Two", new Integer(2));
		hm.put("Three", new Integer(3));
		System.out.println("HashMap:" +hm);
		// Get the value associated with the key "Three".
		Object v = hm.get("Three");
		if (v != null)
		{
			System.out.println("The value associated with \"Three\" is " + v);
		}
		else
		{
			System.out.println("There is no key named \"Three\" " +
					"in the HashMap.");
		}
        DecimalFormat df = new DecimalFormat("0");
        String a = "$123"; 
        a = a.replace("$","");
		System.out.println(a);
		Float x = Float.parseFloat(a);
		System.out.println("Converted Strign to int is "  + df.format(x));
		
		int maxValueInMap=(Collections.max(hm.values()));  // This will return max value in the Hashmap
        for (Entry<String, Integer> entry : hm.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }
	}
}
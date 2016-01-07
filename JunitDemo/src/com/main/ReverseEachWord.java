package com.main;

public class ReverseEachWord {
	
 public String reverseEachWordOfString(String inputString)
	    {
	 
	 // input = ab bc cd
	 //output = ba cb dc
	 
	 //string length - string.length() = 2
	 //array length = array.length = 4
	 
	        String[] words = inputString.split(" ");
	         
	        String reverseString = "";
	         
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i]; //ab
	             
	            String reverseWord = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) // cdab - b loop 2loop - a 3rd loop - d
	            {
	                reverseWord = reverseWord + word.charAt(j); // resverword = reverseword + b; //
	                											// reverseword = b + a; //ba
	                											// reverserword = ba + d // badc
	            }
	             
	            reverseString = reverseString + reverseWord + " ";
	        }
	       
	        return reverseString;
	         
	        }
	     
	    public static void main(String[] args) 
	    {
	    	ReverseEachWord obje = new ReverseEachWord();
	    	System.out.println(obje.reverseEachWordOfString("Hello World"));
}
}
	
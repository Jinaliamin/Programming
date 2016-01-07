package com.main;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonNumber {
	
	//data types - two type 1 primitive - int,char object - Integer,String,Double
	// wrapper class 
	
	
	public static int[] getCommonNumber(int[] arr1, int[] arr2){
	
		int[] arr3 = new int[4];
		int k = 0;
		
		for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    arr3[k++] = arr1[i];
                }
            }
        }
	return arr3;
	}
		 
	    public static void main(String a[])
	    {
	    	
	        int[] arr1 = {4,7,3,9,2};
	        int[] arr2 = {3,2,1,9,4};
	        
	        int[] arr3 = getCommonNumber(arr1, arr2);
	        
	        System.out.println( Arrays.toString(arr3) );
	        
	        //System.out.println("The Common Number is: " + getCommonNumber(arr1, arr2));
	    }
	}

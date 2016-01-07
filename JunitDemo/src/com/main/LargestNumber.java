package com.main;

public class LargestNumber {
	
public int getLargestNumber(int[] arr)
{
	int num= arr[0];
	for (int i=1;i<arr.length;i++)
	{
		if (num<arr[i])
		{
			num = arr[i];
			
		}
	}
	return num;
}

public static void main(String[] args)
{
	LargestNumber LN= new LargestNumber();
	int[] arr = {2,3,7,2,9};
	System.out.println("The largest Number is: " + LN.getLargestNumber(arr));
}
	
}
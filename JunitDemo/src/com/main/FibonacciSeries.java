package com.main;
public class FibonacciSeries {
	
	//string immutable stringbuffer mutable
	// string - define - memory location - cannot edit - define wont change
	//string buffer abc = "buffer" same location append - mutable - string operations - append . modify , delete  

	public String fib( int count ){
		
		StringBuffer output = new StringBuffer("0 1");
		
		 int n1=0,n2=1,n3,i;   
		    
		 for(i=2;i<count;++i)    
		 {    
		  n3=n1+n2;    
		  //System.out.print(" "+n3);  
		  output.append(" "+n3);
		  n1=n2;    
		  n2=n3;    
		  
		 }    
		
	return output.toString();	// string buffer to string conversion 
		
	}
		public static void main(String args[])  
		{  
			// 0 1 1 2 3 5 8 
			
			FibonacciSeries obj = new FibonacciSeries();
			String out = obj.fib(10);
			System.out.print( out );
		}
		}  


package com.main;



	public class test_fibonacci {

		public int fib(int n) {
			if (n <= 0)
				return 0;
			else
				return n + fib(--n);
		}

	
	public static void main(String[] args) {
		
		test_fibonacci obj = new test_fibonacci();
		System.out.println(obj.fib(7));
		
	}
	}



package com.main;

public class Star {
	    public static void main(String agrs[]) {
	    	
	    		for (int i = 0; i < 6; i++) {
		            for (int j = 0; j < 6; j++) {
		                if (j <= i) {
		                    System.out.print("  *");
		                } else {
		                    System.out.print("   ");
		                }
		            }
		            System.out.println();
		        }
	    	
			
	    }
}

		
package com.Q3;

import java.util.Arrays;

public class Main{
		public int[] findAndReturnPrimeNumbers(int[] inputArray){
			int [] primeArray= new int[inputArray.length];
			
		     for(int i=0; i<inputArray.length; i++) {
		    	     int count =0; 
		    	 for(int j=2; j<=inputArray[i]; j++) {
		    		 
		    		 if(inputArray[i]%j==0) {
		    			 count++;
		    		 }
		    	 }
		    	 
		    	 if(count==1) {
		    		 primeArray[i]=inputArray[i];
		    		 
		    	 }
		     }
		     return primeArray;
		}
		public static void main(String[] args){
	      Main m1=new Main();
		int[] arr = {10,12,5,50,11,14,15};
		
	    int [] arr2=m1.findAndReturnPrimeNumbers(arr);
	    System.out.println(Arrays.toString(arr2));
	    
					
		
		}
		
}

package com.Q1;

import java.util.Scanner;

public class Main {

	public static String reversString(String input){
	    char[] ch = input.toCharArray();
	    String bagString="";
	      for(int i=ch.length-1; i>=0 ;i--) {
	    	  bagString+=ch[i];
	      }
	      return bagString;
		}
	   public static void main(String[] args) {
		   Scanner inputScanner=new Scanner(System.in);
		   System.out.println("Enter a String to reverse");
		   String string=inputScanner.next();
		   String string2=reversString(string);
		   System.out.println(string2);
				   
	}
}

package com.Q4;

public class Cli {

	public static void main(String[] args) {
		if(args.length==1) {
			int fact=1;
			int num1 = Integer.parseInt(args[0]);
			for(int i=1; i<=num1; i++) {
				fact*=i;
			}
			System.out.println(fact);
		}
		if(args.length==2) {
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int finalNum=Math.abs(num2-num1);
//			System.out.println(finalNum);
			int fact=1;
			for(int i=1; i<=finalNum; i++) {
				fact*=i;
			}
			System.out.println(fact);
			
		}
		if(args.length>=3) {
			System.out.println("Error");
		}
		
	}
}

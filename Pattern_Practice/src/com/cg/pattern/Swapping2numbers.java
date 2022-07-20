package com.cg.pattern;

import java.util.Scanner;


public class Swapping2numbers {

	public static void main(String[] args) {
		
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=s.nextInt();
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter second number: ");
		int b=s1.nextInt();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("First number after swapping: "+a);
		System.out.println("First number after swapping: "+b);
		


	}

}

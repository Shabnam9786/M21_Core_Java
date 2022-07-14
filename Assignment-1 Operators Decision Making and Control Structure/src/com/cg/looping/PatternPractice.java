package com.cg.looping;

public class PatternPractice {

	public static void main(String[] args) {
	// for reverse left right angle triangle
	   /* int i,j;
		int n=5;
		for(i=0;i<n; i++)
		{
			for(j=4;j>=i; j--)
			{
				System.out.print("@"+" ");
			}
			System.out.println();
		} */
		
	// for mirrored left angle triangle
		int i,j;
		int n=5;
		for(i=1;i<=n; i++)
		{
			  for(j=0;j<=n-i; j++) 
			{
				  System.out.print(" ");  
			}
				  for(j=0;j<i; j++) 
				{
					System.out.print("*");
				}
			 
			System.out.println();
		}

	}
}

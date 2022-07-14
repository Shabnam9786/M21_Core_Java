package com.cg.looping;

public class ProgramStarPractice {

	public static void main(String[] args) {
	// for reverse left right angle triangle
	/*  int i,j;
		int n=5;
		for(i=0;i<n; i++)
		{
			for(j=4;j>=i; j--)
			{
				System.out.print("@"+" ");
			}
			System.out.println();
		} */
		
	// for inverse right angle triangle
		int i,j;
		int n=5;
		for(i=4;i<n; i--)
		{
			for(j=0;j>=i; j++)
			{
				for(j=0;j>=i; j++)
				{
					System.out.print("@"+" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}

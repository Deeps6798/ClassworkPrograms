package com.morning.sessions;

import java.util.Scanner;

public class Array2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter the size of array");
		size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements");
		
	
				for(int i=0; i<size; i++)
				{
					a[i]=s.nextInt();
				}
				System.out.println("Entered elements are: ");
				for(int i=0; i<size; i++)
				{
					System.out.println(a[i]+ " " );
				}
		

	}

}

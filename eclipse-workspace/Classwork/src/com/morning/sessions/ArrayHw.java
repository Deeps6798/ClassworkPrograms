package com.morning.sessions;

import java.util.Scanner;

public class ArrayHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a[]= new int [5];
		int i;
		
		
		for(i=0; i<a.length; i++)
		{
			System.out.print("Enter number");
			a[i]=sc.nextInt();
			
		}
		for(i=0; i<a.length; i++)
		{
		System.out.println(a[i] + " ");
		}


	}

}

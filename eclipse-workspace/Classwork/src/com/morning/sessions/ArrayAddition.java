package com.morning.sessions;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a[]= new int[6];
		System.out.print("Enter number");
		for(int i=0; i<a.length; i=i+1)
		{
			
			a[i]=s.nextInt();
			
		}
		
		int sum=0;
	
		
		for(int i=0; i<a.length; i=i+1)
		{
			
			sum=sum+a[i];

			
		}
		System.out.println("addition is " +sum);
	}

}

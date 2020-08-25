package com.morning.sessions;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		//System.out.print("Enter the elements");
		//s.nextInt();
		int a[]= new int[6];
		System.out.print("Enter number");
		for(int i=0; i<a.length; i=i+1)
		{
			
			a[i]=s.nextInt();
			
		}
		
		int sumeven=0;
		int sumodd=0;
		
		for(int i=0; i<a.length; i=i+1)
		{
			if(i%2==0)
			{//System.out.println(a[i] + " ");
			
			sumeven=sumeven+a[i];
			}
			else
			{
				sumodd=sumodd+a[i];
			}
			
		}
		System.out.println("Sum of odd is: "+ sumodd);
		System.out.println("Sum of even number is " +sumeven);  
	
	}

}

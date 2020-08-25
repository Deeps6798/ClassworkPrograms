package com.morning.sessions;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		
		int a[]= new int[5];
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter number");
			a[i]=sc.nextInt();
		}
		System.out.print("**************");
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			//System.out.println(a[i] + " ");
			
			sum=sum+a[i];
		}
		System.out.println("addition is " +sum);                                                                                                                                                                                                                           
		
	}
	

}

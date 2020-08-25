package com.morning.sessions;

import java.util.Scanner;

public class ArrayDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size;
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size = s.nextInt();
		int a[] = new int [size];
		int sum =0;
		System.out.println("Enter the Array ");					
		for (int i=0;i<size;i++)
		{
			a[i] = s.nextInt();
		}
		for(int i = 0; i < size; i++)
		{
			if(i% 3 == 0)
			{
				sum = sum + a[i];
				
			}
		
	}System.out.println("Number divisible by 3 are:" +sum);



	
	}} 

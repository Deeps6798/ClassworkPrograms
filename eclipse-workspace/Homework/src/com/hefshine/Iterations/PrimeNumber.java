package com.hefshine.Iterations;

import java.util.Scanner;

public class PrimeNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		 ;
		int temp=0;
		

		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				
				temp=temp+1;
			}
			if(temp>0)
			{
				System.out.println(n+ "Number is not prime");
			}
			
			else 
			{
				System.out.println(n+ "Number is prime");
			}
			
		}

	}

}

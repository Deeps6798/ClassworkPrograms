package com.hefshine.Iterations;

import java.util.Scanner;

public class Menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=1;
		int choice = 0;
		int n=0;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your choice :");
		choice=s.nextInt();
		int i=0;
		
		
	
		switch(choice)
		{
		case 1: for( i=1; i<=100; i++)
		{
			if(i%2==0)
			{
				System.out.print("The even  numbers are: " +i);
				//cnt=cnt+1;
			}
			break;
			
		}
		case 2: 	if(i%2!=0)
			{
				System.out.print("The odd numbers are: " +i);
				//cnt=cnt+1;
			}
			break;
			
		}
			
//			 case 3:for(int i=2;i<=n-1;i++) 
//			 { if(n%i==0)
//			 {
//			
//			System.out.print("The prime numbers are: " +n); 
//			cnt=cnt+1; 
//			}
//			 break; 
//			 }
//			 
//			
//		
		}
	
	}


		
		
		
	
		


	


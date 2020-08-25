package com.hefshine.Iterations;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int cnt=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		i=s.nextInt();
		while(i>0)
		{
			i=i/10;
			cnt=cnt+1;
			
		}
		System.out.println("The count of number is : " +cnt);
		
		

	}

}

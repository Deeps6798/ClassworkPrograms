package com.hefshine.ForLoop;

public class ComplexLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Complex loop
		int count=0;
		int i=0;
		int j = 0;
		int cnt = 0;
		
		
		for(i=0, j=0; i<=4; i=i+2)
		{
			for(j=1; j<10; j=j++)
			{
				cnt=cnt+1;
			}
			System.out.println(i);
			count= count+1;// cnt How much times the loop is iterating
		}
		System.out.println("Value of int i: " +i);
		System.out.println("Value of int j: " +j);
		
		System.out.println("Value of count : " +count);
	} 


}

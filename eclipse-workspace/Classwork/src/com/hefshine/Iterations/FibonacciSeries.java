package com.hefshine.Iterations;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		int count=10;
		for(int i=0;i<10;i++)
		{
			System.out.print(num1+" ");
			int result=num1+num2;
			num1=num2;
			num2=result;
			
		}
		

	}

}

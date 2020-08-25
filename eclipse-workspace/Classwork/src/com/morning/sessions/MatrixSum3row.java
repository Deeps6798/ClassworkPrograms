package com.morning.sessions;

public class MatrixSum3row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				
		};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.print(a[i][j] +"\t");
			}
			System.out.println();
		}
		int sum=0;
		System.out.println("=================================");
	for(int i=0; i<a.length; i++)
	{
		for(int j=0; j<a.length; j++)
		{
			if(i==2)
			{
				sum=sum+a[i][j];
			}	
			
		}
		
	}
	System.out.println("Sum is: " +sum);
	}

}

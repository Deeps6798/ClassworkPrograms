package com.hefshine.Iterations;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				cnt=cnt-1;
				
			}
			System.out.println("");
		}
		
	}

}

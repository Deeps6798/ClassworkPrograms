package com.hefshine.Iterations;

public class Star13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		
			for( int i=1;i<=7;i=i+2)
			{
				for(int  j=1; j<=i; j=j+1)
				{
					System.out.print("*");
					}
			System.out.println("");
			
		}
			for(int i=5-1;i>=1;i=i-2)
			{
				for(int j=1;j<=i;j=j+1)
				{
					
					System.out.print("*");
				}
			}
			System.out.println("");
	}


}

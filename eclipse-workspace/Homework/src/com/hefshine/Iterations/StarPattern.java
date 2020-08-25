package com.hefshine.Iterations;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		for(int i=0;i<=4; i=i+1)
		{
			for(int j=0; j<=i; j=j+1)
			{
				System.out.print(" * ");
				cnt=cnt-1;
			}
			System.out.println("");
		}

	}

}

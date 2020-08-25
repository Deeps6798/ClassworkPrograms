package com.hefshine.ForLoop;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		for(int j=1; j<=4; j++)
		{
			for(int i=1; i<=3; i=i+1)
			{	
				cnt=cnt+1;
				System.out.print(cnt+" ");
			}
			System.out.println("");
		}

	}

}

package com.hefshine.ForLoop;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				if(i%2==0)
				{
					System.out.print(" # ");
				}
				else
				{
					System.out.print(" * ");
				}
				
			}
			System.out.println("");
		}

	}

}

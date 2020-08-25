package com.hefshine.Iterations;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=1;
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5;j++)
			{
				if(cnt==1)
				{
					
					System.out.print(" 1 ");
					
				}
				else {
					System.out.print(" 0 ");
				}
				cnt=cnt* -1;
				
				
			}
			System.out.println("");
		}

	}

}

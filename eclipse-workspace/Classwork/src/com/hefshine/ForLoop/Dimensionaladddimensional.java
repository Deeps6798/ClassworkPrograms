package com.hefshine.ForLoop;

public class Dimensionaladddimensional{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				count=count+1;
				if(i==j)
				{
					sum= sum+count;
					
				}
				System.out.print(count+" ");
			}
			System.out.println();
		}
		System.out.println("The value of the sum is " +sum);
		
			
	}



	}



package com.hefshine.Iterations;

public class PinkYellow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c1 = 0, c2 = 0, c3 = 0;
		
		
		
		for(int i=33; i<=999;i=i+1)
		{
			if(i%3==0)
			{	
				c1++;
				System.out.print("Pink ");
			}
			else if(i%5==0)
			{
				c2++;
				System.out.println("Yellow");
			}
			else if(i%3==0 || i%5==0 )
			{
				c3++;
				System.out.println("Pink & Yellow");
			}
			
		}
		System.out.println("pink: "+c1+ " Yellow: "+ c2+" Pink And Yellow : " +c3);
		

	}

}

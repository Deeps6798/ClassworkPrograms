package com.morning.sessions;

public class ArrayTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]= new int[5][];
		b[0]= new int[3];
		b[1]= new int[2];
		b[2]= new int[1];
		b[3]= new int[4];
		b[4]= new int[3];
		
		b[2][0]=1;
		b[0][0]=5;
		b[0][1]=5;
		b[0][2]=5;
		b[4][1]=7;
		b[3][2]=8;
		b[2][0]=9;
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0; j<b[i].length;j++)
			{
				System.out.print(b[i][j]+ "\t");
			}
			System.out.println();
			}
		
	}

}

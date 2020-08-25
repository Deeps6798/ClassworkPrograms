package com.morning.sessions;

public class ArraysofArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]= new int[7][];
		b[0]= new int[5];
		b[1]= new int[5];
		b[2]= new int[5];
		b[3]= new int[3];
		b[4]= new int[5];
		b[5]= new int[2];
		b[6]= new int[5];
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
			}
		
		}
		
	

}

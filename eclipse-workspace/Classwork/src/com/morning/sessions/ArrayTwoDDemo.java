package com.morning.sessions;

public class ArrayTwoDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,98,6};
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
		System.out.println("\n");
		
		int b[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11},
				{11,12,13,14,15},
				{},
				{1,1,1},
		};	
				for(int i=0; i<b.length;i++)	
				{
					for(int j=0;j<b[i].length;j++)
					{
						System.out.print(b[i][j]+ "\t");
					}
					System.out.println();
				}
				
		
		}
	}



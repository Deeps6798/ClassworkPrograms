package com.morning.sessions;

import java.util.Arrays;

public class ArrayfuctionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,7,9,43,56,79,-8,-45,-78};
		System.out.println("Before sort");
		
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i] +"\t");
		}
		System.out.println();
		Arrays.sort(a);
		
		System.out.println("After sort");
		
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i] +"\t");
			
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(a, 79));
	}

}

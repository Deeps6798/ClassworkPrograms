package com.hefshine.Iterations;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n=121,rem,rev=0;
		m=n;
		while(m>0)
		{
			rem=m%10;
			m=m/10;
			rev=rev*10+rem;
			
			
		}
		if(n==rev)
		{
			System.out.println(n+ " Number is palindrome");
		}
		else {
			System.out.println(n+ " Number is not plaindrome");
		}
	}

}

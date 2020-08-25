package Conditional;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter side a");
		a=s.nextInt();
		System.out.println("Enter side b");
		b=s.nextInt();
		System.out.println("Enter side c");
		c=s.nextInt();
		if (a==b && b==c)
		{
			System.out.println("The triangle is an equilateral triangle");
		}
		if((a==b && b!=c && a!=c) || (b==c && b!=a && c!=a) || (c==a && c!=b && a!=b))
		{
			System.out.println("The triangle is an isosceles triangle");
		}
		if(a!=b && a!=c && b!=c)
		{
			System.out.println("The triangle is scalene triangle");
		}
	}

}

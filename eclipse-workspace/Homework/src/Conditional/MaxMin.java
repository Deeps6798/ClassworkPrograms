package Conditional;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int num1=40, num2=50;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1st number");
		num1= s.nextInt();
		System.out.println("Enter 2st number");
		num2= s.nextInt();

	
	if(num1>num2)
	{
		System.out.println(num1+ " is maximum");
		System.out.println(num2+ " is minimum");
	}
	else {
		System.out.println(num1+ " is minimum");
		System.out.println(num2+ " is maximum");		}
	}

}

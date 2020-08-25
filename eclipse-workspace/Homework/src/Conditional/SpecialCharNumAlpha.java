package Conditional;

import java.util.Scanner;

public class SpecialCharNumAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch, b;
		int a;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your input :");
		ch=s.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println(ch+ " is a character");
		}
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+ " is a number");
		}
		else
		{
			System.out.println(ch +" is a special character");
		}
				

	}

}

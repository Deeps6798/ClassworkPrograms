package Conditional;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		char ch;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a character");
		ch=s.next().charAt(0);
		if (ch>='A' && ch<='Z')
		{
			System.out.println("Character is upper case");
		}
		else if (ch>='a' && ch<='z')
		{
			System.out.println("Character is lower case");
		}

		
		
		
	}

}

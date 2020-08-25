package Conditional;

import java.util.Scanner;

public class VowelConso {
	
	public static void main(String[] args) {
		char ch;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a aplphabet :");
		ch=s.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u')
		{
			System.out.println(ch+ " is a vowel");
		}
		else {
			System.out.println(ch+ " is a consonant");
		}
		
	}

}

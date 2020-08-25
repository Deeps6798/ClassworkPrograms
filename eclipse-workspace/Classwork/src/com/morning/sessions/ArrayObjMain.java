package com.morning.sessions;

import java.util.Scanner;

public class ArrayObjMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of student");
		int stu_cnt=0;
		stu_cnt=s.nextInt();
		
		ArrayObjects a1[]= new ArrayObjects[stu_cnt];
		
	
		for(int i=0; i<a1.length;i++)	
		{
			a1[i]= new ArrayObjects();
			System.out.println("Enter id: ");
			a1[i].id=s.nextInt();
			System.out.println("Enter name: ");
			a1[i].name=s.next();
			System.out.println("Enter marks: ");
			a1[i].totalmarks=s.nextInt();
		}
		for(int i=0; i<a1.length;i++)	
		{
			System.out.println(a1[i]);
		}
		
		

	}

}
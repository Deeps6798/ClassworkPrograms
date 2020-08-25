package com.morning.sessions;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		cnt=sc.nextInt();
		Emp em[]= new Emp[cnt];
		for(int i=0; i<em.length; i++)
		{
			em[i]= new Emp();
			System.out.println("Enter emp id:");
			em[i].empid= sc.nextInt();
			System.out.println("Enter emp name: ");
			em[i].ename=sc.next();
			System.out.println("Enter date of joining: ");
			em[i].doj=sc.next();
			System.out.println("Enter designation:");
			em[i].desgn=sc.next();
			System.out.println("Enter salary: ");
			em[i].salary=sc.nextFloat();
			
			
		}
		for(int i=0; i<em.length; i++)
		{
		System.out.println(em[i]);
		}
		System.out.println("Enter the id to update the details of Emp:");
		int temp=sc.nextInt();
		for(int i=0; i<em.length; i++)
		{
			if(em[i].empid==temp)
			{
				
				System.out.println("Enter emp name: ");
				em[i].ename=sc.next();
				System.out.println("Enter date of joining: ");
				em[i].doj=sc.next();
				System.out.println("Enter designation:");
				em[i].desgn=sc.next();
				System.out.println("Enter salary: ");
				em[i].salary=sc.nextFloat();

			}
		}
		for(int i=0; i<em.length; i++)
		{
			System.out.println(em[i]); 
		}
	}
	

}

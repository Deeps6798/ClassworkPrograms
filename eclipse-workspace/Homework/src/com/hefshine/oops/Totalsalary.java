package com.hefshine.oops;

import java.util.Scanner;

public class Totalsalary {
	int service; 
	float salary,total_salary;
	
	Scanner s=new Scanner(System.in);
	
	
	void Totalsalary1()
	{
		System.out.println("Enter the service of employee:");
		service=s.nextInt();
		System.out.println("Enter the salary of employee:");
		salary=s.nextFloat();
		if(service>5)
		{
			total_salary=salary+(salary*0.35f);
			System.out.println("The total salary is:" +total_salary);
		}
		else
		{
			total_salary=salary+(salary*0.15f);
			System.out.println("The total salary is:" +total_salary);
			
		}
		
	}


		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Totalsalary ts= new Totalsalary();
		ts.Totalsalary1();
		
			
			
			
			
			
		}

	
		}



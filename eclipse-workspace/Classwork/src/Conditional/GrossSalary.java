package Conditional;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float  salary, gsalary;
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Emp salary");
		salary=s.nextInt();
		if (salary<=10000)
		{
			gsalary= salary+(salary*0.2f)+ (salary*0.8f);
			System.out.println("The salary is " +gsalary);
			
		}
		 if (salary>10000 && salary<=20000)
		{
			gsalary= salary+(salary*0.25f)+ (salary*0.90f);
			System.out.println("The salary is " +gsalary);
			
		}
		 if (salary>20000)
		{
			gsalary= salary+(salary*0.30f)+ (salary*0.95f);
			System.out.println("The salary is " +gsalary);
		}

	}

}

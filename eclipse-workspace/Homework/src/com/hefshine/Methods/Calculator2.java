package com.hefshine.Methods;

public class Calculator2 {
	int sum, difference;
	
	int  calculatesum(int num1, int num2)
	{
		sum=num1+num2;
		System.out.println("The addition is:" +sum);
		return sum;
		
		
	}
	int calculatedifference(int num1, int num2)
	{
		difference=num1-num2;
		System.out.println("The difference is:" +difference);
		return difference;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 c= new Calculator2();
		c.calculatesum(10, 15);
		c.calculatedifference(55, 40);

	}

}

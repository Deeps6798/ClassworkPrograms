package com.hefshine.Methods;

public class Calculator {
	int num1, num2, res;
	double addition(int num1, int num2) 
	{
		res=num1+num2;
		System.out.println("The addition is:" +res);
		return res;
		
	}
	double substraction(int num1, int num2)
	{
		res=num1-num2;
		System.out.println("The substraction is:" +res);
		return res;
	}
	double multiplication(int num1, int num2)
	{
		res=num1*num2;
		System.out.println("The multiplication  is:" +res);
		return res;
	}
	double division(int num1, int num2)
	{
		res=num1/num2;
		System.out.println("The division is:" +res);
		return res;
	}
}

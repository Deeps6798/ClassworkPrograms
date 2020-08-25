package com.hefshine.Constructor;

public class Bank {
	int amt=5000;
	int addedamt;
	
	Bank()
	{
		System.out.println("No amt will ne added to the bank");
	}
	Bank(int addamt)
	{
		this.addedamt=addamt;
		int finalamt=amt+addedamt;
		System.out.println("The final amt is:" +finalamt);
		
		
	}
	
	//void finalAmt()
	//{
	//	int finalamt=amt+addedamt;
	//	System.out.println("The final amt is:" +finalamt);
	//}

}

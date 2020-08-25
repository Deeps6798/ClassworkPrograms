package com.hefshine.Method;

public class AccountManagement {
	
	double accno;
	String bankname;
	int totalamt;
	int withdrawamt;
	int depositamt;
	

	void insertdata(double ano, String bn, int tamt, int wamt, int damt)
	{
		
		this.accno=ano;
		this.bankname=bn;
		this.totalamt=tamt;
		this.withdrawamt=wamt;
		this.depositamt=damt;
		
		
	}
	void displaydata()
	{
	
		System.out.println("The account number is: " +accno);
		System.out.println("The bank name is: " +bankname);
		System.out.println("The total amt is: " +totalamt);
		System.out.println("The withdrawn amt is: " +withdrawamt);
		System.out.println("The deposit amt is: " +depositamt);
		
	}
	void depositamt()
	{
		
		System.out.println("The amt deposited is: " +depositamt);
	}
	void withdrawamt()
	{
		System.out.println("The amt withdrawn is: " +withdrawamt);
	}
	void accbalance()
	{
		System.out.println("The account balance is:" +totalamt);
	}
}

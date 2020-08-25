package com.hefshine.Method;

public class AccountMain extends AccountManagement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountManagement am= new AccountManagement ();
		
		am.insertdata(628768,"Maharashtra", 80000, 20000, 10000);
		am.displaydata();
		am.depositamt();
		am.withdrawamt();
		am.accbalance();
		
		
				
		
		

	}

}

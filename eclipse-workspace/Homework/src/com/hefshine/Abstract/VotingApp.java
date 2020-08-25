package com.hefshine.Abstract;

interface VotingApp {
	
	void registerUser();
	void votingnumber();	
class Kids implements VotingApp
{       
	public int age;
	//@ override
	public void registerUser()
	{
		
			if(age<12)
			{	
				System.out.println("You have successfully registered under Kids");
			}
	
			else
			{
				System.out.println("You have not succesfully registered");
			}
	}
	@Override
	public void votingnumber()
	{
		if(age<12)
		System.out.println("Sorry cannot go for voting bcoz age must be greater than 12 to vote");
	}
	
	}
}
class Adult implements VotingApp
{
	public int age;

	public void registerUser()
		{
			
			if(age>12) 
			{
			System.out.println("You have registered successfully under adult");
			}
		
		else
		{
			System.out.println("Your have not successfully registered under adult");
		}
		}
	
		@Override
		public void votingnumber() {
			if(age>12)
			{
				System.out.println("your voting id will be genereated within a day");
			}
			else
			System.out.println("Oops your not");
		}

		
}

	



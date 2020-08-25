package com.hefshine.Accessspeicfiers;


public class Employee{
	protected int empid;
	String empname;
	private int empSalary;
	String empdegsn;
	
	
	public void doPublic(String desg)
	{
		this.empdegsn=desg;
		System.out.println("Emp designation: " +empdegsn);
		
	}
	 void doDefault(String en)
	{
		 this.empname=en;
			System.out.println("Emp name: " +empname);
	}
	 protected  void doProtected(int id)
	{
		 this.empid=id;
			System.out.println("Emp id:" +empid);
	}
	 private void doPrivate(int salary)
	 {
		 this.empSalary=salary;
			System.out.println("Emp salary: " +empid);
	 }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee e1= new Employee();
			e1.doDefault("Deeps");
			e1.doProtected(20065401);
			e1.doPublic("HR");
			e1.doPrivate(400000);
			
			
			
			
			

		}
	
	
}



	



package com.morning.sessions;

public class Emp{
	int empid;
	String ename;
	String desgn;
	String doj;
	float salary;
	Emp()
	{
		
	}
	public Emp(int empid, String ename, String desgn, String doj, float salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.desgn = desgn;
		this.doj = doj;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", ename=" + ename + ", desgn=" + desgn + ", doj=" + doj + ", salary=" + salary
				+ "]";
	}
	 
	
	

}

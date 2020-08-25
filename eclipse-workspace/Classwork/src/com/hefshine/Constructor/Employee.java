package com.hefshine.Constructor;

public class Employee {
	int eid;
	String ename;
	String Desgn;
	String deprt;
	float salary;
	public Employee(int id, String name, String desg, String dep, float sal)
	{
		this.eid=id;
		this.ename=name;
		this.Desgn=desg;
		this.deprt=dep;
		this.salary=sal;
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesgn() {
		return Desgn;
	}
	public void setDesgn(String desgn) {
		Desgn = desgn;
	}
	public String getDeprt() {
		return deprt;
	}
	public void setDeprt(String deprt) {
		this.deprt = deprt;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Desgn=" + Desgn + ", deprt=" + deprt + ", salary="
				+ salary + "]";
	}
	

}

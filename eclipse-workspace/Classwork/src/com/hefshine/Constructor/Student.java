package com.hefshine.Constructor;

public class Student {
	int id;
	String name;
	public Student(int sid, String sname)
	{
		this.id=sid;
		this.name=sname;
	}
	public Student()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

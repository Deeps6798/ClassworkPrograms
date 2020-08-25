package com.hefshine.inheritance;

import java.util.Scanner;

public class PojoDemo
{
	private int sid;
	private String name;
	private String grade;
	
	PojoDemo()
	{
		Scanner s=new Scanner(System.in);
		s.nextInt();
		System.out.println("Enter student id: ");
		s.nextLine();
		System.out.println("Enter name:");
		s.toString();
		System.out.println("enter grade:");
		s.toString();
		
	
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		
		return "PojoDemo [sid=" + sid + ", name=" + name + ", grade=" + grade + "]";
	}
	
}

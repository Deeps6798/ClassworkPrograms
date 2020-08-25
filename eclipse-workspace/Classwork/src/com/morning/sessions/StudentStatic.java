package com.morning.sessions;

import java.io.Serializable;

public class StudentStatic implements Serializable
{
	private int sid;
	private String name;
	private String city;
	static int cnt=0;
	
	StudentStatic()
	{
		this.cnt= this.cnt+1;
	}
	StudentStatic(int id, String name, String city)
	{
		this.sid=id;
		this.name=name;
		this.city=city;
		
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		System.out.println("**********************");
		System.out.println("Value of count is " +cnt);
		System.out.println("************************");
		return "StudentStatic [sid=" + sid + ", name=" + name + ", city=" + city + "]";
	}
}
	
	
	
	
	
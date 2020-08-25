package com.hefshine.Constructor;

public class Programming {
	
	String name;

	
	Programming()
	{
		System.out.println("I want to learn language");
	}
	Programming(String name)
	{
		this.name=name;
		System.out.println("I want to learn " +name);
	}
}


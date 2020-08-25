package com.morning.sessions;



abstract class Animal
{
	abstract void sound();
	{
		System.out.println("");
	}
}


abstract class Bird extends Animal
{
	
}

abstract class Reptile extends Animal
{
	
}
class Peacock extends Bird
{
	void sound()
	{
		System.out.println("Wow");
	}
}
class Dog extends Reptile
{
	void sound()
	{
		System.out.println("Bhow bhow");
	}
}


public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d= new Dog();
		d.sound();
		Peacock p= new Peacock();
		p.sound();

	}

}

package com.hefshine.Inheritance;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalMulti a= new AnimalMulti();
		AnimalMulti a1= new AnimalMulti();
		a.id=101;
		a.name="Dolly";
		a.breed="Greman Shepherd";
		a.gender='M';
		
		
		a1.id=102;
		a1.name="Billi";
		a1.breed="Persian cat";
		a1.gender='F';
		
		
		System.out.println("The id is:" +a.id);
		System.out.println("The mame is:" +a.name);
		System.out.println("The breed is:" +a.breed);
		System.out.println("The gender is:" +a.gender);
		
		System.out.println("The id is:" + a1.id);
		System.out.println("The mame is:" + a1.name);
		System.out.println("The breed is:" +a1.breed);
		System.out.println("The gender is:" +a1.gender);
		
		CatMulti c= new CatMulti();
		c.Animal();
		c.Barking();
		c.Eating();
		c.Sleeping();
		c.Playing();
	
		
		
				
		

	}

}

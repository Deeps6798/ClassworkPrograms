package com.morning.sessions;


class Person{
		int id;
		String name;
		String address;
		String mno;
		char gender;
		String dob;
		
	}

	
	class Students extends Person
	{
		int rnoll;
		int eno;
		int marks;
		String subjects;
		String grade;		
	
	 void Study()
	 {
		 System.out.println("nandini is studying");
		 
		 
	 }
	 void Playing()
	 {
		 System.out.println("vishwanth is playing");
	 }
	 void Assignment()
	 {
		 System.out.println("Pawan is doing assignment");
	 }
	}
	 
	class Employee extends Person
	{
		int empid;
		String desgn;
		float sal;
		int exp;
		String dept;
	
	void Exp()
	{
		System.out.println("Rajat has 20yrs of exp");
	}
	void Presentation()
	{
		System.out.println("Sachin is doing presentation");
	}
	void Excirrularactivities()
	{
		System.out.println("Ramesh is doing extra cirrucilar activites");
	}
	 }


public class MyDemoIsA {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1= new Students();
		Employee e1= new Employee();
		
		
		s1.Study();
		s1.Playing();
		s1.Assignment();
		e1.Exp();
		e1.Presentation();
		e1.Excirrularactivities();
		
		
		
	
		
		

	}
	

}

package com.hefshine.inheritance;

public class Teacher extends Stud{

		
		void teach()
		{
			System.out.println("Teaches core java");
		}
		void display()
		{
		 super.teach(); 
		}

	}

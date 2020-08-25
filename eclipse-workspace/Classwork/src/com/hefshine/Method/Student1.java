package com.hefshine.Method;


class Student
	{
	int roll_no;
	String name1;
	long mbno;
	int Totalmarks; 
	
		void InputData(int rn, String name, Long mn, int tm)
		{
			roll_no=rn;
			name1= name;
			mbno=mn;
			Totalmarks=tm;
			
			
			
		}
		
		void Display()
		{
			System.out.println("The id is: " +roll_no);
			System.out.println("The name is: " +name1);
			System.out.println("The mbno is: " +mbno);
			System.out.println("The totalmarks is:" +Totalmarks);
			
		}
	}
	public class Student1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Student s1=new Student();
			s1.InputData(1, "Deeps", 8983442431L, 399);
			s1.Display();
			
			 
		}

}

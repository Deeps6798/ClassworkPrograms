package com.hefshine.HasA;

public class MainHasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s1= new Student3();
		
		Address a1=new Address();
		a1.addline1="shivkrupa colony";
		a1.addline2="nadhe nagar";
		a1.landmark="Shankar mandir";
		a1.city="Pune";
		a1.State="Maharashtra";
		a1.pincode=411017;
		a1.country="India";
		
		Contactno cno= new Contactno();
		cno.mnbo="8983442432";
		cno.landline="782487448";
		cno.emailid="d.lawand@gmail.com";
		
		Emp e= new Emp();
		e.empid=20065401;
		e.name="Sona";
		e.doj="14/07/2020";
		
		
		s1.sname="Pranjal";
		s1.rno=1;
		s1.grade="A";
		s1.add=a1;
		s1.cno=cno;
		s1.e=e;
		
		
		
		System.out.println(s1.sname);
		System.out.println(s1.rno);
		System.out.println(s1.grade);
		System.out.println(s1.add.addline1);
		System.out.println(s1.add.addline2);
		System.out.println(s1.add.landmark);
		System.out.println(s1.add.city);
		System.out.println(s1.add.State);
		System.out.println(s1.add.pincode);
		System.out.println(s1.add.country);
		System.out.println(s1.cno.mnbo);
		System.out.println(s1.cno.landline);
		System.out.println(s1.cno.emailid);
		System.out.println(s1.e.empid);
		System.out.println(s1.e.name);
		System.out.println(s1.e.doj);
		
		

	}

}

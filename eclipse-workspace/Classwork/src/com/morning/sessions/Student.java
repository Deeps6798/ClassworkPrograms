package com.morning.sessions;



public class Student {
int id;
String name;
String lname;
String no;
public void addmissionForm()
{
System.out.println("Fill the application form and enroll into addmission process");
}
public void takeAddmision()
{
System.out.println("Application submited successfully");
}
public void checkStatus()
{
System.out.println("Addmission successfully done");
}


public static void main(String[] args) {
Student s1= new Student();
s1.id=1;
s1.name="Deeps";
s1.lname="Lavand";
s1.no="8983442432";
s1.addmissionForm();
s1.takeAddmision();
s1.checkStatus();



Student s2= new Student();
s2.id=2;
s2.name="Sonali";
s2.lname="Shinde";
s2.no="7387695460";
s2.addmissionForm();
s2.takeAddmision();
s2.checkStatus();



Student s3= new Student();
s3.id=3;
s3.name="chutki";
s3.lname="bheem";
s3.no="7387545454";

s3.takeAddmision();
s3.addmissionForm();
s3.checkStatus();



}

}




package com.jvm;
class Student
{
	int student_ID;
	String name;
	String address;
	int age;
	void display()
	{
		System.out.println("Student ID : " + student_ID);
	    System.out.println("Name       : " + name);
	    System.out.println("Address    : " + address);
	    System.out.println("Age        : " + age);
	}
}
public class InstanceVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Problem: Create a Student class with instance variables 
Student ID, name
 ,Address
 and age .
Create two student objects and display their details*/
		Student s1=new Student();
		s1.student_ID=12;
		s1.name="praveen";
		s1.address="2-40,Ilaparru,krishna dt,Andhra Pradesh";
		s1.age=22;
		Student s2=new Student();

		s2.student_ID=14;
		s2.name="Vinay";
		s2.address="1-40,kosuru,krishna dt,Andhra Pradesh";
		s2.age=21;
		
		s1.display();
		s2.display();
		
		

	}

}

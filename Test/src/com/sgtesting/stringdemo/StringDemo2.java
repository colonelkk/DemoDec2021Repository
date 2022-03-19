package com.sgtesting.stringdemo;

class Student
{
	String firstname;
	int age;
	Student(String fn,int age)
	{
		firstname=fn;
		this.age=age;
	}
	
	public String toString()
	{
		return "Studnet name is "+firstname+" and his age "+age;
	}
}
public class StringDemo2 {
	public static void main(String[] args) {
		Student obj=new Student("Santosh",19);
		System.out.println(obj);

	}

}
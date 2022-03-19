package com.sgtesting.inhertancedemo;
class Student1
{
	void Student(String fname,int age)
	{
		System.out.println("First Name :"+fname);
		System.out.println("Age is :"+age);
	}
}

class Student2 extends Student1
{
	void Department(String name,String sem)
	{
		System.out.println("Department Name :"+name);
		System.out.println("Semister :"+sem);
	}
}

class Student3 extends Student2
{
	void College(String cname,int cid)
	{
		System.out.println("College name :"+cname);
		System.out.println("Student Id :"+cid);
	}
}
public class MultilevelInh {
	public static void main(String[] args) {
		Student3 o=new Student3();
		o.Student("colonel kirankumar", 26);
		o.Department("MCA", "5th sem");
		o.College("AIT", 415);
	}
}

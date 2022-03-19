package com.sgtesting.inhertancedemo;
class Students
{
	void Student(String sname,int id)
	{
		System.out.println("Name of student :"+sname);
		System.out.println("Student id :"+id);
	}
}

class Department extends Students
{
	void Departmen(String Sdept,int id)
	{
		System.out.println("Name of Department :"+Sdept);
		System.out.println("Department Id :"+id);
	}
}

class Employees extends Department
{
	void Employee(String empname,int empid)
	{
		System.out.println("Name of Employee :"+empname);
		System.out.println("Employee Id :"+empid);
	}
}
class EmpDepartment extends Students
{
	void EmpDep(String desg,int sal)
	{
		System.out.println("Employee Designation :"+desg);
		System.out.println("Employee Monthly Salarey :"+"sal");
	}
}
public class HybrideInh {
	public static void main(String[] args) {
		Employees emp=new Employees();
		emp.Student("Colonel", 007);
		emp.Departmen("MCA", 5);
		emp.Employee("kirankumar",10);
		
		EmpDepartment Emp1=new EmpDepartment();
		Emp1.Student("Sachin", 001);
		Emp1.EmpDep("QA Analyst", 100000);
	}
}


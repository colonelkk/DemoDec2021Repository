package com.sgtesting.constructoroverloading;
class University
{
	University(String fullname)
	{
		System.out.println("Full name :"+fullname);
	}
	
	University(int est)
	{
		System.out.println("Established in :"+est);
	}
	University(String add,int pin)
	{
		System.out.println("Address :"+add+" pin:"+pin);
	}
	University(String dept, String spc)
	{
		System.out.println("Department name:"+dept+"Specification:"+spc);
	}
}
public class UniversityDemo {

	public static void main(String[] args) {
		University obj1=new University("vtu");
		University obj2=new University("2020");
		University obj3=new University("vtu Belagum",585101);
		University obj4=new University("Master in computer application","IT & core");
	}

}

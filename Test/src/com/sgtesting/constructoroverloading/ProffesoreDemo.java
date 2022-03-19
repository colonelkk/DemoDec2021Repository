package com.sgtesting.constructoroverloading;

class Profesore
{
	Profesore(String name)
	{
		System.out.println("Profesore Name:"+name);;
	}
	Profesore(String clg,int sal)
	{
		System.out.println("College Name:"+clg+" Salary:"+sal);
	}
	Profesore(String Add,String loc)
	{
		System.out.println("Address:"+Add+" Location:"+loc);
	}
	Profesore(int pin)
	{
		System.out.println("Pincode:"+pin);
	}
}
public class ProffesoreDemo {

	public static void main(String[] args) {
		Profesore obj1=new Profesore("Colonel");
		Profesore obj2=new Profesore("Acharya College",60000);
		Profesore obj3=new Profesore("Hesargatta main road","soladevanhalli");
		Profesore obj4=new Profesore(585101);

	}

}

package com.sgtesting.parameterizedconstructor;

class Desktop
{
	String Name;
	String Monitor;
	Desktop(String name,String monitor)
	{
	 Name=name;
	 Monitor=monitor;
	 System.out.println("Name:"+Name);
	 System.out.println("Monitor:"+Monitor);
	}
	
}
class Laptop
{
	String Name;
	String Comapany;
	String Color;
	Laptop(String name,String company)
	{
		Name=name;
		Comapany=company;
		System.out.println("Name:"+Name);
		System.out.println("Monitor:"+company);
	}
}
class Mobile

{
	String Name;
	String Version; 
	Mobile(String name,String version)
	{
		Name=name;
		Version=version;
		System.out.println("Name:"+Name);
		System.out.println("Monitor:"+version);
	}
}

public class ElectronicDivice {


	public static void main(String[] args) {
		Desktop dec=new Desktop("Acer","="+"Acer nitro");
		Laptop lap=new Laptop("HP","="+"HP MOnitor Screen");
		Mobile mob=new Mobile("SamsungA50s","="+"SAMSUNG");

	}

}

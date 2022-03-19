package com.sgtesting.inhertancedemo;
class Company
{
	Company(String cname,int wheels)
	{
		System.out.println("Name of Company "+cname+" and Noumber Of Wheels "+wheels);
	}
}

class Car extends Company
{
	Car(String name,int wheel)
	{
		super("name",wheel);
	}
}
public class MultilevelInhSuper {
	public static void main(String[] args) {
		Company c=new Company("Benz",4);
		Company c1=new Company("Aoudi",4);
	}
}


package com.sgtesting.inhertancedemo;
class SuperClassDemo
{
	void display(String cityname)
	{
		System.out.println("cityname in super class :" +cityname);
	}
}
class SubClassDemo1 extends SuperClassDemo
{
	SubClassDemo1(String place)
	{
		super.display(place);
	}
	void display(String cityname)
	{
		System.out.println("city name in sub class 1 :" +cityname);
	}
}
class SubClassDemo2 extends SuperClassDemo
{
	SubClassDemo2(String city)
	{
		super.display(city);
	}
	void display(String cityname)
	{
		System.out.println("city name in sub class 2 :" +cityname);
	}
}
public class HeiachicalSameMethodDemo {
	public static void main(String[] args) {
		SubClassDemo2 obj=new SubClassDemo2("Kalaburgi");
		obj.display("Bangalore");
		
		SubClassDemo1 obj1=new SubClassDemo1("Raichure");
		obj1.display("Mysore");
		
				
	}

}

package com.sgtesting.constructoroverloading;

class EngineeringColl
{
	EngineeringColl(String cname)
	{
		System.out.println("College name:"+cname);
	}
	EngineeringColl(String loc,String grade)
	{
		System.out.println("Location :"+loc+" Grade:"+grade);
	}
	EngineeringColl(String add,int pin)
	{
		System.out.println("Address:"+add+" Pincode:"+pin);
	}
	
}
public class EngineeringCollegeDemo {

	public static void main(String[] args) {
	
		EngineeringColl obj1=new EngineeringColl("Acharya institute of Technology");
		EngineeringColl obj2=new EngineeringColl("Bengalore","A Grade");
		EngineeringColl obj3=new EngineeringColl("Near Hesargatta",585101);
	}

}

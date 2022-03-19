package com.sgtesting.parameterizedconstructor;

class Bird
{
	String Firstname;
	int Wings;
	Bird(String fname,int Wing)
	{
		Firstname=fname;
		Wings=Wing;
		System.out.println("First Name:"+fname);
		System.out.println("Wings:"+Wing);

	}
	
}

class Animals
{
	String Firstname;
	int Legs;
	Animals(String fname,int leg)
	{
		Firstname=fname;
		Legs=leg;
		System.out.println("First Name:"+fname);
		System.out.println("Legs:"+Legs);
	}
	
}

class Plants
{
	String Firstname;
	String Food;
	Plants(String fname,String food)
	{
		Firstname=fname;
		Food=food;
		System.out.println("First Name:"+fname);
		System.out.println("Food:"+food);

	}
	
}
public class Nature {

	public static void main(String[] args) {
		Bird b=new Bird("Mango",+ 2);

		Animals a=new Animals("Mango",+ 4);
	
		Plants p=new Plants("Mango","+ CO2");
	

	}

}

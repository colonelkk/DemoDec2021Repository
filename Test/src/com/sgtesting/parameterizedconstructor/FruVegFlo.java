package com.sgtesting.parameterizedconstructor;

class Fruits
{
	String FirstName;
	String Waigth;
	Fruits(String fname,String kg)
	{
		FirstName=fname;
		Waigth=kg;
		System.out.println("First Name:"+fname);
		System.out.println("Waigth:"+kg);

	}
}

	class Flower
	{
		String Firstname;
		String color;
		Flower(String fname,String color)
		{
			Firstname=fname;
			String Color = color;
			System.out.println("First Name:"+fname);
			System.out.println("Color:"+color);

		}
	}

	class Vegetables
	{
		String Firstname;
		String Color;
		Vegetables(String fname,String color)
		{
			Firstname=fname;
			String Color = color;
			System.out.println("First Name:"+fname);
			System.out.println("Color:"+color);

		}
	}

	public class FruVegFlo {

		public static void main(String[] args) {
			Fruits fru=new Fruits("Mango","+2 kg");
		
			Flower flow=new Flower("lotus","="+"red");
			
			Vegetables veg=new Vegetables("Tomato","="+"Red");
			

		}
	}





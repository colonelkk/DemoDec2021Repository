package com.sgtesting.programs;
class Fruits
{
 String FirstName;
 String Waigth;
 String Strcture;
 String color;
}

class Flower
{
	 String FirstName;
	 String Shap;
	 String Color;
	 int pices;
}

class Vegetables
{
	String Firstname;
	String Waight;
	String Color;
	int Rate;
}

public class FruFloVeg {

	public static void main(String[] args) {
		Fruits fru=new Fruits();
		fru.FirstName="mango";
		fru.Waigth="2kg";
		fru.Strcture="EclipsShape";
		fru.color="yellow";
		System.out.println("FirstName:"+fru.FirstName);
		System.out.println("Waigth:"+fru.Waigth);
		System.out.println("Strcture:"+fru.Strcture);
		System.out.println("color:"+fru.color);
		System.out.println("*************************");
		Flower flow=new Flower();
		flow.FirstName="lotus";
		flow.Shap="Openround";
		flow.Color="Pinkred";
		flow.pices=100;
		System.out.println("FirstName:"+flow.FirstName);
		System.out.println("Shap:"+flow.Shap);
		System.out.println("Color:"+flow.Color);
		System.out.println("pices:"+flow.pices);
		System.out.println("*************************");
		Vegetables veg=new Vegetables();
		veg.Firstname="Tomato";
		veg.Waight="5kg";
		veg.Color="Red";
		veg.Rate=100;
		System.out.println("FirstName:"+flow.FirstName);
		System.out.println("Shap:"+flow.Shap);
		System.out.println("Color:"+flow.Color);
		System.out.println("pices:"+flow.pices);
		System.out.println("*************************");
	    	
	}

}

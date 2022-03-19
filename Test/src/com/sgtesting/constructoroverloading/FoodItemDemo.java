package com.sgtesting.constructoroverloading;

class FoodItem
{
	FoodItem(String name)
	{
		System.out.println("Hotel Name:"+name);;
	}
	FoodItem(String id,int pices)
	{
		System.out.println("FoodItem:"+id+" NoofPices"+pices);
	}
	FoodItem(String color,String type)
	{
		System.out.println("Idlly colr:"+color+" Type:"+type);
	}
	FoodItem(int grams)
	{
		System.out.println("WaightOfIdly:"+grams);
	}
}
public class FoodItemDemo {

	public static void main(String[] args) {
		FoodItem obj1=new FoodItem("Shanthi Sagar");
		FoodItem obj2=new FoodItem("Idly and samber",2);
		FoodItem obj3=new FoodItem("White","Soft");
		FoodItem obj4=new FoodItem(200);

	}

}

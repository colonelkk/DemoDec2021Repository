package com.sgtesting.programs;
class Bird
{
	String Firstname;
	int Wings;
	String color;
	int Legs;
	
}

class Animals
{
	String Firstname;
	String Color;
	String Breed;
	int Legs;
	
}

class Plants
{
	String Firstname;
	String Leaf;
	String Food;
	
}
public class Nature {

	public static void main(String[] args) {
		Bird b=new Bird();
		b.Firstname="Sparrow";
		b.Wings=2;
		b.color="Graygreen";
		b.Legs=2;
		System.out.println("Firstname:"+b.Firstname);
		System.out.println("Wings:"+b.Wings);
		System.err.println("color:"+b.color);
		System.out.println("Legs:"+b.Legs);
		System.out.println("*********************************");
		Animals a=new Animals();
		a.Firstname="Dog";
		a.Color="White";
		a.Breed="Geraman";
		a.Legs=4;
		System.out.println("Firstname:"+a.Firstname);
		System.out.println("Color:"+a.Color);
		System.err.println("Breed:"+a.Breed);
		System.out.println("Legs:"+a.Legs);
		System.out.println("*********************************");
		Plants p=new Plants();
		p.Firstname="Nimtree";
		p.Leaf="Infinite";
		p.Food="CO2";
		System.out.println("Firstname:"+p.Firstname);
		System.out.println("Leaf:"+p.Leaf);
		System.err.println("Food:"+p.Food);
		
		System.out.println("*********************************");


	}

}

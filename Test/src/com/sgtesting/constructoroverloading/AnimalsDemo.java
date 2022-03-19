package com.sgtesting.constructoroverloading;

class Animal
{
	Animal(String name)
	{
		System.out.println("Animal name:"+name);;
	}
	Animal(String Breed,int legs)
	{
		System.out.println("BREED:"+Breed+" NOOfLegs:"+legs);
	}
	Animal(String color,String type)
	{
		System.out.println("COLOR:"+color+" Type:"+type);
	}
	Animal(int kgs)
	{
		System.out.println("Weight of animal:"+kgs);
	}
}
public class AnimalsDemo {

	public static void main(String[] args) {
		Animal obj1=new Animal("cow");
		Animal obj2=new Animal("Jersy",4);
		Animal obj3=new Animal("Black ana White","Domestic");
		Animal obj4=new Animal(500);

	}

}

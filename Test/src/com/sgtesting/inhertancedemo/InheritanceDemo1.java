//1. Simple Inheritance:
//------------------------
//In this type of inheritance, A sub class extends one super class.if we can create object for sub class then we can access all the members of super class and all the members of sub class.
//Addition Result :60
//Subtraction Result :25
package com.sgtesting.inhertancedemo;
class Math
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}

class Math1 extends Math
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Math1 o=new Math1();
		o.addition(20, 40);
		o.substraction(40, 15);
	}
}


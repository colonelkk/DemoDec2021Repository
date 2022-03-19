package com.sgtesting.inhertancedemo;
class MathMS1
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}

class MathMS2 extends MathMS1
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}

class MathMS3 extends MathMS2
{
	void division(int x,int y)
	{
		System.out.println("Division Result :"+(x/y));
	}
}
class MathMS4 extends MathMS1
{
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result :"+(x*y));
	}
}
public class Hybrid {
	public static void main(String[] args) {
		MathMS3 o=new MathMS3();
		o.addition(30, 20);
		o.substraction(10, 5);
		o.division(50, 10);
		
		MathMS4 o2=new MathMS4();
		o2.addition(60, 70);
		o2.multiplication(12, 10);
	}
}
package com.sgtesting.inhertancedemo;
class MathM1
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}

class MathM2 extends MathM1
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}

class MathM3 extends MathM2
{
	void division(int x,int y)
	{
		System.out.println("Division Result :"+(x/y));
	}
}
public class Multilevel {
	public static void main(String[] args) {
		Maths3 o=new Maths3();
		o.addition(30, 20);
		o.substraction(10, 5);
		o.division(50, 10);
	}
}
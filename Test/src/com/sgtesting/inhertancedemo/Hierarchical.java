
package com.sgtesting.inhertancedemo;
class Maths1
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}

class Maths2 extends Maths1
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}

class Maths3 extends Math1
{
	void division(int x,int y)
	{
		System.out.println("Division Result :"+(x/y));
	}
}
public class Hierarchical {
	public static void main(String[] args) {
		Maths2 o=new Maths2();
		o.addition(20, 40);
		o.substraction(40, 15);
		
		Maths3 o2=new Maths3();
		o2.addition(40, 50);
		o2.division(25, 5);
	}
}

//2. hierarchical  Inheritance:
//------------------------------
//In this type of Inheritance, 'N' number of sub classes are extending one super class.
/*Addition Result :60
Subtraction Result :25
Addition Result :90
Division Result :5
*/
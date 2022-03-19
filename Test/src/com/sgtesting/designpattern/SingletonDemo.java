//singleton Design pattern

package com.sgtesting.designpattern;
class Test
{
	public static Test obj=null;
	private Test()
	{
		// It is a private Constructor
	}
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
	void multiplication(int a,int b)
	{
		int result=(a*b);
		System.out.println("Multiplication Result:"+result);
	}
	public static Test getInstance()
	{
		if(obj==null)
		{
			obj=new Test();
		}
		return obj;
	}
}
public class SingletonDemo {
	public static void main(String[] args) {
		Test t1=Test.getInstance();
		t1.addition(20, 40);
		t1.multiplication(5,10);
		
		Test t2=Test.getInstance();
		t2.addition(10, 20);
		t2.multiplication(12, 9);
		
		Test t3=Test.getInstance();
		t3.addition(40, 50);
		t3.multiplication(15, 10);
		
		if((t1==t2) && (t2==t3))
		{
			System.out.println("All objecte have same reference....");
		}
		else
		{
			System.out.println("All objects have not same reference....");
		}

	}

}

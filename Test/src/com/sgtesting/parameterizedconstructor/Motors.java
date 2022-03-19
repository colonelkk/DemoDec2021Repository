package com.sgtesting.parameterizedconstructor;
class TwoWheel
{
	String Firstname;
	int Wheels;
	TwoWheel(String fname,int wheel)
	{
	Firstname=fname;
	Wheels=wheel;
	System.out.println("First Name:"+fname);
	System.out.println("Wheels:"+wheel);
	}
}
class FourWheel
{
	String Firstname;
	int Wheels;
	FourWheel(String fname, int wheel)
	{
		Firstname=fname;
		Wheels=wheel;
		System.out.println("First Name:"+fname);
		System.out.println("Wheels:"+wheel);
	}
}
public class Motors {

	public static void main(String[] args) {
		TwoWheel bike=new TwoWheel("KTM:",+2);
		
		FourWheel car=new FourWheel("TWO SEATER BENZ CAR:",+4);

	}

}

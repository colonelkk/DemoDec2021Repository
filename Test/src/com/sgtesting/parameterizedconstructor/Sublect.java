package com.sgtesting.parameterizedconstructor;

class Mathematics
{
	String Firstname;
	String Lasttaken;
	Mathematics(String fname,String ltake)
	{
		Firstname=fname;
		Lasttaken=ltake;
		System.out.println("Firstname:"+fname);
		System.out.println("Lasttaken:"+ltake);
	}
}

class Physics
{
	String Firstname;
	String Lasttaken;
	Physics(String fname,String ltake)
	{
		Firstname=fname;
		Lasttaken=ltake;
		System.out.println("Firstname:"+fname);
		System.out.println("Lasttaken:"+ltake);
	}
}

class Chemistry
{

	String Firstname;
	String Lasttaken;
	Chemistry(String fname,String ltake)
	{
		Firstname = fname;
		Lasttaken=ltake;
		System.out.println("Firstname:"+fname);
		System.out.println("Lasttaken:"+ltake);
	}
}

public class Sublect {

	public static void main(String[] args) {
		Mathematics maths=new Mathematics("Algebra","Monday");

		Physics phy=new Physics("Newton Law","Tuesday");

		Chemistry chem=new Chemistry("KING OF ACID Sulphuric Acid","friday");
	}

}

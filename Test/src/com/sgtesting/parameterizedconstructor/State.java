package com.sgtesting.parameterizedconstructor;

class Metrocity
{
	String Firstname;
	String Colonys;
	Metrocity(String fname,String clny)
	{
		Firstname=fname;
		Colonys=clny;
		System.out.println("Firstname:"+fname);
		System.out.println("Colonys:"+clny);
	}
}

class Distic
{
	String Firstname;
	String Colonys;
	Distic(String fname,String clny)
	{
		Firstname=fname;
		Colonys=clny;
		System.out.println("Firstname:"+fname);
		System.out.println("Colonys:"+clny);
	}
}

class Taluka
{
	String Firstname;
	String Stop;
	Taluka(String fname,String stop)
	{
		Firstname=fname;
		Stop=stop;
		System.out.println("Firstname:"+fname);
		System.out.println("Stop:"+stop);
	}
}
public class State {

	public static void main(String[] args) {
		Metrocity met=new Metrocity("Bangalore","Hampinagar");
		
		Distic Dist=new Distic("Gulbarga","Devi nagar");
		
		Taluka tq=new Taluka("Kamlapur","Bus stop");
		

	}

}

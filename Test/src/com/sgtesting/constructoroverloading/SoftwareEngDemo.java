package com.sgtesting.constructoroverloading;

class SoftwareEng
{
	SoftwareEng(String name)
	{
		System.out.println("Name of emp:"+name);;
	}
	SoftwareEng(String desig,int sal)
	{
		System.out.println("Emp Designation:"+desig+" Salary:"+sal);
	}
	SoftwareEng(String Add,String loc)
	{
		System.out.println("Copaney Address:"+Add+" Location:"+loc);
	}
	SoftwareEng(int pin)
	{
		System.out.println("Pincode:"+pin);
	}
}
public class SoftwareEngDemo {

	public static void main(String[] args) {
		SoftwareEng obj1=new SoftwareEng("Colonel Kirankumar");
		SoftwareEng obj2=new SoftwareEng("Quality Analysis",100000);
		SoftwareEng obj3=new SoftwareEng("Tech park","Banglore");
		SoftwareEng obj4=new SoftwareEng(585101);

	}

}

package com.sgtesting.programs;
class person
{
	String Firstname;
	int Age;
	public String firstname;
	


}
class Birds
{
	public static final String QuantityOfMilkProvider = null;
	public static final String BreedName = null;
	String FetherColor;
	int NoOfWings;
}
class DomesticAnimal

{
	String QuantityOfMilkProvider;
	String BreedName;
}
public class Demo {

	public static void main(String[] args) {
		person santu=new  person();
		santu.firstname="santhosh";
		santu.Age=19;
		System.out.println("Firstname:"+santu.firstname);
		System.out.println("Age:"+santu.Age);
		System.out.println("*****************");
		Birds sparrow=new Birds();
		sparrow.FetherColor="gray";
		sparrow.NoOfWings=2;
		System.out.println("FetherColor:"+sparrow.FetherColor);
		System.out.println("NoOfWings:"+sparrow.NoOfWings);
		System.out.println("*****************");
		DomesticAnimal cow=new DomesticAnimal();
		cow.QuantityOfMilkProvider="10 litter";
		cow.BreedName="Giriraj";
		System.out.println("QuantityOfMilkProvider:"+sparrow.QuantityOfMilkProvider);
		System.out.println("BreedName:"+sparrow.BreedName);
		System.out.println("*****************");
		
	}

}

package com.sgtesting.programs;
class TwoWheeler
{
	String Firstname;
	int Wheels;
	int Seats;
	String price;
	String Speed;
}

class FourWheeler
{
	String Firstname;
	int Wheels;
	int Seats;
	String price;
	String Speed;
}
public class Motorts {

	public static void main(String[] args) {
		TwoWheeler two=new TwoWheeler();
		two.Firstname="KTM";
		two.Wheels=2;
		two.Seats=2;
		two.price="1.80lack";
		two.Speed="220kmph";
		System.out.println("Firstname:"+two.Firstname);
		System.out.println("Wheels:"+two.Wheels);
		System.out.println("price:"+two.price);
		System.out.println("Speed:"+two.Speed);
		System.out.println("********************************");
		FourWheeler four=new FourWheeler();
		four.Firstname="Benz";
		four.Wheels=2;
		four.Seats=2;
		four.price="80lack";
		four.Speed="450kmph";
		System.out.println("Firstname:"+four.Firstname);
		System.out.println("Wheels:"+four.Wheels);
		System.out.println("price:"+four.price);
		System.out.println("Speed:"+four.Speed);
		System.out.println("********************************");
		

	}

}

package com.sgtesting.noargsconstructur;
		class TwoWheeler
		{
			String Firstname;
			int Wheels;
			int Seats;
			String price;
			String Speed;
			TwoWheeler()
			{
				Firstname="KTM";
				Wheels=2;
				Seats=2;
				price="1.80lack";
				Speed="220kmph";
				System.out.println("Firstname:"+Firstname);
				System.out.println("Wheels:"+Wheels);
				System.out.println("price:"+price);
				System.out.println("Speed:"+Speed);
				System.out.println("********************************");
			}
		}

		class FourWheeler
		{
			String Firstname;
			int Wheels;
			int Seats;
			String price;
			String Speed;
			FourWheeler()
			{
				Firstname="Benz";
				Wheels=2;
				Seats=2;
				price="80lack";
				Speed="450kmph";
				System.out.println("Firstname:"+Firstname);
				System.out.println("Wheels:"+Wheels);
				System.out.println("price:"+price);
				System.out.println("Speed:"+Speed);
				System.out.println("********************************");
			}
		}
		public class Moto {

			public static void main(String[] args) {
				TwoWheeler two=new TwoWheeler();
				
				FourWheeler four=new FourWheeler();
				
				

			}

		


	}



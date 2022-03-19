package com.sgtesting.noargsconstructur;

		class Bird
		{
			String Firstname;
			int Wings;
			String color;
			int Legs;
			Bird()
			{
				Firstname="Sparrow";
				Wings=2;
				color="Graygreen";
				Legs=2;
				System.out.println("Firstname:"+Firstname);
				System.out.println("Wings:"+Wings);
				System.err.println("color:"+color);
				System.out.println("Legs:"+Legs);
				System.out.println("*********************************");
			}
			
		}

		class Animals
		{
			String Firstname;
			String Color;
			String Breed;
			int Legs;
			Animals()
			{
				Firstname="Dog";
				Color="White";
				Breed="Geraman";
				Legs=4;
				System.out.println("Firstname:"+Firstname);
				System.out.println("Color:"+Color);
				System.err.println("Breed:"+Breed);
				System.out.println("Legs:"+Legs);
				System.out.println("*********************************");
			}
		}

		class Plants
		{
			String Firstname;
			String Leaf;
			String Food;
			Plants()
			{
				Firstname="Nimtree";
				Leaf="Infinite";
				Food="CO2";
				System.out.println("Firstname:"+Firstname);
				System.out.println("Leaf:"+Leaf);
				System.err.println("Food:"+Food);
				
				System.out.println("*********************************");
			}
		}
		public class Nature {

			public static void main(String[] args) {
				Bird b=new Bird();
				
				Animals a=new Animals();
			
				Plants p=new Plants();
			


			}

		


	}



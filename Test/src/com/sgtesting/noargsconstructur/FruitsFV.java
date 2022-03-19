package com.sgtesting.noargsconstructur;
		class Fruits
		{
		 String FirstName;
		 String Waigth;
		 String Strcture;
		 String color;
		 Fruits()
		 {
			    FirstName="mango";
				Waigth="2kg";
				Strcture="EclipsShape";
				color="yellow";
				System.out.println("FirstName:"+FirstName);
				System.out.println("Waigth:"+Waigth);
				System.out.println("Strcture:"+Strcture);
				System.out.println("color:"+color);
				System.out.println("*************************");
		 }
		}

		class Flower
		{
			 String FirstName;
			 String Shap;
			 String Color;
			 int pices;
			 Flower()
			 {
				    FirstName="lotus";
					Shap="Openround";
					Color="Pinkred";
					pices=100;
					System.out.println("FirstName:"+FirstName);
					System.out.println("Shap:"+Shap);
					System.out.println("Color:"+Color);
					System.out.println("pices:"+pices);
					System.out.println("*************************");
			 }
		}

		class Vegetables
		{
			
			private static final String Shap = null;
			String Firstname;
			String Waight;
			String Color;
			int Rate;
			String pices;
			Vegetables()
			{
				Firstname="Tomato";
				Waight="5kg";
				Color="Red";
				Rate=100;
				System.out.println("FirstName:"+Firstname);
				System.out.println("Shap:"+Shap);
				System.out.println("Color:"+Color);
				
				System.out.println("pices:"+pices);
				System.out.println("*************************");
			}
		}

		public class FruitsFV {

			public static void main(String[] args) {
				Fruits fru=new Fruits();
				
				Flower flow=new Flower();
				
				Vegetables veg=new Vegetables();
				
			    	
			

		


	}

}

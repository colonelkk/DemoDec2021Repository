package com.sgtesting.noargsconstructur;


		class Mathematics
		{
			String Firstname;
			String Location;
			int Noofbooks;
			String Lasttaken;
			Mathematics()
			{
				Firstname="Algebra";
				Location="Table 10";
				Noofbooks=10;
				Lasttaken="Sunday";
				System.out.println("Firstname:"+Firstname);
				System.out.println("Location:"+Location);
				System.out.println("Noofbooks:"+Noofbooks);
				System.out.println("Lasttaken:"+Lasttaken);
				System.out.println("*******************************");
			}
		}

		class Physics
		{
			String Firstname;
			String Location;
			int Noofbooks;
			String Lasttaken;
			Physics()
			{
				Firstname="NewtonLaw";
				Location="Table";
				Noofbooks=12;
				Lasttaken="Saturday";
				System.out.println("Firstname:"+Firstname);
				System.out.println("Location:"+Location);
				System.out.println("Noofbooks:"+Noofbooks);
				System.out.println("Lasttaken:"+Lasttaken);
				System.out.println("*******************************");
			}
		}

		class Chemistry
		{

			String Firstname;
			String Location;
			int Noofbooks;
			String Lasttaken;
			Chemistry()
			{
				Firstname="KingofAcid";
				Location="Table 2";
				Noofbooks=18;
				Lasttaken="Friday";
				System.out.println("Firstname:"+Firstname);
				System.out.println("Location:"+Location);
				System.out.println("Noofbooks:"+Noofbooks);
				System.out.println("Lasttaken:"+Lasttaken);
				System.out.println("*******************************");
			}
		}
		public class Subject {

			public static void main(String[] args) {
				Mathematics maths=new Mathematics();
				
				Physics phy=new Physics();
			
				Chemistry chem=new Chemistry();
				
			
				
			

		


	}

}

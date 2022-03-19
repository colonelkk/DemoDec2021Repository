package com.sgtesting.parameterizedconstructor;
class Player
{
	String playername;
	int age;
	Player(String pname,int Age)
	{
		playername=pname;
		age=Age;
		System.out.println("player Name:"+playername);
		System.out.println("Age:"+age);
	}
		
}

	public class ParConDemo {

	public static void main(String[] args) {
		Player sachin=new Player("Sachin Tendulakar",55);
		Player virat=new Player("virat kohli",33);

	}

	}

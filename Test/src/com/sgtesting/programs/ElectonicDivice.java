package com.sgtesting.programs;
class Desktop
{
	String Name;
	String Monitor;
	String Keybord;
	String Mouse;
	
	
}
class Laptop
{
	String Name;
	String Comapany;
	String Color;
	String Os;
	String Camera;
}
class Mobile

{
	String Name;
	String Version;
	String Storage;
	String Camera; 
}
public class ElectonicDivice {

	public static void main(String[] args) {
		Desktop a=new  Desktop();
		a.Name="Acer";
		a.Monitor="19.5inch";
		a.Keybord="predatorAtohn";
		a.Mouse="AcerNitro";
		System.out.println("Name:"+a.Name);
		System.out.println("Monitor:"+a.Monitor);
		System.out.println("Keybord:"+a.Keybord);
		System.out.println("Mouse:"+a.Mouse);
		System.out.println("*****************");
		Laptop b=new Laptop();
		b.Name="Acer";
		b.Comapany="Acer";
		b.Color="White";
		b.Os="Windows10";
		b.Camera="8megapixel";
		System.out.println("Name:"+a.Name);
		System.out.println("Comapany:"+b.Comapany);
		System.out.println("Color:"+b.Color);
		System.out.println("Os:"+b.Os);
		System.out.println("Camera:"+b.Camera);
		System.out.println("*****************");
		Mobile c=new Mobile();
		c.Name="SamsungGlaxyA50s";
		c.Version="Android";
		c.Storage="16gbinbuilt";
		b.Os="Windows10";
		c.Camera="16megapixel";
		System.out.println("Name:"+c.Name);
		System.out.println("Version:"+c.Version);
		System.out.println("Storage:"+c.Storage);
		System.out.println("Os:"+b.Os);
		System.out.println("Camera:"+c.Camera);
		System.out.println("*****************");
		
		
	}

}

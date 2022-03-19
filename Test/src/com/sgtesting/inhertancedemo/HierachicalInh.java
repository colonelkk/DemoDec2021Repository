package com.sgtesting.inhertancedemo;
class Birds
{
	void Bird(String bname,int noofwing)
	{
		System.out.println("Name of Bird :"+bname);
		System.out.println("No OF Wings :"+noofwing);
	}
}

class Animals extends Birds
{
	void Animal(String aname,String color)
	{
		System.out.println("Name of Animal :"+aname);
		System.out.println("Color of Animal :"+color);
	}
}

class Tree extends Birds
{
	void Trees(String tname,String lcolor)
	{
		System.out.println("Name of Tree :"+tname);
		System.out.println("Leef color :"+lcolor);
	}
}
public class HierachicalInh {
	public static void main(String[] args) {
		Animals a=new Animals();
		a.Bird("Parote", 2);
		a.Animal("panther", "Black");
		
		Tree o2=new Tree();
		o2.Bird("pegion", 2);
		o2.Trees("Baniun Tree","Green");
	}
}


package com.sgtesting.programs;

class Metrocity
{
	String Firstname;
	String Stop;
	String Ariaofsqurefeet;
	String Colonys;
}

class Distic
{
	String Firstname;
	String Stop;
	String Ariaofsqurefeet;
	String Colonys;
}

class Taluka
{
	String Firstname;
	String Stop;
	String Ariaofsqurefeet;
	String Colonys;
}
public class State {

	public static void main(String[] args) {
		Metrocity met=new Metrocity();
		met.Firstname="Banglore";
		met.Stop="vijaynagar";
		met.Ariaofsqurefeet="80kilometersqft";
		met.Colonys="hampinaga";
	    System.out.println("Firstname:"+met.Firstname);
	    System.out.println("Stop:"+met.Stop);
	    System.out.println("Ariaofsqurefeet:"+met.Ariaofsqurefeet);
	    System.out.println("Colonys:"+met.Colonys);
	    System.out.println("******************************************");
		Distic Dist=new Distic();
		Dist.Firstname="Gulabarga";
		Dist.Stop="Devinagar";
		Dist.Ariaofsqurefeet="60kilometersqft";
		Dist.Colonys="Quadrichouk";
	    System.out.println("Firstname:"+Dist.Firstname);
	    System.out.println("Stop:"+Dist.Stop);
	    System.out.println("Ariaofsqurefeet:"+Dist.Ariaofsqurefeet);
	    System.out.println("Colonys:"+Dist.Colonys);
	    System.out.println("******************************************");
		Taluka tq=new Taluka();
		tq.Firstname="Kamalapur";
		tq.Stop="Bustop";
		tq.Ariaofsqurefeet="30kilometersqft";
		tq.Colonys="MasterColoney";
	    System.out.println("Firstname:"+tq.Firstname);
	    System.out.println("Stop:"+tq.Stop);
	    System.out.println("Ariaofsqurefeet:"+tq.Ariaofsqurefeet);
	    System.out.println("Colonys:"+tq.Colonys);
	    System.out.println("******************************************");

	}

}

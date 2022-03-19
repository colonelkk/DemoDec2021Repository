package com.sgtesting.stringdemo;

public class StringDemo1 {
	public static void main(String[] args) {
		strLength();
		verifyEmptyStr();
		getCharacter();
		concatStr();
		replaceStr();
		compareString1();
		compareString2();
		existanceOfString();
		extractString();
		splitStr();
		findPositionChar();
		findPositionStr();
		findPositionRevStr();
		lowerCase();
		upperCase();
	}
	
	private static void strLength()
	{
		String s="Core Java";
		int a=s.length();
		System.out.println("# of Chars:"+a);
		System.out.println("++++++++++++++");
	}
	
	private static void verifyEmptyStr()
	{
		String s=new String();
		System.out.println("Is it a empty String?:"+s.isEmpty());
		System.out.println("++++++++++++++");
	}

	private static void getCharacter()
	{
		String s=new String("JAVA");
		char ch=s.charAt(2);
		System.out.println("Extractd Char based on Index :"+ch);
		System.out.println("++++++++++++++");
	}
	
	private static void concatStr()
	{
		String s="Java";
		String s1=s.concat(" Program");
		System.out.println("Concatenation String:"+s1);
		System.out.println("++++++++++++++");
	}
	
	private static void replaceStr()
	{
		String s="It is a palace";
		System.out.println("Replaced String:"+s.replace("is", "was"));
		System.out.println("++++++++++++++");
	}
	
	private static void compareString1()
	{
		String s1="JAVA";
		String s2="java";
		System.out.println("s1 and s2 are equal?:"+(s1.equals(s2)));
		System.out.println("Ignore Case: s1 and s2 are equal?:"+(s1.equalsIgnoreCase(s2)));
		System.out.println("++++++++++++++");
	}
	
	private static void compareString2()
	{
		String s1="JAVA";
		String s2="java";
		System.out.println("s1 and s2 are equal?:"+(s1.compareTo(s2)));
		System.out.println("Ignore Case: s1 and s2 are equal?:"+(s1.compareToIgnoreCase(s2)));
		System.out.println("++++++++++++++");
	}
	
	private static void existanceOfString()
	{
		String s="The temple is at the top of the hill";
		System.out.println("Starts With :"+s.startsWith("The"));
		System.out.println("Contains :"+s.contains("top"));
		System.out.println("Ends With :"+s.endsWith("hill"));
		System.out.println("++++++++++++++");
	}
	
	private static void extractString()
	{
		String s="Programming";
		System.out.println("Extract based on index:"+s.substring(3));
		System.out.println("Extract based on Range:"+s.substring(3,7));
		System.out.println("++++++++++++++");
	}
	
	private static void splitStr()
	{
		String s="Apple,Mango,Orange,Banana";
		String s1[]=s.split(",");
		for(String kk:s1)
		{
			System.out.println(kk);
		}
		System.out.println("++++++++++++++");
	}
	
	private static void findPositionChar()
	{
		String s="xxaxxaxxaXXAXXA";
		int p1=s.indexOf("a");
		System.out.println("Pos of first occurance of 'a' :"+p1);
		System.out.println("Pos of first occurance of 'a' :"+s.indexOf('a', 3));
		System.out.println("++++++++++++++");
	}
	
	private static void findPositionStr()
	{
		String s="It is an old palace";
		int p1=s.indexOf("old");
		System.out.println("Pos of first occurance of 'old' :"+p1);
		System.out.println("++++++++++++++");
	}
	
	private static void findPositionRevStr()
	{
		String s="It is an old palace old";
		int p1=s.lastIndexOf("old");
		System.out.println("Pos of first occurance of 'old' in reverse order :"+p1);
		System.out.println("++++++++++++++");
	}
	
	private static void lowerCase()
	{
		String s="PROGRAMMING";
		System.out.println("Lower Case Result:"+s.toLowerCase());
		System.out.println("++++++++++++++");
	}
	
	private static void upperCase()
	{
		String s="programming";
		System.out.println("Upper Case Result:"+s.toUpperCase());
		System.out.println("++++++++++++++");
	}
}

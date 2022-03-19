//With using length method find out no of characters available in a given string

package com.sgtesting.stringdemo;
class Sample
{
	static int getLength(String str)
	{
		return str.length();
	}
}
public class UsinggetLengthMethod {

	public static void main(String[] args) {
		int aa=Sample.getLength("java");
		System.out.println(aa);
	}

}

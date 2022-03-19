// program after space its count out is 7
package com.sgtesting.stringdemo;
class Sample2
{
	static int getLength(String str)
	{
		int len=str.lastIndexOf(" ");
		return len;
	}
}
public class StringDemo5 {

	public static void main(String[] args) {
		int aa=Sample2.getLength("program ");
		System.out.println(aa);

	}

}

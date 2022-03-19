////Without using length method find out no of characters available in a given string

package com.sgtesting.stringdemo;
class Sample1
{
	static int getLength(String str)
	{
		char ch[]=str.toCharArray();
		int count=0;
		for(char ch1:ch)
		{
			count+=1;
		}
		return count;
	}
}
public class WithoutUsingLengthMethod {

	public static void main(String[] args) {
		
		int aa=Sample1.getLength("program");
		System.out.println(aa);
		

	}

}

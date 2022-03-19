//find the index of small 'a' and find the index of capital 'A' and also position of temple and last temple position

package com.sgtesting.stringdemo;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str="xxaxxaxxaXXAXXA";
		int p=str.indexOf('a');
		System.out.println(p);
		
		int p1=str.indexOf('a',3);
		System.out.println(p1);
		
		int p2=str.indexOf('A',6);
		System.out.println(p2);
		System.out.println("++++++++++++++++++");
		
		String str1="The temple is at the top of temple";
		int q1=str1.indexOf("temple");
		System.out.println(q1);
		
		int q2=str1.indexOf("temple",10);
		System.out.println(q2);
	}

}

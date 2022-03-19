package com.sgtesting.designpattern;

public class Pattern1 {

	public static void main(String[] args) {
		int k=1;
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.println(k+" ");
				k=k++;
				j=j++;
			}while(j<=i);
			System.out.println();
			i=i+1;
		}while(i<=5);

	}

}

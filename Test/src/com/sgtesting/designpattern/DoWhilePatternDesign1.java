package com.sgtesting.designpattern;

public class DoWhilePatternDesign1 {
	public static void main(String[] args) {
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print("#");
				j=j+1;
			}while(j<=8);
			i=i+1;
			System.out.println();
		}while(i<=3);

	}

}

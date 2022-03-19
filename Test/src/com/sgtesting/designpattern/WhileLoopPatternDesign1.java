package com.sgtesting.designpattern;

public class WhileLoopPatternDesign1 {

	public static void main(String[] args) {
		int i=1;
		while(i<=3)
		{
			int j=1;
			while(j<=8)
			{
				System.out.print("#");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}

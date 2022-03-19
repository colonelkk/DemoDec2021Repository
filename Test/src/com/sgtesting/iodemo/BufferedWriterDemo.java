package com.sgtesting.iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		writeContent();
	}
	private static void writeContent()
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter("D:\\CITY\\DEMO\\Welcome.txt",true));
			bw.write("Java is a programming language,It is used for development...");
			bw.newLine();
			bw.write("Java supports OOPS concept for developing applications...");
			bw.newLine();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

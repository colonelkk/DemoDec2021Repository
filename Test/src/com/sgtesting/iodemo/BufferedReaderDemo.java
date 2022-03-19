package com.sgtesting.iodemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		readContent();
	}
	
	private static void readContent()
	{
		FileReader fw=null;
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new FileReader("D:\\CITY\\DEMO\\Sample.txt"));
			String strLine=null;
			while((strLine=br.readLine())!=null)
			{
				System.out.println(strLine);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

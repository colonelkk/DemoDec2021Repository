package com.sgtesting.iodemo;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
	//	createFile();
	//	renameFile();
	//	deleteFile();
		fileCollections();
	}
	
	private static void createFile()
	{
		try
		{
			File f=new File("D:\\CITY\\DEMO\\Welcome.txt");
			boolean val=f.createNewFile();
			System.out.println(val);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void renameFile()
	{
		File f=new File("D:\\CITY\\DEMO\\Welcome.txt");
		File f1=new File("D:\\CITY\\DEMO\\WelcomeNew.txt");
		boolean val=f.renameTo(f1);
		System.out.println(val);
	}
	
	private static void deleteFile()
	{
		File f1=new File("D:\\CITY\\DEMO\\WelcomeNew.txt");
		boolean val=f1.delete();
		System.out.println(val);
	}
	
	private static void fileCollections()
	{
		File f=new File("D:\\CITY\\DEMO");
		File f1[]=f.listFiles();
		for(int i=0;i<f1.length;i++)
		{
			boolean val=f1[i].isFile();
			if(val==true)
			{
				System.out.println(f1[i].getPath());
			}
		}
	}
	

}

